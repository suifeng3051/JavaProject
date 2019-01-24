package utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Properties;

/**
 * @auther wanghouda
 * @Date 2019/1/15
 * @Description
 */
public class PropertiesUtils {

    public static void saveProperties() {
        try {
            Properties props = new Properties();
            props.setProperty("ServerAddress", "asdf");

            props.setProperty("ServerPort", ""+"8080");
            props.setProperty("ThreadCount", ""+"33");
            File f = new File("server.properties");
            OutputStream out = new FileOutputStream( f );
            props.store(out, "This is an optional header comment string");
        }
        catch (Exception e ) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        saveProperties();
    }
}
