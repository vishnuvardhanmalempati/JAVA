package corejavaprograms;
public class Java07{
	public static void main(String args[]) {
		int a=5, b=9;
		System.out.println("Values before swapping A:"+a+"\t B:"+b);
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("Values after Swapping A:"+a+"\t B:"+b);
	}
}