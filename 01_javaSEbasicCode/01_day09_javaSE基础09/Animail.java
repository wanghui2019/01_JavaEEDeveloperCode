/*
* 具体事物:猫,狗
* 共性:姓名,年龄,吃饭
* 猫的特性:上树
* 狗的特性:看家
*/
public class Animail{
    public static void main(String[] args) {
        method(new Cat("mimi",3));      //调用方法method
        method(new Dog("wanacai",5));
    }

    public static void method(CommonAnimail a){
        if(a instanceof Cat){          //如果是Cat类
            Cat c=(Cat)a;              //向下转型为Cat型
            c.show();                  //调用show
            c.eat();                   //调用eat
            c.jumpTree();              //调用jumpTree
        }else if(a instanceof Dog){    //如果是Dog类
            Dog d=(Dog)a;              //向下转型为Dog型
            d.show();                  //调用show
            d.eat();                   //调用eat
            d.lookHouse();             //调用lookHouse
        }
    }

}

abstract class CommonAnimail{        //定义抽象的父类
    private String name;             //成员变量
    private int age;

    public CommonAnimail(){}        //空参构造

    public CommonAnimail(String name,int age){   //有参构造
        this.name=name;             //局部变量赋值给成员变量
        this.age=age;
    }

    public abstract void eat();    //抽象类,不能有实体

    public String getName(){       //获取名字
        return name;
    }
    
    public int getAge(){          //获取年龄
        return age;
    }

    public void show(){          //show方法,用于显示名字和年龄
        System.out.println(name+"  "+age);
    }
}

class Cat extends CommonAnimail{   //Cat类继承CommonAnimail
    
    public Cat(String name,int age){    //有参构造函数
        super(name,age);                //调用父类有参构造
    }
    public void eat(){                 //重写eat方法
        System.out.println("eatmouse");
    }

    public void jumpTree(){            //自己本身具有行为,爬树
        System.out.println("jumptree");
    }
}

class Dog extends CommonAnimail{        //Dog类继承CommonAnimail
    public Dog(String name,int age){    //有参构造方法
        super(name,age);                //调用父类有参构造
    }
    public void eat(){                  //重写eat方法
        System.out.println("eatbone");
    }

    public void lookHouse(){            //Dog本身具有行为,看家
        System.out.println("lookhouse");
    }
}