package com.onebill.reinvent;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

public class ReadPropertyFile {

	  public  void  readProp(String propPath) throws IOException{
		FileReader read = null;
		
		try {
			read = new FileReader(propPath);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Properties prop= new Properties();
		prop.load(read);
		
//		HashMap<String, Integer> map = new HashMap<String, Integer>();
//		map.put(prop.getProperty(key), );
		
		
		
		System.out.println(prop.getProperty("Name"));
		System.out.println(prop.getProperty("Address"));
		System.out.println(prop.getProperty("phone"));
		System.out.println(prop.getProperty("email"));
		
		
		
	}
	
}
