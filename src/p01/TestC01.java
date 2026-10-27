package p01;


// RLF : 줄바꿈
// LF : line feed		 \n	0x0a(10)
// CR : Carriage Return  \r	0x0d(13)
// unix, linux, android : \n
// window 				: \r\n
// mac					: \r



public class TestC01 { // alt + 032 0103 keyboard word 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n보유현황\n");
		
		
		String 	name1 	= "ㅇ";
		String 	color1 	= "bk";
		int		year1 	= 2024;
		
		System.out.println("이름:" + name1);
		System.out.println("색상:" + color1);
		System.out.println("연식:" + year1);
		
		
		String 	name2 	= "ㄴ";
		String 	color2 	= "rd";
		int		year2 	= 2025;
		
		System.out.println("\n이름:" + name2);
		System.out.println("색상:" + color2);
		System.out.println("연식:" + year2);
		
		
		String 	name3 	= "ㅊ";
		String 	color3 	= "pk";
		int		year3 	= 2026;
		
		System.out.println("\n이름:" + name3);
		System.out.println("색상:" + color3);
		System.out.println("연식:" + year3);
		
		
		
	}

}
