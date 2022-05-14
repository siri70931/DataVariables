package opeartors;

public class Range {

	public static void main(String[] args) {
		byte maxbyte=127;
		byte minbyte=-128;
		System.out.println("Min range is" +minbyte+"Max range is "+maxbyte);
		short maxshort=32767;
		short minshort=-32768;
		System.out.println("Min range is" +minshort+"Max range is "+maxshort);
		int maxint=2147483647;
		int minint=-2147483648;
		System.out.println("Min range is" +minint+"Max range is "+maxint);
		long maxlong=9223372036854775807L;
		long minlong=9223372036854775807L;
		System.out.println("Min range is" +minlong+"Max range is "+maxlong);
		float f=3234.141243278345f;
		double d=3456.14124512345678902345678914f;
		System.out.println("float value is " +f+"double value is "+d);
	}

}
