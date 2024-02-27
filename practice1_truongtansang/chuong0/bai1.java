package practice1_truongtansang.chuong0;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        int x,y;
        Scanner sc=new Scanner (System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        System.out.println("x+y="+(x+y));
        System.out.println("x+y="+(x-y));
        System.out.println("x+y="+(x*y));
        System.out.println("x+y="+ ((double)x / y));
        sc.close();
    }
}
