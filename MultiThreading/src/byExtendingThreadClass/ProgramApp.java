package byExtendingThreadClass;

public class ProgramApp {

	public static void main(String[] args) {
		NumPrinting n=new NumPrinting();
		CharPrinting c=new CharPrinting();
		
		n.start();
		c.start();

	}

}
