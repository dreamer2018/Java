/*************************************************************************
	> File Name: Wolf.java
	> Author: ZhouPan
	> GitHub: dreamer2018
	> Blog: http://blog.csdn.net/it_dream_er
	> Mail: zhoupan@xiyoulinux.org
	> About: 继承测试
	> Created Time: 2017年05月04日 星期四 16时00分15秒
 ************************************************************************/
class Creature{
    public Creature(){
        System.out.println("Creature 的构造器");
    }
}

class Animal extends Creature{
    public Animal(){
        System.out.println("Animal 的构造器");
    }
}

public class Wolf extends Animal{
    public Wolf(){
        System.out.println("Wolf 的构造器");
    }
    public static void main(String[] argv){
        Wolf wolf = new Wolf();
    }
}
