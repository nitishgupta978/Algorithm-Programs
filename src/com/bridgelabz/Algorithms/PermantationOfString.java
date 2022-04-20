package com.bridgelabz.Algorithms;

public class PermantationOfString {
	private static void Swap(char[] chars,int i,int j)
	{
		char temp= chars[i];
		chars[i]=chars[j];
		chars[j]=temp;
		
	}
	private static void permutations(char[] chars,int currentIndex)
	{
		if(currentIndex==chars.length-1) {
			System.out.println(String.valueOf(chars));
		}
		for(int i =currentIndex;i<chars.length;i++)
		{
			Swap(chars,currentIndex,i);
			permutations(chars, currentIndex+1);
			Swap(chars, currentIndex, i);
		}
	}

	public static void findPrmutations(String str) {
	if(str==null || str.length()==0)	{
		return;
	}
	permutations(str.toCharArray(), 0);
	}
	public static void main(String[] args) {
		String str="XYZ";
		findPrmutations(str);
	}
}
