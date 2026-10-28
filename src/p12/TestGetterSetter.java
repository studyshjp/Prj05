package p12;

class Emp {
	//fields
	
	private int		eno;
	private String	name;
	private String	num;

	/*
	public Emp(int eno, String name, String num) {
		
		this.eno = eno;
		this.name = name;
		this.num = num;
	}

	 */
	
	public Emp(int i, String string, String string2) {
		// TODO Auto-generated constructor stub
	}

		// getter / setter : 함수
	// getter / setter
		public int getEno() {
		return eno;
	}

	public String getName() {
			return name;
		}

		public String getNum() {
			return num;
		}

		public void getSetEno() {
			return setEno;
		}

		public void getGetEno() {
			return getEno;
		}

	public void setEno(int eno) {
		
		this.eno = eno;
	}

	
	// setter
		void setEno {
		

}
	// getter
		void getEno {
			
			
		}
	
	
	//method
	public	void info() {
		System.out.printf("%b %s %s \n"
				, eno, name, num);
		
	}
	
}


public class TestGetterSetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Emp		emp1 = new Emp();
		// emp1.eno = 1;
		emp1.setEno(1);
		emp1.setname("a");
		emp1.setnum("aaa");
		emp1.info();
		
		
	//	int		neweno	=	emp1.getEno();
		// System.out.println(emp1.getEno());
	//	System.out.println(neweno);
		
		
		Emp		emp2 = new Emp(2, "a", "aaa");
		emp2.info();
		
	}

}
