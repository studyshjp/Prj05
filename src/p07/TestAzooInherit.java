package p07;


class	azoo {
	String name;
	void 	food() {
		System.out.println(name + "aa");
	}
}


class dg extends azoo {
	String name;
	void	food() {
		System.out.println(name + "aa");
		
	}
	
	void	bark() {
		System.out.println(name + "mm");
		
	}
}

class ct extends azoo {
	String	name;
	void	food() {
		System.out.println(name + "aa");
		
	}
	
	void	mew() {
		System.out.println(name + "mw");
		
	}
}

class tg extends azoo {
	String name;
	void 	cry() {
		System.out.println(name + "cry TT");

	}
}


public class TestAzooInherit {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dg	d1	= new dg();
		work(d1,"d");
		d1.name = "d";
		d1.bark();
		
		ct	c1	= new ct();
		work(c1,"c");
		c1.name = "c";
		c1.mew();
		
		tg t1 = new tg();
		work(t1,"t");
		t1.name = "t";
		t1.cry();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dg	d1	= new dg();
		work(d1,"d");

		ct	c1	= new ct();
		work(c1,"c");

		tg t1 = new tg();
		work(t1,"t");
		
		azoo az1 = new azoo();
		work(az1,"az")
	}
/* method 처리
 * 
 */
	//
	private static void work (azoo az1, String string ){
		azoo.name = name;
		azoo.food();
	
	// class
	
	 	if (azoo instanceof dg)
	 		((dg) azoo).bark();
	 	if (azoo instanceof ct)
			((ct) azoo).mew();
	 	if (azoo instanceof tg)
			((tg) azoo).cry();
		 	
}
	private static void work (dg d1, String string ){
		d1.name = "d";
		d1.bark();
		
	}
	private static void work (ct c1, String string ){
		c1.name = "c";
		c1.mew();
		
	}
	private static void work (tg t1, String string ){
		t1.name = "t";
		t1.cry();
		
	}
	

}

