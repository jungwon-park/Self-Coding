package basic3;

public class stringex {
	private char[] value;
	public stringex() {
	}
	public stringex(char[] value) {
		this.value = value;
	}
	public boolean rangeCheck(int index) {
		if(!(index>=0 && index <=value.length)){
			return false;
		}
		return true;
	}
	public char charAt(int index) {
		if(rangeCheck(index)) return value[index];
		return 0;
	}
	public String subString(int beginIndex) {
		String temp="";
		if(rangeCheck(beginIndex)) {
		for (int i = beginIndex; i < value.length; i++) {
			temp+=value[i];
			}
		}
		return temp;
	}
	public String subString(int beginIndex, int endIndex) {
		String temp = "";
		if(beginIndex >= 0 && endIndex <= value.length && (beginIndex - endIndex) > 0) {
			throw new StringIndexOutOfBoundsException();
		}
		for (int i = beginIndex; i < endIndex; i++) {
			temp+=value[i];
		}
		return temp;
	}
	public boolean equals(Object obj) {
		if(obj==this)return true;
		if(obj instanceof String && value.length==((String)obj).length()) {
			char []temp=((String)obj).toCharArray();
			for (int i = 0; i < value.length; i++) {
				if(value[i]!=temp[i]) {
					return false;
				}
			}
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		stringex s1 = new stringex("abc".toCharArray());
		stringex s2 = new stringex("def".toCharArray());
		System.out.println(s1.equals("Abc"));
		//System.out.println(s1.charAt(2));
//		System.out.println(s1.subString(4));
//		System.out.println(s1.subString(0, 1));
		
	}
}
