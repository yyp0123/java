public class ArrTest{
	public static void main(String[] args) {
		//��̬�����ʼ����ָֻ������
		int[] a =new int[3];
		a[0]=1000;
		System.out.println(a[0]);
		//��̬�����ʼ��ʱ��ָ��������ÿ��Ԫ�صĳ�ʼֵ����ϵͳ�������鳤��
		int [] b= {1,3,5,7};
		System.out.println(b[2]);
		//������ȡ����Ԫ�أ�������ܴ�ʱ�����һ������ȡ
		int [] c= {1,2,4,5,5,7,7,8,8,9,9,23,4,56,78,90};
		for(int i=0;i<c.length;i++)
			System.out.print(c[i] );
	//����	
 	}
}