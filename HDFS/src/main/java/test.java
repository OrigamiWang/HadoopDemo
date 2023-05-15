import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.LocatedFileStatus;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.fs.RemoteIterator;

import java.io.IOException;

/**
 * @BelongsProject: Hadoop
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Origami
 * @Date: 2023/5/13 16:17
 */
public class test {
    public static void main(String[] args) throws IOException {
        String hdfsUri = "hdfs://Hadoop102:8020";
        String userName = "origami";
        String dirPath = "/xiyou/huaguoshan/";

        FileSystem fs = new FileSystemBuilder()
                .setHdfsUri(hdfsUri)
                .setUserName(userName)
                .build();
//        fs.mkdirs(new Path(dirPath));
        fs.delete(new Path(dirPath), true);
//        fs.copyFromLocalFile(new Path("D:\\code\\Hadoop\\HDFS\\src\\main\\java\\1.txt"), new Path("hdfs://Hadoop102/xiyou/huaguoshan"));
        fs.close();

    }
}
