//µ¼°ü£¬
import java.util.Scanner;
public class HelloWorld {
	public static void main(String[] args){
		//System.out.println("java");
		Scanner sc =new Scanner(System.in);
		int i=sc.nextInt();
		System.out.println("i:"+i);
		int a=20;
		System.out.println("a=20");
		//boolean
		boolean b=true;
		System.out.println(b);
		//long c=123456789012;
		//System.out.println(c);
		long c=123456789012L;
		System.out.println(c);
	
		int d=6;
		int f=4;
		System.out.println(d+f);
		System.out.println(d*f);
		System.out.println(d%f);
		System.out.println(666+"java"); //666java
		System.out.println("java"+666);
	}
}