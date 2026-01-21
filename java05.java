package corejavaprograms;
public class java05{
	public static void main(String args[]) {
		int a=5,b=9;
		System.out.println("Values before Swapping A:"+a+"\t B:"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Vlaues after Swapping A:"+a+"\t B:"+b);
	}
}