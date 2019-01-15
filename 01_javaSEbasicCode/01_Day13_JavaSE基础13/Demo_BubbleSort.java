package com.test13;
/*
 * 使用冒泡排序法
 */
public class Demo_BubbleSort {
	/*
	 * 分析比较:
	 * 例如:int[] arr={1,2,4,5,3};
	 * 1.arr[0]与arr[1],arr[1]与arr[2],arr[2]与arr[3],arr[3]与arr[4]  
	 * 2.arr[0]与arr[1],arr[1]与arr[2],arr[2]与arr[3]
	 * 3.arr[0]与arr[1],arr[1]与arr[2]
	 * 4.arr[0]与arr[1]
	 */
	public static void main(String[] args) {
		int[] arr= {3,5,7,2,8,9,1,4};
		bubbleSort(arr);                                     
		print(arr);
	}

	public static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {              //外层共比较arr.length-1次
			for (int j = 0; j < arr.length-1-i; j++) {        //内层共比较arr.length-1-i次
				if (arr[j]>arr[j+1]) {                        //如果前一个比后一个大,交换
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}	
			}
		}
	}
	public static void print(int[] arr) {                     //将交换好的遍历
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
