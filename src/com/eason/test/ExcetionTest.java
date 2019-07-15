package com.eason.test;

public class ExcetionTest {

	public static void main(String[] args) {
		try {
			test();
		} catch (ExceptionOne e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void test() throws ExceptionOne{
		int i = 1;
		if (i==0) {
			try {
				getExceptionTwo();
			} catch (ExceptionTwo e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new ExceptionOne("one two");
			}
		}
		
	}

	private static void getExceptionTwo() throws ExceptionTwo{
		throw new ExceptionTwo("two");
	}

}
