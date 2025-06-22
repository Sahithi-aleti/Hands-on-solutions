package singleton;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger logger1 = Logger.getInstance();
	    logger1.log("This is the first log.");

	    Logger logger2 = Logger.getInstance();
	    logger2.log("This is the second log.");
	    System.out.println("Same instance? " + (logger1 == logger2));

	}

}
