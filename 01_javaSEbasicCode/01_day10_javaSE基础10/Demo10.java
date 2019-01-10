public class Demo10{
    public static void main(String[] args) {
        new Father(){                   //创建匿名内部类
            public void method(){       //重写抽象方法
                System.out.println("Annoymous method");
            }
        }.method();
        //也可以通过以下方式调用
        /*
        Father f=new Father(){                   //创建匿名内部类
            public void method(){       //重写抽象方法
                System.out.println("also Annoymous method");
            }
        };
        f.method();
        */
    }
}

abstract class Father{             //抽象父类
    public abstract void method(); //抽象方法
}
