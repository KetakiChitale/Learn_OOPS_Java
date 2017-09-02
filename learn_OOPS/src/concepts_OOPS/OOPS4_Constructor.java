package concepts_OOPS;
/*Constructor chaining - 
 *When the constructor calls another constructor of the same class
 *it is called constructor chaining.
 *Purpose - you can pass arguments to multiple constructors,can initialize the argument only once.
 *What if we don't chain ? - If two different constructors need same argument the we have to initialize it twice.
 *if initialization changes we have to change the argument in every constructor. 
 *
 *RULE - Constructor with fewer arguments should call those constructors who have more methods.*/

public class OOPS4_Constructor {
	public String name;
	public int id;
	public String addrs;
    
	//no-arg constructor
	public OOPS4_Constructor(){
		this("Gimmy");
	}
	public OOPS4_Constructor(String str){
		this(str, 105);
	}
	public OOPS4_Constructor(String str, int eid){
		this(str, eid, "Boston");
	}
	public OOPS4_Constructor(String str, int eid, String address){
		this.name = str;
		this.id = eid;
		this.addrs = address;
	}
	public void show(){
		System.out.println("Name : " + name);
		System.out.println("ID : " + id);
		System.out.println("Address : " + addrs);
	}
	
	public static void main(String[] args){
		OOPS4_Constructor obj = new OOPS4_Constructor();
		obj.show();
	}
}
