package com.prowing.scenarios;

public class VarArgScenario {
	

//	    public void test(int i) {
//	        System.out.println("Int");
//	    }
	    public void test(char i) {
	    	System.out.println("char");
	    }

//	    public void test(Character i) {
//	        System.out.println("Character");
//	    }

	    public void test(Integer... i) {
        System.out.println("Integer varargs");
    }
//	    public void test(long... i) {
//	    	System.out.println("long varargs");
//	    }

//	    public void test(int[] nums) {
//	    	System.out.println("Int array");
//	    }
	    
	    public void test(char... c) {
	        System.out.println("Char varargs");
	    }
//	    public void test(Character... c) {
//	        System.out.println("Charater varargs");
//        }
//
//	    public void test(char[] c) {
//	    	System.out.println("Char varargs");
//	    }
	    
	    
	    public static void main(String[] args)
	    {
	    	VarArgScenario obj = new VarArgScenario();
	        Integer i=10;
	        obj.test(i);
//	        int[] nums = {10,20,30};
//	       obj.test(nums);
	       // obj.test(10); 
	       // obj.test('a','k'); 
//	        obj.test(10); 
       // obj.test(10,5,6);
	   //     obj.test('a','e', 'i','o');
	    }
	}


