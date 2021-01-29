package pack;

public class EjThreadEjercicio extends Thread {

	private int n; 
	
	
	
	public EjThreadEjercicio(int n) {
		System.out.println("extendiendo la clase thread");
		this.n = n; 	}
	
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
		EjThreadEjercicio t1 = new EjThreadEjercicio(1);
		//impares
		EjThreadEjercicio t2 = new EjThreadEjercicio(2);
		t1.start();
		t2.start();
		
		
	}
}
