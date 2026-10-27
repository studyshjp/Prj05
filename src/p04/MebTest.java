package p04;

// import java.time.LocalDate;

/*
a	 b	 c
2004 2000 2000 2000 2000
aa	bb	cc
*/

class grmemb {
	//fields
	private	String	name;
	private	int		bYear;
	private String	role;
	
	//constructor
	//public grmemb(String name, int bYear, String role) {
		/*
		this.name 	= name;
		this.bYear 	= bYear;
		this.role 	= role;
		*/
		
	//method
	public	void	info() {
		//int		age		= LocalDate.now().getYear() - this.bYear;
		System.out.printf("%s %d %d \n", 
				name, bYear, role);
		
		
	}

	public grmemb(String name, int bYear, String role) {
		super();
		this.name = name;
		this.bYear = bYear;
		this.role = role;
		
	}
	
	
	
}

public class MebTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		grmemb	 grp1 = new grmemb("a", 2004, "aa");
		grp1.info();
		grmemb	 grp2 = new grmemb("b", 2000, "bb");
		grp2.info();
		grmemb	 grp3 = new grmemb("c", 2000, "cc");
		grp3.info();
		
		System.out.println();
		
		
		//array 객체배열 인원수
		grmemb [] grpArr = new grmemb[3];
		grpArr[0] = new grmemb("a", 2004, "aa"); // ==grp1
		grpArr[1] = new grmemb("b", 2004, "bb");
		grpArr[2] = new grmemb("c", 2004, "cc");
		
		for (int i = 0; i < grpArr.length; i++) {
			grpArr[i].info();
			
		}
		/*
		grpArr[0].info();
		grpArr[1].info();
		grpArr[2].info();
		*/
		
		
	}

}
