/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.post.delivery;

import net.squirrel.poshtar.server.post.Post;
import org.junit.Test;

public class DeliveryPostTest {
    @Test
    public void track() throws Exception {
        Post post = new PostDelivery();
        String ua = post.track("***", "uk");
        System.out.println(ua);
        String ru = post.track("1111111111", "ru");
        System.out.println(ru);
        String en = post.track("ваываываываваы", "en");
        System.out.println(en);
    }

}