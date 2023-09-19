package Carclass;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Car[]  c = new Car[3];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < c.length; i++) {
            Car b = new Car();
            System.out.println("请输入汽车名字:");
            String Carname = sc.next();
            b.setName(Carname);

            System.out.println("请输入价格:");
            int Carjiage = sc.nextInt();
            b.setPrice(Carjiage);

            System.out.println("请输入人颜色:");
            String Carcolor = sc.next();
            b.setColor(Carcolor);
            c[i] = b;

        }
        for (int i = 0; i < c.length; i++) {
            Car car = c[i];
            System.out.println(car.getName()+","+car.getColor()+","+car.getPrice());
        }



    }
}
