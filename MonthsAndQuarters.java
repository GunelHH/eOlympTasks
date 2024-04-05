package eOlymp;

import java.util.Scanner;

public class MonthsAndQuarters {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();

        if (n>=1 && n<=3) {
            System.out.println("First");
        } else if (n>=4 && n<=6) {
            System.out.println("Second");
        } else if (n>=7 && n<=9) {
            System.out.println("Third");
        }else{
            System.out.println("Fourth");
        }
    }
}
