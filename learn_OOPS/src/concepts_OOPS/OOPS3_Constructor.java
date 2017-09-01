package concepts_OOPS;
/*In this example we will see no-arg and parameterized constructor.*/
public class OOPS3_Constructor {
	private int a;
	//no-arg constructor
	OOPS3_Constructor(){
		this.a = 5;
	}
	
	OOPS3_Constructor(int p){
		this.a = p;
	}
	
	public int getValue(){
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OOPS3_Constructor obj = new OOPS3_Constructor();
		System.out.println("No-arg Constructor. int a = " + obj.a);
		OOPS3_Constructor obj1 = new OOPS3_Constructor(6);
		System.out.println("Parameterized Constructor. int a = " + obj1.a);
		System.out.println("getValue() = " + obj1.getValue());
	}

}
