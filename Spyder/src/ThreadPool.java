import java.util.concurrent.*;

public class ThreadPool implements Runnable { // Concurrency API

	@Override
	public void run() {
		System.out.println("Thread running from pool");
	}

	public static void main(String[] args) {

		ThreadPool rable = new ThreadPool();

//		Executor pool = Executors.newFixedThreadPool(10);
		ExecutorService servce=Executors.newFixedThreadPool(10);
		for (int c = 1; c <= 10; c++)
//			pool.execute(rable);
			servce.execute(rable);
	}

}
