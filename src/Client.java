import newPackage.Person;
import newPackage.PersonBuilder;

public class Client {

	public static void main(String[] args) {
		PersonBuilder personBuilder = new PersonBuilder();
		Person p = personBuilder.setName("John").setAge("26").build();
		
//		PersonBuilderNested nested = new PersonBuilderNested(new Person());
//		Person p = new Person();
		
//		PersonBuilderNested nested = new PersonBuilderNested();
		
		System.out.println(p);
	}
}
