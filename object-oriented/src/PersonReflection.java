import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.text.DateFormat.Field;

public class PersonReflection {
	public static void main(String[] args) {
		Person p1= new Person("Ruksana",26);
		System.out.println(p1);
		//loading a java class manually
		Class pc=Class.forName("Person");//p1.getClass();
		System.out.println(pc.getName());
		
		Constructor[] constructors=pc.getConstructors();
		System.out.println("---List of Constructors");
		for(Constructor c: constructors)
			System.out.println(c);
		
		Method[] methods=pc.getMethods();
		System.out.println("--List of methods");
		for(Method m:methods)
			System.out.println(m);
		
		Method[] decMethods=pc.getDeclaredMethods();
		System.out.println("--List of declared methods..");
		for(Method m: decMethods)
			System.out.println(m);
		
		Field[] fields=pc.getFields();
		System.out.println("--List of fields..");
		for(Field f:fields)
			System.out.println(f);
				
	    Field[] decFields =pc.getDeclaredFields();
				System.out.println("--List of Declared fields..");
				for(Field f:decFields)
					System.out.println(f);
			}
	

}
