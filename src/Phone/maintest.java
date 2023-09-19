package Phone;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class maintest {
    public static void main(String[] args) {
        ArrayList<demo> list= new ArrayList<>();
        demo P1  = new demo("小米",1000);
        demo P2  = new demo("苹果",8000);
        demo P3  = new demo("锤子",2999);
        //添加到集合中
        list.add(0,P1);
        list.add(1,P2);
        list.add(2,P3);

        //chazhaoxiaoyv(list);

        printtest pt = new printtest();
        pt.printhh();


        //定义方法用来将价格低于3000的手机信息返回
        for (int i = 0; i < list.size(); i++) {
            demo dd = list.get(i);
            small(dd,10000);
        }


    }

    //定义方法，需要手机的价格,返回值应该是对象类型
    public static demo small(demo hh ,int number){
        demo kong = new demo();
        boolean buer =hh.getNumber()<number;
        if(buer){
            System.out.println(hh.getName()+hh.getNumber());
            return hh;
        }

        return kong;
    }



    //定义方法，使用链表
    public static void chazhaoxiaoyv(ArrayList<demo> list){
        for (int i = 0; i < list.size(); i++) {
            demo hh = list.get(i);
            if(hh.getNumber()<3000){
                System.out.println(hh.getName()+hh.getNumber());
            }
        }
    }

}
