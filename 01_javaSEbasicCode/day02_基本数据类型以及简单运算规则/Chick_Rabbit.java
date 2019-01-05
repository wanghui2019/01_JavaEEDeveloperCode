class Test{
    public static void main(String[] args) {
        /*
        鸡兔同笼问题
        1.写一方法实现鸡兔同笼个数计算
        2.调用该方法,将鸡兔数量打印输入
        */
        int[] arr=getNumber(15, 6);
        System.out.println("Number of chickens:"+arr[0]+"  "+"Number of rabbits:"+arr[1]);
    }
    /*
    返回值类型:int[] arr
    参数列表:int leg,int head
    分析:
        鸡的数量:cn=2*head-leg/2;
        兔的数量:rn=leg/2-head;
    判断:
        如果leg%2为0,可以运算,并将运算结果返回
        否则鸡兔数量不为整数,有瑕疵 
    */
    public static int[] getNumber(int leg,int head){
        int[] arr=new int[2];
        if(leg%2==0){
            arr[0]=2*head-leg/2;
            arr[1]=leg/2-head;
            
        }else{
            System.out.println("it is false");
        }
        return arr;
    }
}