package fr.epita.biostat.services;

import fr.epita.biostat.services.exceptions.IncorrectConfigurationException;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationService {

    private final Properties properties;

    private static ConfigurationService instance;

    public static ConfigurationService getInstance() throws IncorrectConfigurationException {
        if (instance == null){
            instance = new ConfigurationService();
        }
        return instance;
    }

    private ConfigurationService() throws IncorrectConfigurationException {
        File file = new File(System.getProperty("conf.file"));
        this.properties = new Properties();
        try {
            properties.load(new FileInputStream(file));
        } catch (IOException e) {
            throw new IncorrectConfigurationException(e);
        }
    }

    public String getValue(String s) {
       return this.properties.getProperty(s);
    }
}
