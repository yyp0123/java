package student;

public class studentd {
//创建对象
	public static void main(String[] args) {
		studentte p=new studentte();
		//使用对象
		System.out.println(p.name);
		p.name="林青霞";
		p.age=30;
		System.out.println(p.name);
		
		p.study();
	}
	

}
