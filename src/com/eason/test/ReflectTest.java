package com.eason.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectTest {

	public static void main(String[] args) {
		
		ReflectWithSingleton singleton = ReflectWithSingleton.get();
		Class singleClass = singleton.getClass();
		System.out.println(singleton.toString());
		System.out.println(singleton.hashCode());
		System.out.println(Integer.toHexString(singleton.hashCode()));
		
		try {
			Constructor<?>[] constructors = ReflectWithSingleton.class.getDeclaredConstructors();
			for (Constructor<?> constructor : constructors) {
				if (Modifier.isPrivate(constructor.getModifiers())) {
					constructor.setAccessible(true);
					
					Class<?>[] clazzs = constructor.getParameterTypes();
					if (clazzs.length != 0) {
						continue;
					}
					
					Object object = constructor.newInstance();
					if (object instanceof ReflectWithSingleton) {
						System.out.println(((ReflectWithSingleton)object).toString());
						System.out.println((object.hashCode()));
						System.out.println(Integer.toHexString(object.hashCode()));
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			Method method = singleClass.getDeclaredMethod("init", String.class);
			if (method != null) {
				method.setAccessible(true);
				method.invoke(singleton, "tom");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
