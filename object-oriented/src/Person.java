
public class Person {
	private String name;
	private int age;
	
	public Person(){
		//calling another constructor on the same object with matching signature.
		this("Anonymous",-1);//Constructor chaining...
	}
		public Person(String name, int age) {
		//super();
		this.name = name;
		this.age = age;
	}
		
	@Override
		public String toString() {
			return "Name:"+name+"\tAge:"+age;
		}
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person p=(Person)obj;
			if(p.name.equals(this.name)&& p.age==this.age)
				return true;
		}
		return false;
		
	}
	public void print() {
		System.out.println("Name:"+name+"\tAge:"+age);
	}
	public static void main(String[] args) {
		Person p1=new Person("Polo",22);
		p1.print();
		System.out.println(p1.hashCode());
		System.out.println(p1);// implicitly calling tostring method
		
		Person p2=new Person("polo",21);
		System.out.println(p2.hashCode());
		 System.out.println(p1.equals(p2));
}
	
	
}
