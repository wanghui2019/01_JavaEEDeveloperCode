/*
instanceof的使用
*/
public class ClassCastException{
    public static void main(String[] args) {
        method(new Cat());            //调用method方法
        method(new Dog());
        method(new Pig());
    }

    public static void method(Animail a){     //Animail作为引用数据类型传给方法method
        if (a instanceof Cat) {       //如果Cat类型属于Animail
            Cat c=(Cat)a;             //向下转型为Cat类型
            c.eat();                  //调用eat方法
            c.eatMouse();             //调用eatmouse方法
        }else if(a instanceof Dog) {  //如果Dog类型属于Animail
            Dog d=(Dog)a;             //向下转型为Dog类型
            d.eat();
            d.eatBone();
        }else{
            a.eat();                  //如果即不属于Cat,也不属于Dog,调用eat方法
        }
    }
}

class Animail{                        //动物类
    public void eat(){
        System.out.println("eat");
    }
}

class Cat extends Animail{           //Cat类继承Animail
    public void eatMouse(){
        System.out.println("eatmouse");
    }
}
    
class Dog extends Animail{         //Dog类继承Animail
    public void eatBone(){
        System.out.println("eatbone");
    }
}
   
class Pig extends Animail{         //Pig类继承Animail
    
}

