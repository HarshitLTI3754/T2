package assignment;

import Multithreading.MyThread;

public class tester implements Runnable {

	@Override
	public void run() {
		String name=MyThread.currentThread().getName();
		display(name);
		System.out.println("running thread");
	}
	
	public void display(String name) {
		System.out.println("name"+name);
	}
	
	
	
	public static void main(String[] args) {

		
		
		
		
	}
}
