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
		System.out.println("���α׷� ����");
			//1. Runnable�� �����ϴ� ��ü �����
		Top2 t = new Top2();
			//2. Runnable�� ������ �� ��¥ ������ �����
		Thread thd1 = new Thread();
		Thread thd2 = new Thread();
			//3. ������ ���۽�Ű��
		thd1.start();
		thd2.start();
		System.out.println("���α׷� ����");
	}

}
