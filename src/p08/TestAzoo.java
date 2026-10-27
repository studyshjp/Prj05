package p08;
// abstract class 
abstract class	azoo {
	String name;
	void	food() {
		System.out.println(name + "aa");
	}
	abstract void	bark(); // abstract : new 사용 x
		
}


class dg	extends azoo {
	/*
	String name;
	void	food() {
		System.out.println(name + "aa");
	}
	*/
	
	@Override			// abstract method 작성
	void bark() {
		System.out.println(name + "mm");
	}
	
}


class ct	extends azoo {

	@Override
	void bark() {
		System.out.println(name + "mw");
		
	}
	
	
}


class tg	extends azoo {

	@Override
	void bark() {
		System.out.println(name + "TT");
		
	}
	
	
}




public class TestAzoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// azoo az = new azoo(); // abstract : new 사용불가
		dg	d1 = new dg();
		work(d1,"d");
		
		ct	c1 = new ct();
		work(c1,"c");
		
		tg	t1 = new tg();
		work(t1,"t");
		
	}

	private static void work(azoo azoo, String name) {
		// TODO Auto-generated method stub
		azoo.name = name;
		azoo.food();
		azoo.bark();
		
	}

}
