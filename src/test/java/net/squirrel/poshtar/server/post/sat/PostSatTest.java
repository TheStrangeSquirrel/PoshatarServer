package net.squirrel.poshtar.server.post.sat;

import net.squirrel.poshtar.server.post.Post;
import net.squirrel.poshtar.server.post.gunsel.PostGunsel;
import org.junit.Test;

import static org.junit.Assert.*;

public class PostSatTest {
    @Test
    public void track() throws Exception {
        Post post = new PostSat();
        String t2 = post.track("012003721", "uk");
        System.out.println(t2);
        String t1 = post.track("5904091", "uk");
        System.out.println(t1);
    }

}