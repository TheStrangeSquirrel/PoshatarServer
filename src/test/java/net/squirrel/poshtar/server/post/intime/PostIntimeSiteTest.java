/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.post.intime;

public class PostIntimeSiteTest {
    @org.junit.Test
    public void track() throws Exception {
        String track = new PostIntimeSite().track("***", "ru");
        System.out.println(track);
        String track2 = new PostIntimeSite().track("***", "ru");
        System.out.println(track2);
    }
}