public class ArrTest{
	public static void main(String[] args) {
		//动态数组初始化，只指定长度
		int[] a =new int[3];
		a[0]=1000;
		System.out.println(a[0]);
		//静态数组初始化时，指定数组中每个元素的初始值，由系统决定数组长度
		int [] b= {1,3,5,7};
		System.out.println(b[2]);
		//遍历获取数组元素：当数组很大时，如何一个个获取
		int [] c= {1,2,4,5,5,7,7,8,8,9,9,23,4,56,78,90};
		for(int i=0;i<c.length;i++)
			System.out.print(c[i] );
	//函数	
 	}
}