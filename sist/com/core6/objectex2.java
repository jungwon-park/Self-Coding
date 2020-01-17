package sist.com.core6;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;

import sist.com.obj.app1.Action;

public class objectex2 {
	public CharSequence getString() {
		//return new StringBuffer().toString();
		//return new StringBuilder().toString();
		//return new String("abc");
		//return new StringBuffer();
		return new StringBuilder(); 
	}
	public void objex1() {
		Collection c = new ArrayList();
		Iterable a = new ArrayList();
		
	}
	public static void main(String[] args) {
		objectex2 o = new objectex2();
		o.objex1();
	}
}