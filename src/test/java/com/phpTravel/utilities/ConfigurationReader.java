package com.phpTravel.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	private static Properties configFile;
	static { //<-- static means it will run one time in the beginning
		try {
			String path = "configuration.properties";
			FileInputStream inputStream = new FileInputStream(path);
			configFile = new Properties();
			configFile.load(inputStream);

			inputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static String getProperty(String key) {
		return configFile.getProperty(key);
	}

}
