package pack;

public class EjThread01c extends Thread {
	
private final static int MAX = 3; 
private String name; 
	
	public EjThread01c(String name) {
		System.out.println("extendiendo la clase thread");
		this.name = name; 	}
	
	public void run() {
		System.out.println("El nombre es "+ name);
	}
	
	public static void main(String[] args) {
		EjThread01c[] ta = new EjThread01c[MAX];
		for(int i = 0; i < ta.length; i ++)
		{
			ta[i] = new EjThread01c("Thread"+ i);
		}
		
		for(int i = 0; i < ta.length; i ++)
		{
			ta[i].start();
		}
	}
}
