/**
 * 
 */

/**
 * @author Emilija
 * 
 */
public class ZipCode {

	private String zip;

	public ZipCode() {
		super();
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {

		boolean allDigits = true;

		if (zip == null) {
			throw new NullPointerException();
		}

		for (int i = 0; i < zip.length(); i++) {
			if (!Character.isDigit(zip.charAt(i))) {
				allDigits = false;

			}
		}

		if (zip.length() != 5 && zip.length() != 9 || !allDigits) {

			throw new InvalidFormatException();
		}
		this.zip = zip;

	}

	public void print() {
		System.out.println(this.zip);
	}

}