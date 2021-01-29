package pack;

public class EjThread01d extends Thread {

	 private String name; 
		
		public EjThread01d(String name) {
			System.out.println("extendiendo la clase thread");
			this.name = name; 	}
		
		public void run() {
			try {
				for (int i = 0; i <5; i ++)
				{
					System.out.println(name+" "+ "valor: " + i);
					Thread.sleep(50);
				}
			}
			catch(Exception e){
				
			}
			System.out.println("saliendo: " + name );
		}
		
		public static void main(String[] args) {
			EjThread01d t0 = new EjThread01d("Thread" + 0);
			EjThread01d t1 = new EjThread01d("Thread" + 1);
			EjThread01d t2 = new EjThread01d("Thread" + 2);
			t0.start();
			t1.start();
			t2.start();
		}
}
