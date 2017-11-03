public class StringFactory {
	private String s;//��Ա����s
	
	
    public StringFactory(String s){//���췽������
		this.s=s;
	}

    public void setString(String s) {//���Է�װ
        this.s = s;
    }

    public String getString() {
        return s;
    }
    
    
    
    /*s��s1�Ƚϴ�С��ֻ��һ������ʵ�ֲ���д
     * (����ֵΪ�������͵ĺ���һ���ӾͲ�֪����ô����QwQ)������������������*/
	public int compare(String s1){//����1���Ƚ�ASCII���С�����鳤�Ȳ����ء�
		int i=s.length();
		int j=s1.length();
		int k=Math.min(i, j);//ȷ���ȽϵĴ�����
		
		char c[]= s.toCharArray();//��ÿ���ַ��Ž����顣
	    char c1[]= s1.toCharArray();  
	    for(int a=0; a<k; a++){
	    	/*�Ƚ�ÿ���ַ���ASCII�� */
	        if(c[a]!=c1[a])  
	            return c[a]-c1[a];
	    }  
		return i-j;
		/*�Ƚ��ַ������ȡ�*/
	}
	public boolean compareLargerThan(String s1){//����2�����ز������͵�ֵ��
		if(compare(s1)>0)
			return true;
		else
			return false;
	}
	
	
	
	
	
	public int find(String s1){//�ҵ����ַ�����������ʼλ�á�
		if(s.length()<s1.length() || s.length()==0 || s1.length()==0){
			return 0;
		}//�ų��������ҵ��������
		
		char[] c=s.toCharArray();
		char[] c1=s1.toCharArray();
		
		int first=0;//s1�ĵ�һ���ַ��±ꡣ
		int i=0;
		if(c[i]!=c1[first]){
			/*ѭ��ֱ���ҵ���һ����ͬ���ַ�*/
			while(++i<s.length() && c[i]!=c1[first]);
		}
		/*������һλλ�Ƚ�ʣ�ಿ��*/
		int j=i+1;
		int e=i+s1.length();
		for(int d=1; j<e && c[j]==c1[d]; d++,j++);
		if(j==e){
			return i+1;
		}	
		return 0;
	}

}