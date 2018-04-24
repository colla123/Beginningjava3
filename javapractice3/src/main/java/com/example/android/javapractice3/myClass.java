package com.example.android.javapractice3;

public class myClass {

    public static void main(String[] args) {
        int change = getMilk(6, 50);
        System.out.println("Hello Master, your change is " + change + " pounds");

    }

    public static int getMilk(int noOfCartonstobuy, int startingAmount){

        int priceToPay = noOfCartonstobuy * 2;

        System.out.println("Open Door");
        System.out.println("Walk to Store");
        System.out.println("Buy " + noOfCartonstobuy + " milk on the ground floor");
        System.out.println("Pay " + priceToPay + " pounds. but no more.");
        System.out.println("Return home with milk galore");

        return startingAmount - priceToPay;

    }
}
