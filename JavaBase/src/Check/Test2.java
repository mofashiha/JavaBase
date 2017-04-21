package Check;

public class Test2 {

	public static void main(String[] args) throws Exception {
		
    Thread thread=new Thread(new Thread1());
	
    thread.start();
    
	}

}
