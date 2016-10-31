package org.xm.littlespring.beans.io;

import org.junit.Assert;
import org.junit.Test;

import java.io.InputStream;

/**
 * @author xuming
 */
public class ResourceLoaderTest {
    @Test
    public void getResource() throws Exception {
        ResourceLoader resourceLoader = new ResourceLoader();
        Resource resource = resourceLoader.getResource("littlespring.xml");
        InputStream inputStream = resource.getInputStream();
        Assert.assertNotNull(inputStream);
    }

}