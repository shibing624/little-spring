package org.xm.littlespring.beans.io;

import java.net.URL;

/**
 * @author xuming
 */
public class ResourceLoader {
    public Resource getResource(String location){
        URL resource = this.getClass().getClassLoader().getResource(location);
        return new UrlResource(resource);
    }
}
