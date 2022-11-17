package com.teampractice.genericutilities;

import java.io.FileInputStream;
import java.util.Properties;

public class FileUtility {
	
	public String getFileData(String key) throws Throwable {
		FileInputStream fis = new FileInputStream("./");
		Properties pro = new Properties();
		pro.load(fis);
		return pro.getProperty(key);
	}

}