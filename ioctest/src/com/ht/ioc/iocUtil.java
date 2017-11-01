package com.ht.ioc;

public class iocUtil {
	
	public static Object getBean() {	
	    //通过外部容器来获得类实例化的路径
		String beanpath=readConfig.getClassPath();
		try {
			return (Object)Class.forName(beanpath).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}

}
