package practice1_truongtansang.chuong2.bai1;

import java.util.Scanner;

public class Diem {
    private int x, y;
    public Diem(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Diem() {
        x = 0;
        y = 0;
    }
    public void Nhap (){
        Scanner sc=new Scanner (System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        sc.close();
    }
    public void Xuat (int x,int y)
    {
        System.out.println("x:"+x);
        System.out.println("y:"+y);
    }
    public void dichuyen (int x,int y)
    {
        this.x+=x;
        this.y+=y;
    }


}
