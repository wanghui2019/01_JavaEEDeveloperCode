/*
匿名内部类实现接口以及普通类的情形,以及调用方法的方式
*/
public class Annoy_Test{
    public static void main(String[] args) {
        Outer o=new Outer();
        o.method();
    }
}

interface Inter{           //父类接口
    public void show1();
    public void show2();
}

class Outer{
    class Inner extends Outer{         //继承接口Outer,Inner为普通类
        public void show1(){           //重写接口内的方法
            System.out.println("show1");
        }
        public void show2(){           //重写接口内的方法
            System.out.println("show2");
        }
    }
    public void method(){
        new Inner().show1();           //实现普通类,调用show1方法
        Inner in=new Inner();
        in.show2();
        Inter i=new Inter(){                   //实现接口
            public void show1(){       //重写接口内的方法
                System.out.println("showone");
            }
            public void show2(){       //重写接口内的方法
                System.out.println("showtwo");
            }
        };  
        i.show1();                     //调用show1方法
        i.show2();                     //调用show2方法
    }
}