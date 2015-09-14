/*************************************************************************
	> File Name: ComputeBMI.java
	> Author: ZhouPan / github:dreamer2018 
	> Mail: zhoupans_mail@163.com
	> Blog: blog.csdn.net/it_dream_er
	> Created Time: Fri 11 Sep 2015 07:06:51 PM CST
 ************************************************************************/
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ComputeBMI{
    public static void main(String[] args){
        String str_high=JOptionPane.showInputDialog(null,"请输入身高(m):","Message",JOptionPane.PLAIN_MESSAGE);
        float high=Float.parseFloat(str_high);
        String str_weigh=JOptionPane.showInputDialog(null,"请输入体重(kg):","Message",JOptionPane.PLAIN_MESSAGE);
        float weigh=Float.parseFloat(str_weigh);
        double result=weigh/Math.pow(high,2);
        if(result<16)
        {
            JOptionPane.showMessageDialog(null,"严重偏轻！");
        }
        else if(result < 18)
        {
            JOptionPane.showMessageDialog(null,"偏轻！");
        }
        else if(result < 24)
        {
            JOptionPane.showMessageDialog(null,"正常体重！");
        }
        else if(result < 29)
        {
            JOptionPane.showMessageDialog(null,"超重！");
        }
        else if(result < 35)
        {
            JOptionPane.showMessageDialog(null,"严重超重！");
        }
        else
        {   
            JOptionPane.showMessageDialog(null,"非常严重超重！");
        }
    }
}

