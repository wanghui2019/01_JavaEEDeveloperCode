public class Code_Block{
    public static void main(String[] args) {
        int a=10;

        {                             //局部代码块
            int b=20;
            System.out.println(a);
            System.out.println(b);
        }

        System.out.println(a);
        //System.out.println(b);     变量b在局部代码块内,出了局部代码块就失去的定义

        Student s1=new Student();                //创建无参对象
        
        System.out.println("------");

        Student s2=new Student("zhangsan",18);   //创建有参对象
        }

        static {                                 //存在于mian方法中的静态代码块
            System.out.println("main static Code Block");
        }
}

class Student{
    private String name;                         //私有化成员变量
    private int age;

    public Student(){                            //空参构造函数
        System.out.println("this is a no paramater funtion");
    }

    public Student(String name,int age){          //有参构造函数
        this.name=name;
        this.age=age;
        System.out.println("this is a paramater funtion");
    }

    {                                            //构造代码块
        play();                                  //调用play()方法
    }

    public void play(){                          //play()方法
        System.out.println("Construct Code Block");
    }

    static {                                    //存在于Student类中的静态代码块
        System.out.println("static Code Block");
    }
}