package pack;

public class EjThread01a extends Thread{
	private int n; 
	
	public EjThread01a(int n) {
		System.out.println("extendiendo la clase thread");
		this.n = n; 
	}
	
	public void run() {
		System.out.println("El valor inicial es "+ n);
	}
	
	public static void main(String[] args) {
		EjThread01a t = new EjThread01a(5);
		t.start();
	}
}
