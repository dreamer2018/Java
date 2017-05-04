/*************************************************************************
	> File Name: SubClass.java
	> Author: ZhouPan
	> GitHub: dreamer2018
	> Blog: http://blog.csdn.net/it_dream_er
	> Mail: zhoupan@xiyoulinux.org
	> About: 
	> Created Time: 2017年05月04日 星期四 17时01分11秒
 ************************************************************************/

class SuperClass{
    public int a = 100;
    public void run(){
        System.out.println("我在跑!");
    }
    public void base(){
        System.out.println("Base 方法!");
    }
}
public class SubClass extends SuperClass{
    public int b = 200;
    public void run(){
        System.out.println("我在高兴的跑！");
    }
    public static void main(String[] argv){
        SuperClass sc = new SubClass();
 //       System.out.println(sc.b);
    }
    
}
