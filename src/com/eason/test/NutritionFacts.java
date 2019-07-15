package com.eason.test;

public class NutritionFacts {
	
	public static void main(String[] args) {
		NutritionFacts facts = new NutritionFacts.Builder(2, 3).builder();
	}
	
	private final int a;
	private final int b;
	private final int c;
	
	public static class Builder {
		private  int a;
		private  int b;
		private  int c = 0;
		
		public Builder(int a, int b) {
			this.a = a;
			this.b = b;
		}
		
		public Builder c(int c) {
			this.c = c;
			return this;
		}
		
		public NutritionFacts builder() {
			return new NutritionFacts(this);
		}
	}
	
	public NutritionFacts(Builder builder) {
		a = builder.a;
		b = builder.b;
		c = builder.c;
	}

}
