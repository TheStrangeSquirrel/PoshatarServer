/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server;

import net.squirrel.poshtar.dto.ServerSettings;
import net.squirrel.poshtar.server.providers_dao.ProvidersDAO;
import net.squirrel.poshtar.server.utils.XmlTransforming;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import static net.squirrel.poshtar.server.utils.LogUtils.getContextClass;

public class ImplSettingsManager implements SettingsManager {
    private static final Logger logger = LoggerFactory.getLogger(getContextClass());
    private static final String FILE_NAME = "settings.xml";
    private static final String FUTURE_URL = "FutureUrl";


    private String currentVersion;
    private ServerSettings settings;
    private String futureUrl;


    public ImplSettingsManager(ProvidersDAO providersDAO) {
        currentVersion = providersDAO.getVersionProviders();
        futureUrl = reedUrl();
        settings = new ServerSettings(currentVersion, futureUrl);
        logger.info("Settings set");
    }

    private String reedUrl() {
        Properties properties = new Properties();
        InputStream inputStream = ImplSettingsManager.class.getResourceAsStream("/" + FILE_NAME);
        try {
            properties.loadFromXML(inputStream);
        } catch (IOException e) {
            logger.error("An error occurred while trying to read a file: {} ", FILE_NAME, e);
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                //NOP
            }
        }
        return properties.getProperty(FUTURE_URL);
    }

    @Override
    public String getXmlServerSettings() throws Exception {
        return XmlTransforming.marshalling(settings);
    }
}
