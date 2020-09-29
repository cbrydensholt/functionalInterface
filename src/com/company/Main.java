package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Main {


    public static void main(String[] args) {
	// write your code here
        streamutil streamutil1 = new streamutil();

        streamutil1.makeList();
        streamutil1.filterList();

        greetings greetings1 = x -> "hi " + x;
        System.out.println(greetings1.greeting("Christoffer"));

        twoparam twoparam1 = (num1, num2) -> num1*num2;
        int multiplyresult = twoparam1.multiply(25,55);
        System.out.println(multiplyresult);

        noparam noparam1 = () -> System.out.println("Hello, No params found :-(");
        noparam1.greet();


    }
}
