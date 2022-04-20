package com.bridgelabz.Algorithms;

public class InsertionOrder {
	public static void Insertion(int array[])
	{
		int n=array.length;
		for(int j=1;j<n;j++)
		{
			int key=array[j];
			
			int i=j-1;
			while((i>-1)&&(array[i]>key))
			{
				array [i+1] = array [i]; 
				i--;
			}
			array[i+1]=key;
		}
		
	}

	public static void main(String[] args) {
		int[] array1= {10,20,30,40,50,60,70,45,12,35};
		System.out.println("before insertion sort ");
		
		for(int i:array1) {
			System.out.println(i+" ");
		}
		System.out.println();
		Insertion(array1);
		System.out.println("after insertion sort ");
		for(int i:array1) {
			System.out.println(i+"");
		}
	}
}
