class Multi extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(2*i);
		}
	}
}
public class Thread_02 {
public static void main(String[] args) {
	Multi mt=new Multi();
	mt.run();
}
}

