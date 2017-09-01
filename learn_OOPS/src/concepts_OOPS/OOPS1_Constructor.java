package concepts_OOPS;
/*Constructor - 
 *A constructor resembles an instance method in java but it’s not a method as it doesn’t have a return type.
 *Constructor has same name as the class. */

public class OOPS1_Constructor {
	String name;
	OOPS1_Constructor(){
		this.name = "Simple Constructor";
	}
	
	public static void main(String[] args){
		OOPS1_Constructor obj = new OOPS1_Constructor();
		System.out.println("We are learning " + obj.name);
	}	
}
