package p05;


class dg {
	String name;
	void	food() {
		System.out.println(name + "aa");
		
		
	}
	void	bark() {
		System.out.println(name + "mm");
		
	}
}

class ct {
	String	name;
	void	food() {
		System.out.println(name + "aa");
		
	}
	
	void	mew() {
		System.out.println(name + "mw");
		
	}
	
	
}




public class TestAzoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dg	d1	= new dg();
		d1.name = "d";
		d1.bark();
		
		ct	c1	= new ct();
		c1.name = "c";
		c1.mew();
	}

}
