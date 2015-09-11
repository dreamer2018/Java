/*************************************************************************
	> File Name: study_tool.java
	> Author: ZhouPan / github:dreamer2018 
	> Mail: zhoupans_mail@163.com
	> Blog: blog.csdn.net/it_dream_er
	> Created Time: Fri 11 Sep 2015 05:15:42 PM CST
 ************************************************************************/
import java.util.Scanner;
import javax.swing.JOptionPane;

public class study_tool{
    public static void main(String[] args){
        int First_Number,Second_Number,End_Number;
        Scanner s=new Scanner(System.in);
        //产生两个随机数
        First_Number=(int )( System.currentTimeMillis() % 10 );
        Second_Number=(int )( System.currentTimeMillis() * 7 % 10 );
        //打印出提示
        //System.out.println("First_Number is "+First_Number);
        JOptionPane.showMessageDialog(null,"First_Number:"+First_Number+"");
        //System.out.println("Second_Number is "+Second_Number);
        JOptionPane.showMessageDialog(null,"Second_Number:"+Second_Number+"");
        //输出提示
        System.out.print("Input First Number:");
        //获取输入的结果
        End_Number=s.nextInt();
        //判断结果的正确性，并输入提示
        if(End_Number==(First_Number+Second_Number))
        {
            System.out.println("You Are Corrent");
        }
        else
        {
            System.out.println("You Are Incorrent!");
        }
    }
}

