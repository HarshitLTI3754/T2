
class car {

	private String model;
	private String[] features;

	public car(String model, String[] features) {
		this.model = model;
		this.features = features;
	}

	public void specs() {
		System.out.println(" features of model " + model);
		for (String feature : features)
			System.out.print(feature);
	}

	public static void main(String[] args) {
		String[] bmw = { "it", " is", " bmw" };
		car bmwa = new car("BMW", bmw);
		bmwa.specs();
		String[] audi = { "it", " is", " audi" };
		car audi1 = new car("AUDI", audi);
		audi1.specs();

	}

}
