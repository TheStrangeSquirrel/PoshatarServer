/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.providers_dao.provider_file_storage;

import net.squirrel.poshtar.dto.ListProvider;
import net.squirrel.poshtar.dto.Provider;
import net.squirrel.poshtar.server.providers_dao.ProvidersDAO;
import net.squirrel.poshtar.server.utils.IOUtils;
import net.squirrel.poshtar.server.utils.XmlTransforming;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import static net.squirrel.poshtar.server.utils.LogUtils.getContextClass;

public class FileProviderDAO implements ProvidersDAO {
    private static final Logger logger = LoggerFactory.getLogger(getContextClass());
    private List<ProviderInStorage> providers;
    private String versionProviders;

    public FileProviderDAO(String fileName) {
        logger.trace("Been FileProviderDAO create");
        try (InputStream inputStream = FileProviderDAO.class.getResourceAsStream("/" + fileName) ){
            String xml = IOUtils.toString(inputStream);
            ListProviderInStorage unmarshalling = XmlTransforming.unmarshalling(xml, ListProviderInStorage.class);
            providers = unmarshalling.getProviderInStorage();
            versionProviders = unmarshalling.getVersionProviders();
        } catch (IOException e) {
            logger.error("An error occurred while trying to read a file: {} ", fileName,e);
        } catch (Exception e) {
            logger.error("Exception" ,e);
        }
    }

    @Override
    public String getProvidersClass(int uid) {
        logger.trace("Trying to get the name of the class on id: {}",uid);
        String result = null;
        for(ProviderInStorage provider : providers){
            if (provider.getProvider().getId() == uid){
                result = provider.getClassName();
            }
        }
        return result;
    }

    @Override
    public ListProvider getProviders() {
        logger.trace("Trying to get a list of providers");
        List<Provider> providers =  new ArrayList<>();
        for (ProviderInStorage provider : this.providers){
            if(provider.isSupported()){
                providers.add(provider.getProvider());
            }
        }
        return new ListProvider(versionProviders, providers);
    }

    @Override
    public String getVersionProviders() {
        return versionProviders;
    }
}
