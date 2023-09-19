package shuzu;
import shuzu.test;
public class ceshi {
    public static void main(String[] args) {
        test[] arr = new test[3];

        test g1 = new test("001","cup",30.2,3);
        test g2 = new test("002","apple",3330.2,3);
        test g3 = new test("003","zte",1230.2,3);

        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;

        for (int i = 0; i < arr.length; i++) {
            test hello = arr[i];
            System.out.println(hello.getName()+","+hello.getId()+","+hello.getCun()+","+hello.getJiage());
        }

    }
}
