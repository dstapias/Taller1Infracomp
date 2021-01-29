package pack;

public class EjThread02a implements Runnable {

	private int n; 
	
	public EjThread02a(int n) {
		System.out.println("Implementando la interfaz runnable");
		this.n = n;
	}
	
	public void run() {
		System.out.println("El valor inicial es "+ n);
	}
	
	public static void main(String[] args) {
		Thread t = new Thread(new EjThread02a(5));
		t.start();
	}
	
}
