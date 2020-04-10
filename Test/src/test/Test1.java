package test;
//[문제1] main()함수에서 각각 호출하고 계산된 결과를 return 받아서 
//       main()에서 출력하시오
//		  호출함수 : sum(3,5):int   sub(7,2):int   mul(4,5):int   div(7,3):double
public class Test1 {
	public int sum(int a, int b) {
		return a+b;
	}
	public int sub(int a, int b) {
		return a-b;
	}
	public int mul(int a, int b) {
		return a*b;
	}
	public double div (double a, double b) {
		return a/b;
	}
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		System.out.println("더하기 : " + t1.sum(3, 5));
		System.out.println("뺴   기 : " + t1.sub(7, 2));
		System.out.println("곱하기 : " + t1.mul(4, 5));
		System.out.println("나누기 : " + t1.div(7, 3));		
	}
}
//더하기 : 8
//빼  기 : 5
//곱하기 : 20
//나누기 : 2.33