/*
面试题:要求依次输出30,20,10
*/
class InnerClass{
    public static void main(String[] args) {
        Outer.Inner oi=new Outer().new Inner();  //调用内部类
        oi.show();                //调用内部类方法
    }
}

class Outer{                 //外部类
    public int num=10;            //外部类成员变量
     class Inner{            //内部类
        public int num=20;        //内部类成员变量
        public void show(){  
            int num=30;           //内部类局部变量
            System.out.println(num);       //就近原则,先输出局部变量
            //类名+this+成员变量,即是输出该类里的成员变量,对于就近的类,类名可以省去
            System.out.println(Inner.this.num);   //此处InnerClass可以不写
            System.out.println(Outer.this.num);   //输出外部内成员变量
        }
    }
}