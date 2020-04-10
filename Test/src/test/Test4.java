package test;

import java.util.Scanner;

//[문제4] 아래와 같이 12달의 날수를 배열를 만들어 기억시킨후 
//원하는 month을 입력받아 그 달의 날수를 출력하시오
//
//[참고]
//int []month={31,28,31,30,31,30,31,31,30,31,30,31};
public class Test4 {
	public static void main(String[] args) {
		int a;	
		int []month={31,28,31,30,31,30,31,31,30,31,30,31};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 month를 입력하시오 : "); a = sc.nextInt(); sc.close();
		System.out.println(a+"월은 "+month[a-1]+"일 입니다.");		
	}	
}
//--입력화면/출력화면--
//
//원하는 month을 입력하시오 : 3
//3월은 31일입니다.