package com.ht.ioc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class readConfig {
	
	static Properties prop;
	static{
		try {
			String rootPath=getRootPath()+"ioc.properties";
			System.out.println(rootPath);
			prop=new Properties();
			FileInputStream fi=new FileInputStream(rootPath);
			prop.load(fi);
			fi.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	
	 public static String getClassPath(){  
	        if(prop==null)  
	            return null;  
	        return prop.get("kiss").toString();  
	 }  
	 
    @SuppressWarnings("unused")
	private static String getRootPath(){  
        String path=Thread.currentThread().getContextClassLoader().getResource("").getPath();  
        //替换空格产生的%20  
        path=path.replace("%20", " ");    
        return path;  
    }

}
