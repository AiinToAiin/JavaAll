package packenew;

import java.util.ArrayList;

public class demo {
    public static void main(String[] args) {
        ArrayList<Stufent> list = new ArrayList<>();


        Stufent S1 = new Stufent("账号三",12);
        Stufent S2 = new Stufent("账号四",12);
        Stufent S3 = new Stufent("账号伍",12);

        list.add(S1);
        list.add(S2);
        list.add(S3);

        for (int i = 0; i < list.size(); i++) {
            Stufent s = list.get(i);
            System.out.println(s.getName()+s.getAge());
        }


    }
}
