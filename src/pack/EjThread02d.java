package pack;

public class EjThread02d implements Runnable {
	private String name; 
	
	
	public EjThread02d(String name) {
		System.out.println("Implementando la interfaz runnable");
		this.name = name;
	}
	
	public void run() {
		try {
			for(int i = 0; i < 5; i ++)
			{
				System.out.println(name + " " + "valor: " + i );
			}
		}
		catch(Exception e){}
		System.out.println("saliendo: " + name);
	}
	
	public static void main(String[] args) {
		Thread t0 = new Thread(new EjThread02d("Thread" + 0));
		Thread t1 = new Thread(new EjThread02d("Thread" + 1));
		Thread t2 = new Thread(new EjThread02d("Thread" + 2));
		t0.start();
		t1.start();
		t2.start();
}
}
