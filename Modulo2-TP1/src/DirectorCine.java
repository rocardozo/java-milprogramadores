
public class DirectorCine {

//	attributes
	private String name;
	private String lastName;
	private int age;
	
	
//	methods
	
	public DirectorCine() {
		
	}
	
	
	public DirectorCine(String name, String lastName, int age) {
		
		this.name     = name;
		this.lastName = lastName;
		this.age      = age;
	}
	
	
//	setters
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
//	getters
	
	public String getName() {
		return name;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getAge() {
		return age;
	}
}
