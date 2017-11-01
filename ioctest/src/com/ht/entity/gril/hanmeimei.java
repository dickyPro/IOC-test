package com.ht.entity.gril;
import com.ht.entity.boy.*;
import com.ht.ioc.iocUtil;

public class hanmeimei {
	public void kiss(){
		System.out.println("to kiss");
		kissable ka= (kissable)iocUtil.getBean();
		ka.kiss();
	}
}
