package jinezhuanhuan;
import java.util.Scanner;
public class demo {
    public static void main(String[] args) {

        //键盘录入数据
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字:");
        int orgnumber = sc.nextInt();

        String EndString = zhuanhuan(orgnumber);
        System.out.println(EndString);

    }
    //写一个方法，用来将数字转换成文字
    public static String zhuanhuan(int number){
        char ling = '零';
        char yi = '壹';
        char er = '贰';
        char san = '叁';
        char si = '肆';
        char wu = '伍';
        char liu = '陆';
        char qi = '柒';
        char ba = '捌';
        char jiu = '镹';
        char shi = '拾';
        //先将格式规定好
        //将数字填充到指定位置
        //将数字改为规定汉字
        char[] arr = new char[7];
        String str = " 佰 拾 万 千 佰 拾 ";
        char[] charArray = str.toCharArray();
        String newnumber = String.valueOf(number);
        char[] numberarr = str.toCharArray();

        //将获取的数组填充到模板的对应位置
        for (int i = 0; i < numberarr.length; i++) {
            int j = 12;
            if(j<0) break;
            charArray[j] = numberarr[i];
            j = j-2;
        }

        for (int i = 0; i < 13; i++) {
            System.out.println(charArray[i]);
        }
        for (int i = 0; i < charArray.length; i++) {
            switch (charArray[i]){
                case 0:
                    charArray[i] = ling;
                case 1:
                    charArray[i] = yi;
                case 2:charArray[i] =er ;
                case 3:charArray[i] = san;
                case 4:charArray[i] = si;
                case 5:charArray[i] = wu;
                case 6:charArray[i] = liu;
                case 7:charArray[i] = qi;
                case 8:charArray[i] = ba;
                case 9:charArray[i] = jiu;

            }

        }
        String endString = String.valueOf(charArray);



        return endString;
    }

}
