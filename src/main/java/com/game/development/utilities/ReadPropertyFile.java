package com.game.development.utilities;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

    private Properties prop;


    public ReadPropertyFile() throws IOException {
        this.prop = new Properties();
        FileInputStream ip = new FileInputStream("src/main/resources/config.properties");
        prop.load(ip);
    }

    public Properties getProp() {
        return prop;
    }

}
