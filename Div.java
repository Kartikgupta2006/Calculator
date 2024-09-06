package Kartik.Calculator;

import java.util.Scanner;


    public class Div {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        int div(int sum){
            if(sum ==0){
                return num;
            }
            else{
                return (sum/num);
            }
        }
}
