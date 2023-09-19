package StudentSystemMax;

import java.util.ArrayList;
import java.util.Scanner;

public class demo {

    public static void main(String[] args) {
        Zhanghao Zhang = new Zhanghao();
        StudentMassage Stu = new StudentMassage();
        ArrayList<StudentMassage> list = new ArrayList<>();
        ArrayList<Zhanghao> ZhuCe = new ArrayList<>();
        int n = 0;
        while (true) {
            //登录界面
            int xuan = Denglu();
            switch (xuan) {
                case 1:
                    zhuce(ZhuCe, Zhang);//注册账号完结
                    break;
                case 2:
                    if (SignIn(ZhuCe, Zhang)) {//登录成功进入菜单
                        //主菜单
                        while (n == 0) {
                            switch (zhucaidan()) {
                                case 1: //1.添加学生
                                    list = addStu(list);
                                    break;
                                case 2://2.删除学生
                                    list = delStu(list, Stu);
                                    break;
                                case 3://3.修改学生
                                    list = change(list, Stu);
                                    break;
                                case 4://4.查询学生
                                    String all = findStu(list, Stu);
                                    System.out.println(all);
                                    break;
                                case 5:
                                    n++;
                                    //5.退出
                                    break;
                                case 6:
                                    //直接打印所有用户
                                    allMas(list, Stu);
                                    break;
                            }
                        }

                    } else break;
            }
        }
                }






    //主菜单
    public static int zhucaidan(){
        System.out.println("----------欢迎来到黑马学生管理系统---------");
        System.out.println("1.添加学生");
        System.out.println("2.删除学生");
        System.out.println("3.修改学生");
        System.out.println("4.查询学生");
        System.out.println("5.退出");
        System.out.println("请输入您的选择：");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        return number;
    }
    //1.添加学生
    public static ArrayList<StudentMassage> addStu(ArrayList<StudentMassage> list){
        StudentMassage Stu = new StudentMassage();

        System.out.println("请输入学生id：");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();//键盘输入id将id在对象中修改
        for (int i = 0; i < list.size(); i++) {
            Stu = list.get(i);      //判断id唯一性
            if(id==Stu.getId()) {
                System.out.println("id重复。重新添加");
                return list;
            }
        }

        Stu.setId(id);

        System.out.println("请输入学生姓名：");
        String name = sc.next();
        Stu.setName(name);

        System.out.println("请输入年龄:");
        int age = sc.nextInt();
        Stu.setAge(age);

        System.out.println("请输入地址：");
        String add = sc.next();
        Stu.setAdd(add);

        list.add(Stu);      //在集合中添加Stu对象
        System.out.println("添加学生成功！");
        return list;

    }




    //2.删除学生
    public static ArrayList<StudentMassage> delStu(ArrayList<StudentMassage> list,StudentMassage Stu){

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要删除的学生id：");
        int Uid = sc.nextInt();

        for (int i = 0; i < list.size(); i++) {
            Stu = list.get(i);
            if(Stu.getId()==Uid){
                System.out.println("删除成功！");
                list.remove(i);
                return list;
            }
            else{

            }
        }
        System.out.println("为找到id，删除失败，请重试!");
        return list;

    }



    //3.修改学生
    public static ArrayList<StudentMassage> change(ArrayList<StudentMassage> list,StudentMassage Stu){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要修改的学生id:");
        int Uid = sc.nextInt();//键盘录入id信息
        //通过集合循环来找到集合中与id相同的信息，然后修改
        for (int i = 0; i < list.size(); i++) {
            Stu = list.get(i);
            if(Stu.getId()==Uid){
                System.out.println("请输入学生id：");
                int id = sc.nextInt();//键盘输入id将id在对象中修改
                Stu.setId(id);

                System.out.println("请输入学生姓名：");
                String name = sc.next();
                Stu.setName(name);

                System.out.println("请输入年龄:");
                int age = sc.nextInt();
                Stu.setAge(age);

                System.out.println("请输入地址：");
                String add = sc.next();
                Stu.setAdd(add);
                list.remove(i);

                list.add(Stu);      //在集合中添加Stu对象
                System.out.println("修改成功！");
                return list;
            }
            else{
            }

        }
        System.out.println("为找到id，修改失败，请重试!");

        return list;
    }



    //4.查询学生
    public static String findStu(ArrayList<StudentMassage> list,StudentMassage Stu){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要查询学生的id：");
        int Uid = sc.nextInt();

        for (int i = 0; i < list.size(); i++) {
            Stu = list.get(i);
            if(Uid==Stu.getId()){
                String all = Stu.getName()+Stu.getId()+Stu.getAdd()+Stu.getAge();
                return all;
            }
            else{

            }
        }
        return "未找到学生";
    }


    //打印所有学生信息
    public static String allMas(ArrayList<StudentMassage> list,StudentMassage Stu){
        if(list.size()==0){
            return "没有信息，请添加";
        }
        else{
            for (int i = 0; i < list.size(); i++) {
                Stu = list.get(i);
                String allMas = Stu.getId()+Stu.getName()+Stu.getAge()+Stu.getAdd();
                return allMas;
            }
        }

        return "";

    }

    //注册账号
    public static ArrayList<Zhanghao>  zhuce(ArrayList<Zhanghao> list,Zhanghao Zhang){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String Name = sc.next();//键盘获取用户名
        //对键盘获取的用户名进行处理
        //长度在3-13之间
        int nameleath = Name.length();
        if(3<nameleath&&nameleath<13){
            //满足用户名条件
            System.out.println("请输入密码：");
            String PassWord = sc.next();//键盘获取用户名
            Zhang.setName(Name);
            //判断密码格式
            //需要有大小写和数字
            int da = 0;
            int xiao = 0;
            int shu = 0;
            for (int i = 0; i < PassWord.length(); i++) {
                char[] Zhuan = PassWord.toCharArray();
                boolean Da = 'A'<=Zhuan[i]&&Zhuan[i]<'Z';//判断是否有大写
                if(Da) da++;
                boolean Xiao = 'a'<=Zhuan[i]&&Zhuan[i]<'z';//判断是否有小写
                if(Xiao) xiao++;
                boolean Shu =0<=Zhuan[i]&&Zhuan[i]<9;//判断是都有数字
                if(Shu) shu++;
            }
            if(da>0&&xiao>0&&shu>0){
                Zhang.setPassWord(PassWord);
                list.add(Zhang);//将账号对象添加到数组中
                System.out.println("密码创建成功");
                return list;
            }
            else {
                System.out.println("密码格式错误，请重新输入");
                return list;
            }


        }else{
            System.out.println("用户名格式错误，请重新输入");
        }

        return list;
    }

    //登录账号
    public static boolean SignIn(ArrayList<Zhanghao> list,Zhanghao Zhang){
        //需要和现有的账号和密码进行对比，一一对应可以登录
        //返回值可以返回布尔类型，最后对返回的值进行判断
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名:");
        String Name = sc.next();
        System.out.println("请输入密码:");
        String Password = sc.next();
        for (int i = 0; i < list.size(); i++) {
            Zhang = list.get(i);
            if(Zhang.getName().equalsIgnoreCase(Name)||Zhang.getPassWord().equalsIgnoreCase(Password)){
                System.out.println("登陆成功");
                return true;
            }
        }
        System.out.println("用户名或密码错误");
        return false;


    }

    //登录界面
    public static int Denglu(){
        System.out.println("----------登录界面-----------");
        System.out.println("1.注册");
        System.out.println("2.登录");
        Scanner sc = new Scanner(System.in);
        int xuan = sc.nextInt();
        return xuan;

    }

}
