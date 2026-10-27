package p03;

import java.time.LocalDate;

/*
 a	 b	 c
2004 2006 2006 2000 2000
aa	bb	cc
*/

class grpmemb {
	// field : private
	private 	String	name;
	private 	int 	bYear;
	private 	String 	role;
	
	
	// 객체지향언어
	// 다형성 : polymophism
	// 1. Overloading 
	// constructor 생성자 : new 실행 명령어
	// NoArgsConstructor
	public grpmemb () {
		System.out.println("h");
	}
	
	// AllArgsConstructor
	public grpmemb (String n, int bY, String r) {
		this.name	= n;
		if(bYear < 0)
			bYear = LocalDate.now().getYear();
		this.bYear	= bY;
		this.role	= r;
	}
	
	
	// method : public
	public	void	info() {
		System.out.println("");
		int	age	= LocalDate.now().getYear() - bYear;
		System.out.printf("%s %d %s %d \n", 
				name, bYear, role, age);
		
		
	}
}

public class MembTest {
	// null	
	// "" 	빈문자열 empty String
	
	// 전체 대문자 : ctrl+shift+x
	// 전체 소문자 : ctrl+shift+y
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		grpmemb	r 	= new grpmemb();
		System.out.println(r);
		r.name 		= "ㅇ";
		r.info();	
		grpmemb r2	= null;
		System.out.println(r2);
		*/
		
		//grpmemb	r0	=	new grpmemb();
		// r1.name		=	"ㅇ"; 		
		// error : private . 으로 직접 사용
		// The field grpmemb.name is not visible
		
		// private 실행
		// 1. 생성자 constructor 
		grpmemb	r1	=	new grpmemb("a", 2004, "aa");
		r1.info();
		
		// 2. getter / setter 사용
		// 3. 
		
		
		
		
	}

}
