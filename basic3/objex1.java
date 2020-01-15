package basic3;

import java.util.Calendar;

//private,final,static,this,public ,extends,abstract,interface 
public class ObjEx1 {
	public void objectMethod1(){
		String s1=new String("ab#c#d");//value[a][b][c][d]
		String s2=new String("e#f#gh");//value[e][f][g][h]
		/*System.out.println(s2.charAt(0));
		System.out.println(s1.equals("Abcd"));*/
		//System.out.println(s1.substring(3,2));
		
		//System.out.println(s2.substring(s2.indexOf("#")+1));
		
		//System.out.println(s1.indexOf('#', s1.indexOf('#')+1));
		//System.out.println(s1.lastIndexOf('#'));
		/*String []rs=s1.split("#");
		for(String s:rs) {
			System.out.println(s);
		}*/
		
		System.out.println(s1.concat("데이타"));
		
		//byte []b=s3.getBytes();
		/*for(byte i:b) {
			System.out.println(i);
		}*/
		String s3="abcdef";
		char []dest=new char[10];
		s3.getChars(0, 4,dest ,0);
		System.out.println(dest[1]);	
		
	}	
	//이름 나이 생일여부 성별 지역 전화번호
	public int getAge(String born) {
		int year=(Calendar.getInstance().get(Calendar.YEAR));
		
		return year-((Integer.parseInt(born)+1900))+1; 
	}
	public boolean getBirth(String data) {
		System.out.println(data);
		Calendar c= Calendar.getInstance();
		int month=(c.get(Calendar.MONTH)+1);
		int day=(c.get(Calendar.DATE));
		String calen=month>=1&& month<=9?"0".concat(String.valueOf(month)):String.valueOf(month);
		
		return calen.concat(String.valueOf(day)).equals(data);
	}
	public String genderAction(String data) {
		System.out.println(data);
	    return data.equals("1")||data.equals("3")?"남자":"여자";	
	}
	public String getLoc(String data) {
		switch (data) {
		case "02":
			return "서울";
		case "031":
			return "경기도";
		case "041":
			return "충청도";	
		default:
			return "기타"	;
		}
	}
	public void objectMethod2(){//
		String []data={"노승원#991201-1010547#02)457-1234",
				       "이지혜#920113-2020547#031)994-5481",
				       "신재훈#581001-1010547#041)357-1234"};
		Member []members=new Member[data.length];//[][][]
		for (int i = 0; i < data.length; i++) {
			String []imsi=data[i].split("#");
			members[i]=new Member();
			for (int j = 0; j < imsi.length; j++) {
				switch (j) {
				case 0:
					members[i].setName(imsi[j]);
					break;
				case 1://나이 성별 
					members[i].setAge(getAge(imsi[j].substring(0,2)));
					members[i].setBirth(getBirth(imsi[j].substring(2,6)));
					members[i].setGender(genderAction( imsi[j].substring(imsi[j].indexOf("-")+1,imsi[j].indexOf("-")+2)));
					break;
				case 2:
					members[i].setLocation(getLoc(imsi[j].substring(0,imsi[j].indexOf(")"))));
					
				default:
					break;
				}
			}
		}	
		disp(members);
		
	}
	public void disp(Member []member) {
		/*for(Member m:member) {
			System.out.println(m);
		}*/
		
		for(int i=0;i<member.length;i++) {
			System.out.println(member[i].getName());
			System.out.println(member[i].getAge());
			System.out.println(member[i].isBirth()?"생일추카.....":"");
			System.out.println(member[i].getGender());
			System.out.println(member[i].getLocation());
			
			
		}
		
	}
	public static void main(String[] args) {
		ObjEx1 o=new ObjEx1();
		o.objectMethod2();
	}

}





