package com.inderbagga.interoperability.jink;

public class JavaModel {

    private  int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int addition(int a,int b){return a+b;}

    public String any(){return "just a string!";}

    public static void display() {
        System.out.println("Static display!");
    }

    public void anotherFunction(String str,int... numbers) {
        System.out.println("Passed string is " + str);
        for (int n : numbers) {
            System.out.print(" "+n);
        }
    }

    public int compute(int[] array)
    {
        int result=0;

        for(int a: array){
            result = result + a;
        }
        return result;
    }
}
