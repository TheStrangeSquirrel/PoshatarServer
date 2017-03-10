/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.post.meest_express;

import net.squirrel.poshtar.server.post.Post;
import org.junit.Test;

public class PostMeestExpressTest {
    @Test
    public void track() throws Exception {
        Post post = new PostMeestExpress();
        String ru = post.track("***", "ru");
        System.out.println(ru);
        String ru2 = post.track("***", "ru");
        System.out.println(ru2);
    }

}