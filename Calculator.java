package Kartik.Calculator;

import java.util.Scanner;

class Calculator {

    public static void main(String[] args) {
        int Sum=0;
        while(true) {

            Scanner sc = new Scanner(System.in);
            System.out.println("1. Add ");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Display");
            System.out.print("Enter your choice: ");
             int choice = sc.nextInt();

             switch (choice) {
                 case 1: {
                    Add add = new Add();
                      Sum = add.add(Sum);
                     break;
                }
                 case 2:{
                     Sub sub = new Sub();
                     Sum = sub.sub(Sum);
                     break;
                 }
                 case 3:{
                     Mul mul = new Mul();
                     Sum = mul.mul(Sum);
                     break;
                 }
                 case 4:{
                     Div div = new Div();
                     Sum = div.div(Sum);
                     break;
                 }

                 case 5:{
                     System.out.println(Sum);
                     break;
                 }
                 default:
                     System.out.println("wrong choice");
            }
        }
    }

 }
