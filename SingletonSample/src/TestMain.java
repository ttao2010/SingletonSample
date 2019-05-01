
public class TestMain {

	public static void main(String[] args) {
		
		AThread t1 = new AThread();
		AThread t2 = new AThread();
		AThread t3 = new AThread();
        Thread tt1 = new Thread(t1);
        Thread tt2 = new Thread(t2);
        Thread tt3 = new Thread(t3);
        Thread tt4 = new Thread(t1);
        Thread tt5 = new Thread(t1);
        tt1.start();
        tt2.start();
        tt3.start();
        tt4.start();
        tt5.start();

	}

}


/*result:
Thread-0 : 53313472
Thread-0 : 53313472
Thread-0 : 53313472
Thread-0 : 53313472
Thread-0 : 53313472
Thread-1 : 53313472
Thread-2 : 53313472
Thread-2 : 53313472
Thread-2 : 53313472
Thread-2 : 53313472
Thread-2 : 53313472
Thread-3 : 53313472
Thread-4 : 53313472
Thread-4 : 53313472
Thread-4 : 53313472
Thread-4 : 53313472
Thread-4 : 53313472
Thread-3 : 53313472
Thread-3 : 53313472
Thread-3 : 53313472
Thread-3 : 53313472
Thread-1 : 53313472
Thread-1 : 53313472
Thread-1 : 53313472
Thread-1 : 53313472
*/