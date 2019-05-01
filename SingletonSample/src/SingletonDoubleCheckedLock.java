
public class SingletonDoubleCheckedLock {
	 
	
	// Step 1: private static variable of INSTANCE variable
//    private static SingletonDoubleCheckedLock INSTANCE;
    private static volatile SingletonDoubleCheckedLock INSTANCE;
  
    // Step 2: private constructor
    private SingletonDoubleCheckedLock() {
  
    }
  
    // Step 3: Provide public static getInstance() method 
    // returning INSTANCE after checking
    public static SingletonDoubleCheckedLock getInstance() {
  
        // double-checking lock
        if(INSTANCE==null){
      
            // synchronized block
            synchronized (SingletonDoubleCheckedLock.class) {
                if(INSTANCE==null){
                    INSTANCE = new SingletonDoubleCheckedLock();
                }
            }
        }
        return INSTANCE;
    }
}
