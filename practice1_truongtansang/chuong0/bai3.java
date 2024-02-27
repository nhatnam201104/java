package practice1_truongtansang.chuong0;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        final double PI=3.14;
        int r;
        double s,c;
        Scanner sc= new Scanner (System.in);
        r=sc.nextInt();
        s=PI*Math.pow(r, 2);
        System.out.println("Dien tich hinh tron=" +s);
        c=r*PI*2;
        System.out.println("Chu vi hinh chu nhat" + c);
        sc.close();

    }
}
