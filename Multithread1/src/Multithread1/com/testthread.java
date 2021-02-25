package Multithr
//Creating thread using thread class
class A extends Thread{
	public void run(){
		for(int i=1;i<3;i++)
		{
			System.out.println("\t from thread A: i="+ i);
		}
		System.out.println("Exit from A");
	}
	
}

class B extends Thread{
	public void run(){
		for(int i=1;i<3;i++)
		{
			System.out.println("\t from thread B: i="+ i);
		}
		System.out.println("Exit from B");
	}
	
}

class testthread {

	public static void main(String[] args) {
		new A().start();
		new B().start();

	}

}