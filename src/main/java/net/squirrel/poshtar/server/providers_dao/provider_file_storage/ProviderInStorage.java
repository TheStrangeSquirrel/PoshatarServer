/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.providers_dao.provider_file_storage;

import net.squirrel.poshtar.dto.Provider;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root
public class ProviderInStorage {
    private Provider provider;
    private boolean supported;
    private String className;
    @Element
    public Provider getProvider() {
        return provider;
    }
    @Element
    public void setProvider(Provider provider) {
        this.provider = provider;
    }
    @Attribute
    public boolean isSupported() {
        return supported;
    }
    @Attribute
    public void setSupported(boolean supported) {
        this.supported = supported;
    }
    @Attribute
    public String getClassName() {
        return className;
    }
    @Attribute
    public void setClassName(String className) {
        this.className = className;
    }
}
