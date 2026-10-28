package p11;
// interface : 규칙 부여, 통일

interface Ipo {
	void input();
	void process();
	void output();

}
	

class java implements Ipo {

	@Override
	public void input() {
		// TODO Auto-generated method stub
		System.out.println("input");
		
	}

	@Override
	public void process() {
		// TODO Auto-generated method stub
		System.out.println("process");
		
	}

	@Override
	public void output() {
		// TODO Auto-generated method stub
		System.out.println("output");
	}
	
	
	
}


public class TestInter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java j1 = new java();
		j1.input();
		j1.process();
		j1.output();
		
	}

}
