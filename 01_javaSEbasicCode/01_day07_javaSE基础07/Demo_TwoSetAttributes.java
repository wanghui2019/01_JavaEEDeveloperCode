public class Demo_TwoSetAttributes{
    public static void main(String[] args) {
        /*
        分析以下代码运行流程:
        创建有参对象,立即调用有参构造函数,将局部变量“zhangsan”,18分别赋值给成员变量
        name,age.此时SetAttributes()类中的成员变量name和age分别为
        “zhangsan”,18.然后getXXX()方法将其返回.然后输出.
        */
        SetAttrtbutes sa=new SetAttrtbutes("zhangsan",18);
        System.out.println(sa.getName()+"  "+sa.getAge());
    }
}

class SetAttrtbutes{
    private String name;       //设置私有成员变量name
    private int age;           //设置私有成员变量age

    public SetAttrtbutes(){}   //设置空参构造函数

    public SetAttrtbutes(String name,int age){    //设置有参构造函数
        this.name=name;        //将局部变量name赋值给成员变量
        this.age=age;          //将局部变量age赋值给成员变量  
    }
     
    public String getName(){   //获取成员变量name
        return name;
    }

    public int getAge(){       //获取成员变量age
        return age;
    }
}