package eOlymp;

import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();

        if (a==b && a==c) {
            System.out.println(1);
        } else if (a==b || a==c || b==c) {
            System.out.println(2);
        }else{
            System.out.println(3);
        }
    }
}
