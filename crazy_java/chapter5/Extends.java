/*************************************************************************
	> File Name: Extends.java
	> Author: ZhouPan
	> GitHub: dreamer2018
	> Blog: http://blog.csdn.net/it_dream_er
	> Mail: zhoupan@xiyoulinux.org
	> About: 
	> Created Time: 2017年05月15日 星期一 17时08分43秒
 ************************************************************************/
class Base{
    public Base(){
        test();
    }

    private void test(){
        System.out.println("被子类重写的方法！");
    }
}

public class Extends extends Base{
    private String name;
    public void test(){
        System.out.println(name.length());
    }
    public static void main(String[] args){
        Extends e = new Extends();
    }
}

