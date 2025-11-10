package com.example;

public class PruebaSmells {
	
	public void doSomething() {
        System.out.println("Debug info"); // S106
    }

    public void duplicateCode1() {
        System.out.println("Debug info");
    }

    public void duplicateCode2() {
        System.out.println("Debug info");
    }

    public void catchGeneric() {
        try {
            throw new Exception("Error"); // S00112
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
