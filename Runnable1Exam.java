package example;

class Top1 implements Runnable{
	public void run() {
		for(int i = 0; i<50; i++) {
			System.out.println(i+" \t");
		}
	}
}

public class Runnable1Exam {
	public static void main(String[] args) {
		System.out.println("���α׷� ����");
		Top1 t = new Top1();
		Thread thd = new  Thread(t);
		thd.start();
		System.out.println("���α׷� ����");
	}

}
