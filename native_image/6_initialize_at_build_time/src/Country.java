public class Country {

	private String name;

	public Country(String name) {
		System.out.println("Create Country with name: " + name);
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
}
