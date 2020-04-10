package test;
//[문제2] main()함수에서 메서드를 호출하여 다음과 같이 출력하시오
//
//(조건)
//1. 함수명 : output(10,'#'):void
//2. 출력문에서 for문을 이용하시오
public class Test2 {
	public void output(int a, char b) {
		for(int i=0; i<a; i++)
		System.out.print(b+" ");		
	}
	public static void main(String[] args) {
		Test2 t2 = new Test2();
		t2.output(10,'#');
	}

}
//<결과>
//# # # # # # # # # # 