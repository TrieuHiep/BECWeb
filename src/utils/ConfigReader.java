package utils;

import model.userpkg.FullName;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.StringTokenizer;

public class ConfigReader {
    private static final ConfigReader instance = new ConfigReader();
    private Properties properties;

    private ConfigReader() {
        properties = new Properties();
        try {
            properties.load(
                    this.getClass().getClassLoader()
                            .getResourceAsStream("MySQL_DBInfo.prop"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String host = properties.getProperty("hostName");
        System.out.println(host);
    }

    public String getProperty(String propertyName) {
        return properties.getProperty(propertyName);
    }

    public synchronized static ConfigReader getInstance() {
        return instance;
    }

}

