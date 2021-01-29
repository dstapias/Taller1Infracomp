package pack;

public class EjThread02c implements Runnable{
	private String name; 
	private final static int MAX = 3;
	
	public EjThread02c(String name) {
		System.out.println("Implementando la interfaz runnable");
		this.name = name;
	}
	
	public void run() {
		System.out.println("El nombre es "+ name);
	}
	
	public static void main(String[] args) {
		Thread[] ta = new Thread[MAX];
		
		for (int i = 0; i < ta.length; i ++)
		{
			ta[i]= new Thread(new EjThread02c("Thread"+ i ));
		}
		
		for (int i = 0; i < ta.length; i ++)
		{
			ta[i].start();
		}
		
	}
}
