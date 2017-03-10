/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server;

import net.squirrel.poshtar.dto.ListProvider;
import net.squirrel.poshtar.server.post.Post;
import net.squirrel.poshtar.server.providers_dao.ProvidersDAO;
import net.squirrel.poshtar.server.utils.XmlTransforming;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.squirrel.poshtar.server.utils.LogUtils.getContextClass;

public class ImplProvidersManager implements ProvidersManager {
    private static final Logger logger = LoggerFactory.getLogger(getContextClass());
    private ProvidersDAO providersDAO;

    public ImplProvidersManager(ProvidersDAO providersDAO) {
        this.providersDAO = providersDAO;
        logger.trace("Been ImplProvidersManager create");
    }

    @Override
    public String getProviders() throws Exception {
        ListProvider providers = providersDAO.getProviders();
        return XmlTransforming.marshalling(providers);
    }
    @Override
    public Post instancePost(int uid) throws Exception {
        String className = providersDAO.getProvidersClass(uid);
        logger.trace("Attempt to create a class: " + className);
        return (Post) Class.forName(className).newInstance();
    }
}
