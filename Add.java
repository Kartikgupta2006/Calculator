package Kartik.Calculator;

import java.util.Scanner;

public class Add {
    Scanner sc= new Scanner(System.in);
    int num = sc.nextInt();
    int add(int sum){
        if(sum ==0){
            return num;
        }
        else{
            return (sum+num);
        }
    }
}
