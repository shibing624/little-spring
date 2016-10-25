package org.xm.littlespring.beans.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author xuming
 */
public interface Resource {
    InputStream getInputStream() throws IOException;
}
