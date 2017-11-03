public class StringFactory {
	private String s;//成员变量s
	
	
    public StringFactory(String s){//构造方法传参
		this.s=s;
	}

    public void setString(String s) {//属性封装
        this.s = s;
    }

    public String getString() {
        return s;
    }
    
    
    
    /*s与s1比较大小。只用一个函数实现不会写
     * (返回值为布尔类型的函数一复杂就不知道怎么用了QwQ)。就用了两个函数。*/
	public int compare(String s1){//函数1：比较ASCII码大小与数组长度并返回。
		int i=s.length();
		int j=s1.length();
		int k=Math.min(i, j);//确定比较的次数。
		
		char c[]= s.toCharArray();//将每个字符放进数组。
	    char c1[]= s1.toCharArray();  
	    for(int a=0; a<k; a++){
	    	/*比较每个字符的ASCII码 */
	        if(c[a]!=c1[a])  
	            return c[a]-c1[a];
	    }  
		return i-j;
		/*比较字符串长度。*/
	}
	public boolean compareLargerThan(String s1){//函数2：返回布尔类型的值。
		if(compare(s1)>0)
			return true;
		else
			return false;
	}
	
	
	
	
	
	public int find(String s1){//找到子字符串并返回起始位置。
		if(s.length()<s1.length() || s.length()==0 || s1.length()==0){
			return 0;
		}//排除不可能找到的情况。
		
		char[] c=s.toCharArray();
		char[] c1=s1.toCharArray();
		
		int first=0;//s1的第一个字符下标。
		int i=0;
		if(c[i]!=c1[first]){
			/*循环直到找到第一个相同的字符*/
			while(++i<s.length() && c[i]!=c1[first]);
		}
		/*接下来一位位比较剩余部分*/
		int j=i+1;
		int e=i+s1.length();
		for(int d=1; j<e && c[j]==c1[d]; d++,j++);
		if(j==e){
			return i+1;
		}	
		return 0;
	}

}