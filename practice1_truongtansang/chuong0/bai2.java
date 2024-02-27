package practice1_truongtansang.chuong0;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        int cd,cr;
        long s,c;

        Scanner sc=new Scanner (System.in);

        System.out.println("Nhap chieu dai");
        cd=sc.nextInt();

        System.out.println("nhap chieu rong");
        cr=sc.nextInt();

        s=dientich (cd,cr);
        System.out.println("dien tich hinh chu nhat:"+s);
        
        c=chuvi(cd, cr);
        System.out.println("chu vi hinh chu nhat:"+c);
        sc.close();
        
    }
    public static long dientich (int cd,int cr)
    {
        return cd*cr;
    }
    public static long chuvi (int cd,int cr)
    {
        return (cd+cr)*2;
    }

}
