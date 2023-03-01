package com.prowing.scenarios;


	
 public class L4 extends Scenario4{
		public void get() {
			System.out.println("inside P");
		}
		
		
		public int get(long a) {
			System.out.println("a long ");
			return 10;
		}
	

		public static void main(String[] args) {
			L4 p= new L4();
               p.get();
               p.get(10);
               p.get(10l);
		}
 }

