/*************************************************************************
	> File Name: src_52.java
	> Author: ZhouPan / github:dreamer2018 
	> Mail: zhoupans_mail@163.com
	> Blog: blog.csdn.net/it_dream_er
	> Created Time: Mon 14 Sep 2015 10:18:05 PM CST
 ************************************************************************/

public class src_52{
    public static void main(String[] args){
        float af=5.1234567f;
        System.out.println(af);
        double a=0.0;
        //定义两个不同类型的无穷大数
        
        double c=Double.NEGATIVE_INFINITY;
        float d=Float.NEGATIVE_INFINITY;
        
        //测试两个无穷大数是否相等
        System.out.println(c==d);
        
        //0除于0将出现非数
        
        System.out.println(a/a);
        
        //测试两个非数是否相等
        System.out.println(a/a==Double.NaN);
        System.out.println(a/a==Float.NaN);
        
        //正数除于0得到无穷大
        System.out.println(-6.0/0);

        long l=100_200_300_400L;
        System.out.println(l);
        boolean b1=true;
        boolean b2=false;
        System.out.println(b1);
        System.out.println(b1!=b2);

    }
}

