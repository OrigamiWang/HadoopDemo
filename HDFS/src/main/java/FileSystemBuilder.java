import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * @BelongsProject: Hadoop
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Origami
 * @Date: 2023/5/13 16:14
 */
public class FileSystemBuilder {
    private String hdfsUri;
    private String userName;

    public FileSystemBuilder setHdfsUri(String hdfsUri) {
        this.hdfsUri = hdfsUri;
        return this;
    }

    public FileSystemBuilder setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public FileSystem build() {
        try {
            return FileSystem.get(new URI(hdfsUri), new Configuration(), userName);
        } catch (IOException | InterruptedException | URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

}
