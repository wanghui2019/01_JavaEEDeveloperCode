public class Demo_test1{
    public static void main(String[] args) {
        Student s=new Student();
        s.setName("zhangsan");
        s.setAge(18);
        System.out.println(s.getName()+"  "+s.getAge());
    }
}

class Student{
    private String name;       // 成员变量name
    private int age;           // 成员变量age
    public void setName(String name){      //成员方法play
        name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){     //成员方法sleep
        age=age;
    }
    public int getAge(){
        return age;
    }
}