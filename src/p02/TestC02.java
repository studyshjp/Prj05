package p02;

// access modifier : 접근제한자
// private : 해당 클래스에서만 사용 가능
// package : 해당 패키지에서만 사용 가능 접근제한자 생략 
// protected : package + protected 상속관계 
// public : 전체 사용 가능

// class : 설계도 

class ch {
	//fields 
	String  name;
	String  color;
	int		year;
	
	
	
	//methods
	void info() {
		System.out.println("이름" + name);
		System.out.println("색상" + color);
		System.out.println("연식" + year);
		
		
	}

	}



public class TestC02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ch ca1 = new ch();
		ca1.name = "ㅇ";
		ca1.color = "bk";
		ca1.year = 2024;
		ca1.info();
		
		ch ca2 = new ch();
		ca2.name = "ㄴ";
		ca2.color = "rd";
		ca2.year = 2025;
		ca2.info();
	}

}



