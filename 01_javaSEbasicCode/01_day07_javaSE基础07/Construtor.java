public class Construtor{
    public static void main(String[] args) {
        //Student s=new Student();
        //s.show();

        Student s1=new Student("lisi",20);
        s1.show();
    }
}

class Student{
    private String name;
    private int age;
    /*
    public Student(){
        name="zhangsan";
        age=18;
        System.out.println("No parameter funtion");
    }
    */
    public Student(String name,int age){
        this.name=name;             //将局部变量name的值赋值给成员变量name
        this.age=age;               //将局部变量age的值赋值给成员变量age
        System.out.println("parameter funtion");
    }
    
    public void show(){
        System.out.println(name+" "+age);
    }
}