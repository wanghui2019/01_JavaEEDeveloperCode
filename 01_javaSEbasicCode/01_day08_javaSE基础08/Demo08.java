/*
final修饰的引用数据类型,改变属性时,地址值不会改变
*/

public class Demo08{
    public static void main(String[] args) {
        final Student s=new Student("zhangsan",18);   //创建final类型的Student对象s
        System.out.println(s);                        //第一次打印地址值
        s.setName("lisi");                            //修改名字
        s.setAge(20);                                 //修改年龄
        System.out.println(s.getName()+"  "+s.getAge());   //修改成功
        System.out.println(s);                        //第二次打印地址值
    } 
}
class Student{
    private String name;
    private int age;

    public Student(){

    }

    public Student(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println(name+"  "+age);
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
}