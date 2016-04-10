/**
 * 
 */

/**
 * @author Emilija
 *
 */
public class ZipMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ZipCode zip = new ZipCode();
		try{
			zip.setZip("12345");
			//zip.setZip("ddd");
			zip.setZip(null);
			
		}
		catch(InvalidFormatException ex){
			System.out.println("Invalid format!");
			
		}
		catch(NullPointerException np)
		{
			System.out.println("Null pointer");
		}
		zip.print();
		
	}


}
