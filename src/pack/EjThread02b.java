package pack;

public class EjThread02b implements Runnable{
	private String name; 
	
	public EjThread02b(String name) {
		System.out.println("Implementando la interfaz runnable");
		this.name = name;
	}
	
	public void run() {
		System.out.println("El nombre es "+ name);
	}
	
	public static void main(String[] args) {
		Thread t0 = new Thread(new EjThread02b("Thread" + 0));
		Thread t1 = new Thread(new EjThread02b("Thread" + 1));
		Thread t2 = new Thread(new EjThread02b("Thread" + 2));
		t0.start();
		t1.start();
		t2.start();
	}
}
