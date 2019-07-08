package newPackage;

public class PersonBuilder {

	PersonBuilderNested nestedPersonBuilder;

	public PersonBuilderNested setName(String string) {
		Person person = new Person();
		person.setName(string);
		PersonBuilderNested nestedBuilder = new PersonBuilderNested(person);
		return nestedBuilder;
	}
}

