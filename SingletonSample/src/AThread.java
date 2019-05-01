
public class AThread implements Runnable {

	// run multiple times to see if the thread gets the different instance of Singleton due to lazy initialization  
   public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + SingletonDoubleCheckedLock.getInstance().hashCode());
        }
    }
}


