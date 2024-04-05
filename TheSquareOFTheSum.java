package eOlymp;

import java.util.Scanner;

public class TheSquareOFTheSum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int num=n%10;
        n/=10;
        n+=num;
        int sum=n*n;

        System.out.println(sum);
    }
}
