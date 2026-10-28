package p10;

interface Idk {
	void sw();
	
}


interface Irc {
	void sw();
	
}

class dkrc implements Idk, Irc {

	@Override
	public void sw() {
		System.out.println("b");
		// TODO Auto-generated method stub
		
	}
	
	
}

public class TestDkrc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dkrc 	dc = new dkrc();
		
		dc.sw();
		
	}

}
