/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.post.gunsel;

import net.squirrel.poshtar.server.post.Post;
import org.junit.Test;

public class PostGunselTest {
    @Test
    public void track() throws Exception {
        Post post = new PostGunsel();
        String ua = post.track("***", "uk");
        System.out.println(ua);
        String ru = post.track("***", "ru");
        System.out.println(ru);
        String en = post.track("***", "en");
        System.out.println(en);
    }

}