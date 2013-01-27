
public class MyChar implements CharSequence {
	
	public char charAt(int index) {
		return 0;
	}

	public int length() {
		return 0;
	}

	public CharSequence subSequence(int start, int end) {
		return null;
	}
	
	public String toString(){
		return null;
	}
    
	//method to reverse string	
	public static String reverse(String sampleString){
		int sampleStringLength = sampleString.length();
		
		//output original string using subSequence 
		CharSequence originalSampleString = sampleString.subSequence(0, sampleStringLength);
		System.out.print(originalSampleString.toString());

		for (int i = 0; i < sampleStringLength; i++) {
			System.out.print(sampleString.charAt((sampleStringLength-1) - i));
		}
		return sampleString;
	}

	public static void main(String[] args) {
		
		System.out.print("This is the original text: ");
		String testString = "String reversal using CharSequence interface";
		
		System.out.print("\n\nThis is the original text in reverse: " );
		MyChar.reverse(testString);
		
	}

}
