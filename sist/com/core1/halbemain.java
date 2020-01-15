package sist.com.core1;

public class halbemain {
	public static void main(String[] args) {
		na n = new na();
		n.na();
		n.abe();
		n.halbe();
		
		((halbe)n).halbe();
		
		((abe)n).halbe();
		((abe)n).abe();
		
		((na)n).halbe();
		((na)n).abe();
		((na)n).na();
		
		n.sleep(); // 상속에서 메소드명이 중복되면 자식메소드명을 반환
		n.good();
		
	
	}
}
