package com.revature;

public class Calculator {
    private int a;
    private int b;

    // WARNING, changing the order of these constructors might make the below statement untrue
    public Calculator(double a, double b) {
        this.a = (int)a;
        this.b = (int)b;
        System.out.println("Constructor: double, double");
    }

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Constructor: int, int");
    }

    // give precednece to string type values, otherwise, from the top
    // So, in this class, it goes String -> Double -> Int
    public Calculator(String a, String b) {
        this.a = Integer.parseInt(a);
        this.b = Integer.parseInt(b);
        System.out.println("Constructor: String, String");
    }

    public void sum(){
        System.out.println("Sum: " + (this.a + this.b));
    }



}
