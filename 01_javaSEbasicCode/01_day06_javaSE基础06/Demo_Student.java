public class Demo_Student{
    public static void main(String[] args) {
        new Student().play();
        new Student().name="zhangsan";
        new Student().age=18;
        System.out.println();
    }
}

//定义一个Student类
class Student{
    String name;       // 成员变量name
    int age;           // 成员变量age
    public void play(){      //成员方法play
        System.out.println("play basketball");
    }
    public void sleep(){     //成员方法sleep
        System.out.println("go to sleep");
    }
}