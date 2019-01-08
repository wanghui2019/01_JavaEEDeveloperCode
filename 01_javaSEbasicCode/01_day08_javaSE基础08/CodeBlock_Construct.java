class CodeBlock_Construct{
    public static void main(String[] args){
        Son s1=new Son();
        System.out.println(s1.getName()+"  "+s1.getAge());

        System.out.println("-----");

        Son s2=new Son("zhangsan",18);
        System.out.println(s2.getName()+"  "+s2.getAge());
    }
}

class Father{
    private String name;
    private int age;
    /*
    public Father(){                                    //父类无参构造方法
        System.out.println("father no paramater construct");
    }
    */
    public Father(String name,int age){                //父类有参构造方法
        this.name=name;
        this.age=age;
        System.out.println("father paramater construct");
    }

    public  void setName(String name) {
        this.name=name;
    }
    public String getName() {                //获取姓名
        return name;
    }

    public void setAge(int age) {
        this.age=age;
    }
    public int getAge(){                    //获取年龄
        return age;
    }
}

class Son extends Father{                   //子类继承父类无参构造
    public Son(){                           //子类无参构造方法
        //super("lisi",20);                 //先调用父类无参构造方法
        this("wangwu",22);
        System.out.println("Son no paramater construct");
    }

    public Son(String name,int age){        //子类有参构造方法
        super(name,age);                    //调用父类有参构造方法
        System.out.println("son paramater construct");
    }
}