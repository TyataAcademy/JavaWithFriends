package homeWork1;
/*
 * Test class is the class to implement all the available abstract methods of CharSequence Interface.
 * In this class we have main method where we trying to reverse a provided string using all four
 * implemented methods of the CharSequence Interface.
 * @author Sunil Tyata
 * @version 01.25.2013
 */

public class TestClass1 implements CharSequence{
	private String str;
	
	/*
	 * Constructor of TestClass1
	 * @parameter String as s
	 */
	public TestClass1(String s){
		str = s;
	}
	
	/*
	 * Is an implemented method of CharSequence Interface
	 * (non-Javadoc)
	 * @see java.lang.CharSequence#charAt(int)
	 */
	public char charAt(int index){
		return str.charAt(str.length()-1-index);
	}

	/*
	 * Is a implemented method of CharSequence Interface
	 * (non-Javadoc)
	 * @see java.lang.CharSequence#length()
	 */
	public int length() {
		return str.length();
	}

	/*
	 * Is an implemented method of CharSequence Interface  
	 * (non-Javadoc)
	 * @see java.lang.CharSequence#subSequence(int, int)
	 */
	public CharSequence subSequence(int arg0, int arg1) {
		
		CharSequence cs = new String(reverse(str.substring(arg0, arg1)));
		return cs;
	}
	
	/*
	 * reverse method is not implemented method from CharSequence Inerface
	 * @return String as reverse message
	 */
	public String reverse(String s){
		if(s.length()<=1){
			return s;
		}
		return reverse(s.substring(1, s.length()))+s.charAt(0);
	}
	
	/*
	 * Is an implemented method of CharSequence Interface  
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		return str;
	}
	
	/*
	 * Is the main method where we call all the implemented methods of CharSequence Inerface.
	 */
	public static void main(String[] args){
		String testString = "JavaBeans Naming Standards";
		TestClass1 tc1 = new TestClass1(testString);
		System.out.println("\nOriginal Message: "+tc1.toString());
		
		//Using both chatAt and length methods 
		System.out.print("\nReverse Message using CharAt and length methods : ");
		for(int i=0;i<tc1.length();i++){
			System.out.print(tc1.charAt(i));
		}
		
		//Using subSequence and toString methods
		System.out.print("\n\nReverse Message using subSequence and toString methods: ");
		System.out.println(tc1.subSequence(0,tc1.length()).toString());
		
	}//End of main method
	
}//End of TestClass1 
