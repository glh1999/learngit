
public class Main {
	public static void main(String[] args){
		StringFactory s=new StringFactory("hello whuers");
		System.out.println(s.compareLargerThan("hello world"));
		System.out.println(s.find("whu"));
	}
}
