package example;

class Top extends Thread{
	
	public void run() {
		for(int i = 0; i<50; i++) {
			System.out.print(i+" \t");
		}
	}
}
public class Thread1Exam {

	public static void main(String[] args) {
		System.out.println("���α׷� ����");
		Top d = new Top();
		d.start();
		System.out.println("���α׷� ����");
	}

}
