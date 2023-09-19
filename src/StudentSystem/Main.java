package StudentSystem;

public class Main {
    public static void main(String[] args) {
        StudentMessage[] arr = new StudentMessage[3];
        StudentMessage Stu1 = new StudentMessage(001,"tom",18);
        StudentMessage Stu2 = new StudentMessage(002,"Web",19);
        StudentMessage Stu3 = new StudentMessage(003,"Aoo",18);
        arr[0] = Stu1;
        arr[1] = Stu2;
        arr[2] = Stu3;


        StudentMessage Stu4 = new StudentMessage(004,"Avo",18);
        boolean Stupan = panduan(arr,Stu4.getNumber());//判断新的id是不是唯一的(true代表重复
        //获取循环多少次下标多少
        int count = countnumber(arr);
        //创建新的数组，将之前的数组移动到新的数组中
        StudentMessage[] newarr = creat(arr);

        //判断变量
        int ifnewarr = 0;
        if(Stupan){
            System.out.println("id重复");
        }
        else{               //id不重复，判断数组容量

            if(count==arr.length){  //如果等于数组长度需要重新创建
                newarr[count] = Stu4;
                ifnewarr++;
                //printmes(newarr);
            }
            else {
                arr[count] = Stu4;
                //printmes(arr);
            }
        }


        //查找id进行删除
        int id = 1;
        if(ifnewarr!=0){        //判断是否为新的数组
            int findnumberid = findsuoyin(newarr,id);
            if(findnumberid<0){
                System.out.println("未找到id");
            }
            else{
                // 将索引后的元素向前移动一位
                for (int i = findnumberid + 1; i < newarr.length; i++) {
                    newarr[i - 1] = newarr[i];
                }
                newarr[newarr.length - 1] = null;  // 最后一个元素设置为null
                //printmes(newarr);
            }
        }
        else{
            int findnumberid = findsuoyin(arr,id);
            if(findnumberid>=0){
                // 将索引后的元素向前移动一位
                for (int i = findnumberid + 1; i < arr.length; i++) {
                    arr[i - 1] = arr[i];
                }
                arr[arr.length - 1] = null;  // 最后一个元素设置为null
                //printmes(arr);
            }
            else{
                System.out.println("id不存在");
            }

        }

        //查找索引
        int findnumber = findsuoyin(arr,2);
        if(findnumber>=0){ //大于0有索引，对索引进行操作
            int age = arr[findnumber-1].getAge()+1;
            arr[findnumber-1].setAge(age);
            printmes(arr);
        }
        else {      //没有索引，没找到目标
            System.out.println("没找到索引");
        }
    }

    public static boolean panduan(StudentMessage[] arr,int id){  //判断id是否重复
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            StudentMessage st = new StudentMessage();
            int uid = st.getNumber();
            if(uid==id){
                count++;
                return true;
            }
        }
        return false;
    }
    public static int countnumber(StudentMessage[] arr){    //判断数组中有多少空
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=null){
                count++;
            }
        }
        return count;
    }
    public static StudentMessage[] creat(StudentMessage[] arr){     //创建新的数组
        StudentMessage[] newarr = new StudentMessage[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            newarr[i] = arr[i];
        }
        return newarr;
    }
    public static void printmes(StudentMessage[] arr){      //打印信息
        StudentMessage Stu = new StudentMessage();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getName()+","+arr[i].getNumber()+","+arr[i].getAge()+",");
        }
    }
    public static int findsuoyin(StudentMessage[] arr,int id){           //查找索引
        for (int i = 0; i < arr.length; i++) {
            int uid = arr[i].getNumber();
            if(uid==id){
                return i;
            }
        }
        return -1;
    }
    public static int findAge(StudentMessage[] arr,int Age){           //查找年龄
        for (int i = 0; i < arr.length; i++) {
            int uage = arr[i].getAge();
            if(uage==Age){
                return i;
            }
        }
        return -1;
    }
}
