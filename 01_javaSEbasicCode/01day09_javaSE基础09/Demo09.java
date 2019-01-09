/*
测试即继承又实现的一个例题
*/
public class Demo09{
    public static void main(String[] args){
        Father f=new Father();      //创建Father对象,其实现了接口GrandFather_One,GrandFather_Two
        f.speakOne();               //调用speakOne方法

        Son s=new Son();            //创建Son对象,其继承了Father
        s.speakOne();               //调用speakOne方法
        s.show();                   //调用show方法
    }
}

interface GrandFather_One{      //定义接口GrandFather_One
    void speakOne();
}

interface GrandFather_Two{      //定义接口GrandFather_Two
    void speakTwo();
}

class Father{                   //类Father
    public void speakOne(){         //重写接口内的抽象方法
        System.out.println("speakone");
    }

    public void speakTwo(){         //重写接口内的抽象方法
        System.out.println("speaktwo");
    }
}

class Son extends Father implements   GrandFather_One,GrandFather_Two{
//Son继承Father再实现GrandFather_One,GrandFather_Two
    public void speakOne(){         //重写Father内的speakOne方法,出现同名执行子类方法
        System.out.println("Son_speakone");
    }

    public void show(){             //创建方法show
        System.out.println("show");
    }
}
