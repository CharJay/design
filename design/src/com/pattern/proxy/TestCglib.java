package com.pattern.proxy;

import com.pattern.proxy.bean.Boy;
import com.pattern.proxy.cglib.CgMeipo;

public class TestCglib {
	public static void main(String[] args) {
		
		//JDK的动态代理是通过接口来进行强制转换的
		//生成以后的代理对象，可以强制转换为接口
		
		//CGLib的动态代理是通过生成一个被代理对象的子类，然后重写父类的方法
		//生成以后的对象，可以强制转换为被代理对象（也就是用自己写的类）
		//子类引用赋值给父类
		
		
		try {
			Boy obj = (Boy)new CgMeipo().getInstance(Boy.class);
			obj.findLove();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
