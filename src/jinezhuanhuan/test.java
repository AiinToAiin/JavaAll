package jinezhuanhuan;

public class test
{
    public static void main(String[] args) {
        int number = 123;
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

        char i = 4;
        charArray[0] = i;
        for (int i1 = 0; i1 < charArray.length; i1++) {
            System.out.println(charArray[i]);
        }
       /* //将获取的数组填充到模板的对应位置
        for (int i = 0; i < numberarr.length; i++) {
            int j = 12;
            if(j<0) break;
            charArray[j] = numberarr[i];
            j = j-2;
        }

        for (int i = 0; i < 13; i++) {
            System.out.println(charArray[i]);
        }

        */
    }
}
