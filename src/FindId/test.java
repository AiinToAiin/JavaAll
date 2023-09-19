package FindId;

import java.util.ArrayList;

public class test {
    public static void  main(String[] args) {
        //创建一个集合，里面存储的是用户对象
        ArrayList<demo> list = new ArrayList<>();
        //新建对象信息
        demo S1 = new demo(1,"zhangsan","111");
        demo S2 = new demo(2,"lisi","111");
        demo S3 = new demo(3,"wangwu","111");
        //将对象信息存储到集合中
        list.add(0,S1);
        list.add(1,S2);
        list.add(2,S3);
        //写方法用来查找id

        demo ss = new demo();
        for (int i = 0; i < list.size(); i++) {
            ss = list.get(i);
            if(findid(ss,3)){
                System.out.println(true);
            }
            else{
                System.out.println(false);
            }
        }



    }
        //写一个返回值为布尔类型的方法，需要获取id信息
    public static boolean findid(demo hh,int find){
        //判断id和需要查找的id
          if(hh.getId()==find){
              return true;
          }
          else{
          }
        return false;

    }
}
