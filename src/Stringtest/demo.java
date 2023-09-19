package Stringtest;

public class demo {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println('['+fnagfa(arr)+']');
    }

    //定义一个方法用来将int数组中的数据返回字符串
    //需要传递数组
    public static String fnagfa(int[] arr){
        //将传递进来的数组单独提取出来
        StringBuilder str = new StringBuilder();//使用容器将数组中的元素添加进去
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                str.append(arr[i]);//最后一次不加，
                break;
            }else
            {
                str.append(arr[i]);//数子后面添加，
                str.append(',');
            }

        }
        String a = str.toString();//将容器数据类型变为String
        return a;

    }
}
