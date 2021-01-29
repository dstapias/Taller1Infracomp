package pack;

public class EjThreadEjercicioRunnable implements Runnable{
private int n; 
	
	
	public EjThreadEjercicioRunnable(int n) {
		System.out.println("Implementando la interfaz runnable");
		this.n = n;
	}
	
	public void run() {
		try {
			for (int i = 9; i <36; i ++)
			{
				if (n == 1 )
				{
					if ( (i % 2) == 0) {
						System.out.println("Thread"+ n + ":" + i);
					}
					
				}
				if ( n == 2)
				{
					if ( (i % 2) != 0) {
						System.out.println("Thread"+ n + ":" + i);
					}
				}
				Thread.sleep(50);
			}
		}
		catch(Exception e){
			
		}
		System.out.println("saliendo: " + n );
	}
	
	public static void main(String[] args) {
		//pares
		Thread t1 = new Thread(new EjThreadEjercicioRunnable(1));
		//impares
		Thread t2 = new Thread(new EjThreadEjercicioRunnable(2));
		t1.start();
		t2.start();
}
}
