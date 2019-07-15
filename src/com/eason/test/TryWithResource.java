package com.eason.test;

import java.io.IOException;

public class TryWithResource implements AutoCloseable{
	
	public static void main(String[] args) throws Exception {
		try (TryWithResource resource = new TryWithResource()) {
			resource.doSome();
		} catch (IOException e) {
			System.out.println("doSome IOException");
		}
	}

	@Override
	public void close() throws Exception {
		System.out.println("colse");
	}
	
	public void doSome() throws IOException {
		System.out.println("doSome");
		throw new IOException();
	}
	

}
