
import javax.swing.UIManager;



public class Main {
	
	
	public static void main(String[] args) throws IllegalAccessException, Exception ,ClassCastException
	{
			new HomeFrame();
			 try 
			    { 
			        UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"); 
			    }
			    catch(Exception e){ 
			    	
			    }	
	}
}