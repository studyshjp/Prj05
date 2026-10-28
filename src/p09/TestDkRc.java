package p09;

//import java.awt.SystemColor;
 

// class : c++만 가능 , java c# 불가능
// class : interface로 implement 구현 가능 

class dk {
	void sw() {
		System.out.println("a");
	}
	
}

// abstract class / interface 
// 모든 함수가 abstract 일 경우 interface 사용 가능


/*
abstract class s {
	abstract int add(int v1, int v2);
	abstract int sub(int v1, int v2);
	abstract int mul(int v1, int v2);
	abstract int div(int v1, int v2);
		
} 
*/

interface s {
	abstract int add(int v1, int v2);
	abstract int sub(int v1, int v2);
	abstract int mul(int v1, int v2);
	abstract int div(int v1, int v2);
		
} 

/*
class rc {
	void sw() {
		System.out.println("b");
	}
	
}

*/

interface rc {
	void sw(); 
	
}



// java extend에는 하나의 class만 사용 가능
class dkrc extends dk implements rc {
	
	

	
	@Override
	public void sw () {
		
		System.out.println("b");
	}
	
	}
	

public class TestDkRc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dkrc	 dc = new dkrc();
		dc.sw();
		
	}

}
