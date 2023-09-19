package sgin_in;
import java.util.Scanner;
public class demo {
    public static void main(String[] args) {
        //创建原始用户名和密码
        String name = "aiin";
        String password = "xiaomin224/";
        Scanner sr = new Scanner(System.in);
        //三次机会
        for (int i = 0; i < 3; i++) {
            //用户输入用户名和密码
            System.out.println("请输入用户名：");
            String getname = sr.next();

            //判断是否为正确
            boolean dbname = getname.equalsIgnoreCase(name);
            //用户名正确判断密码

            if(dbname){
                System.out.println("请输入密码:");
                String getpassword = sr.next();
                //判断密码是否正确
                boolean pdpass = getpassword.equalsIgnoreCase(password);
                //正确进入，不正确返回错误重新尝试
                if(pdpass){
                    System.out.println("登陆成功");
                    break;
                }
                else{
                    System.out.println("密码错误，重新尝试");
                }
            }
            //用户名不正确返回错误用户名
            else {
                System.out.println("用户名错误请重新尝试");
            }
        }
    }
}
