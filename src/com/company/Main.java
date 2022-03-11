package com.company;

public class Main {
    public void hey(){
        System.out.println("Hej med dig");
        hellodear();
    }

    public static class New {
        public void yes(){
            System.out.println("Gang Gang");
        }
    }
public void hellodear(){
    System.out.println("Hvad skal der ske");
}
    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello dear");
        System.out.println("hello");
        System.out.println("Yii");
Main obj = new Main();
obj.hey();

New objekt = new New();
objekt.yes();

obj.hellodear();


    }
}
