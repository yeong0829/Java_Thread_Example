package example;

class Top2 implements Runnable{
	public void run() {
		for(int i = 0; i<50; i++) {
			System.out.println(i+" \t");
		}
	}
}
public class Runnable2Exam {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
			//1. Runnable을 구현하는 객체 만들기
		Top2 t = new Top2();
			//2. Runnable을 작착한 후 진짜 스레드 만들기
		Thread thd1 = new Thread();
		Thread thd2 = new Thread();
			//3. 스레드 동작시키기
		thd1.start();
		thd2.start();
		System.out.println("프로그램 종료");
	}

}
