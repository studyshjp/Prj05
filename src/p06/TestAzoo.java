package p06;


class	zoo {
	
	
}


class dg extends zoo {
	String name;
	void	food() {
		System.out.println(name + "aa");
		
	}
	
	void	bark() {
		System.out.println(name + "mm");
		
	}
}

class ct extends zoo {
	String	name;
	void	food() {
		System.out.println(name + "aa");
		
	}
	
	void	mew() {
		System.out.println(name + "mw");
		
	}
}

class tg extends zoo {
	String name;
	void 	cry() {
		System.out.println(name + "cry TT");

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
		
		tg t1 = new tg();
		t1.name = "t";
		t1.cry();
	}

}

