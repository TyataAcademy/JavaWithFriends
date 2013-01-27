
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

	public static void main(String[] args) {
		
			String sampleString = "\"testing string reversal\"";
			int sampleStringLength = sampleString.length();
			
			//output original string using subSequence 
			System.out.print("This is the original text: ");
			CharSequence originalSampleString = sampleString.subSequence(0, sampleStringLength);
			System.out.print(originalSampleString.toString());
			
			
			//output reverse text by looping through string using charAt
			System.out.print("\n\nThis is the original text in reverse: " );
			for (int i = 0; i < sampleStringLength; i++) {
				System.out.print(sampleString.charAt((sampleStringLength-1) - i));
			}
	
	}

}
