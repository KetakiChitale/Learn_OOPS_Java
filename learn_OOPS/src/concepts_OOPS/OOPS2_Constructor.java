package concepts_OOPS;
/*Types of COnstructor - 
 *There are three types of Constructor - Default, No-arg and Parameterized.
 *
 *Default constructor - If user doesn't create any constructor then compiler 
 *will create default constructor. It would be inserted when compiling hence it
 *is not visible in the source code.
 *
 *No-arg constructor - Similar to default constructor but user-defined.
 *No default constructor is created by the compiler in this case.
 *
 *Parameterized Constructor - Constructor with arguments / parameters.
 **/


public class OOPS2_Constructor {
	int a;
	String str;
	
	OOPS2_Constructor(int m, String string){
		this.a = m;
		this.str = string;
		System.out.println("Parameterized Constructor");
	}
	
	public static void main(String[] args){
		OOPS2_Constructor obj = new OOPS2_Constructor(5,"Five");
		System.out.println("Int a : " + obj.a);
		System.out.println("String str : " + obj.str);
	}

}
