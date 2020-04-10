package test;
//[문제3]값을 입력받아 함수호출하여 처리하시오
//조건1)입력받은 값을  compute(item, qty, price):void  함수에서 처리
//조건2)계산방법 : 금액 = 수량 * 단가
public class Test3 {
	public void compute(String item, int qty, int price) {
		System.out.println("품명 : "+item+"\n금액 : "+qty*price);
	}
	public static void main(String[] args) {
		Test3 ob = new Test3();
		ob.compute("apple", 10, 1200);
	}
}
//-입력-
//품명 : apple
//수량 : 10
//단가 : 1200
//
//-출력-
//품명 : apple
//금액 : 12000원