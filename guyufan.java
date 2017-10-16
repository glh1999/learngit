package practise;
import java.util.Scanner;

public class guyufan {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringFactory sf=new StringFactory();
		System.out.println("请输入字符串s");
		String a= in.next();
		sf.SringFactory (a);
		System.out.println("请选择运行程序几：( 2 / 3)");	//程序1为了赋值必须运行
		int choice = in.nextInt();
						
		switch(choice)
		{
			default:
				System.out.println("输入错误，请重启程序！");
				break;
			case 2:
				System.out.println("请输入字符串s1");
				String s1 = in.next();
				System.out.println(sf.compareLargerThan(s1));
				break;
			case 3:
				System.out.println("请输入字符串s1");
			    String s2= in.next();
			    System.out.println(sf.Find(s2));
				break;
		}
	}
}


class StringFactory {
	
	String s;
	
	
	public void SringFactory (String s)	//程序1
	{
		this.s = s;
	}
	
	
	public boolean compareLargerThan (String s1)	//程序2
	{
		if( s.compareTo(s1) >0 )
			return true;
		else
			return false;
	}
	
	
	public int Find(String s1)	//程序3
	{
		int lengths = s.length();
		int lengths1 = s1.length();
		int i;
		
		if (lengths >= lengths1) 
		{
			i = s.indexOf(s1);
		}
		else
		{
			i =s1.indexOf(s);
		}
		return i;
	}
}

