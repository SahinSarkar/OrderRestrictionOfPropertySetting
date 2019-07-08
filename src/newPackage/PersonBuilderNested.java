package newPackage;

public class PersonBuilderNested {
	
	private Person person;
	
	PersonBuilderNested(Person person) {
		this.person = person;
	}
	
	public PersonBuilderNested setAge(String string) {
		person.setAge(string);
		return this;
	}
	
	public Person build() {
		return person;
	}
}