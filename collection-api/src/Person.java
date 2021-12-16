
public class Person implements Comparable<Person> {
		private String name;
		private int age;

		public Person() {
		}
		public Person(String name,int age) {
			this.age=age;
			this.name = name;
		}
		public String getName() {
			return name;
		}
		public int getAge() {
			return age;
		}
		@Override
		public String toString() {
			return "Person [name="+name+", age="+age+"]";
		}
		@Override
		public int compareTo(Person o) {
			return 0;
		}
}

