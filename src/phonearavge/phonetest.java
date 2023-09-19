package phonearavge;
import phonearavge.phonedemo;
public class phonetest {
    public static void main(String[] args) {
        phonedemo Phone = new phonedemo();
        phonedemo[] arr = new phonedemo[3];
        arr[0] = new phonedemo("huawei",1200,"huise");
        arr[1] = new phonedemo("apple",2999,"baise");
        arr[2] = new phonedemo("xiaomi",1999,"lanse");

        int all = 0;
        for (int i = 0; i < arr.length; i++) {
            phonedemo c = arr[i];

            all+= c.getNumber();
        }

        double aravge = all*1.0/arr.length;
        System.out.println("平均值为:"+aravge);
    }

}
