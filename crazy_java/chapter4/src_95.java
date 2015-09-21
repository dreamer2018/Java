/*************************************************************************
	> File Name: src_95.java
	> Author: ZhouPan / github:dreamer2018 
	> Mail: zhoupans_mail@163.com
	> Blog: blog.csdn.net/it_dream_er
	> Created Time: Mon 21 Sep 2015 08:21:17 PM CST
 ************************************************************************/


class Person{
    public int age;
    public double hight;

    public void info(){
        System.out.println("我的年龄是"+age+"，我的身高是"+hight);
    }
}

public class src_95{
    public static void main(String[] args){
        Person[] students;
        students = new Person[2];
        Person zhang=new Person();
        Person zhou=new Person();
        zhang.age=19;
        zhang.hight=165;
        zhou.age=20;
        zhou.hight=176;
        zhang.info();
        zhou.info();
        students[0]=zhang;
        students[1]=zhou;
        students[0].info();
        students[1].info();
    }
}
