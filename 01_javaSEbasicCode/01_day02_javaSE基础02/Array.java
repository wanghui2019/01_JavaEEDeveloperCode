/*
数组能作为返回值返回,其返回的为数组arr为数组的地址值
*/
public class Array{
    public static void main(String[] args) {
        int[] arr=getArray();      //创建一个数组arr用于接受返回值
        System.out.println(arr);   //将返回的地址值输出
        for(int i=0;i<arr.length;i++){   //将数组遍历输出
            System.out.print(arr[i]+" ");
        }
    }

    public static int[] getArray(){  //返回一个int类型的数组
        int[] arr={2,3,4,1,5};
        return arr;            //arr是数组的地址值,将数组的地址值返回
    }
}