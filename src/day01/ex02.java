package day01;

public class Ex02 {
	public static void main(String[] args) {
		/*
		 \n : 엔터와 비슷
		 \t : 탭크기 만큼 오른쪽으로 이동(윈도우에서는 대략 8칸정도)
		 \" : "(큰따음표) 표시 (일반 문자로 사용하고자 할때)
		 \\ : \(역슬러쉬) 표현할 때 사용 
		 */
		// " " : 쌍따옴표로 묶인 값은 문자열로 인식
		System.out.println("Hello java");
		System.out.println("H\ne\nllo java");
		System.out.println("1\t12345\t123");
		System.out.println("1\\t12345\t123");
	}
}
