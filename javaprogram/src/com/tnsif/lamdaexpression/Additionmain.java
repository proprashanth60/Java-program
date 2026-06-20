package com.tnsif.lamdaexpression;

interface Cube{
    int calculate(int a);    
}

public class Additionmain {
public static void main(String[] args) {
    Cube c=(a)->{return (a*a*a);};
    System.out.println("cube of a number :"+c.calculate(2));
}
}


