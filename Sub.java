package Kartik.Calculator;

import java.util.Scanner;

public class Sub {
    Scanner sc= new Scanner(System.in);
    int num = sc.nextInt();
    int sub(int sum){
        if(sum ==0){
            return num;
        }
        else{
            return (sum-num);
        }
    }
}
