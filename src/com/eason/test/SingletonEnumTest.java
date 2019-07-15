package com.eason.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SingletonEnumTest {
	
	public static void main(String[] args) {
		File file = new File("singletonEnum");
	    ObjectOutputStream oos = null;
	    ObjectInputStream ois = null;

	    try {
			oos = new ObjectOutputStream(new FileOutputStream(file));
			SingletonC singleton = SingletonC.INSTANCE;
			System.out.println(singleton.name());
			System.out.println(singleton.ordinal());
			System.out.println(singleton.toString());
			
//			System.out.println(SingletonD.INSTANCE.name());
			
			oos.writeObject(SingletonC.INSTANCE);
			oos.close();
			ois = new ObjectInputStream(new FileInputStream(file));
			SingletonC singleton2 = (SingletonC) ois.readObject();
			System.out.println(singleton == singleton2);
			
			SingletonC singleton3 = SingletonC.valueOf("INSTANCE");
			System.out.println(singleton3 == singleton);
			SingletonC.values();
			
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

enum SingletonC {
    INSTANCE;
    private String field;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

}
enum SingletonD {
	INSTANCE;
	private String field;
	
	public String getField() {
		return field;
	}
	
	public void setField(String field) {
		this.field = field;
	}
	
}