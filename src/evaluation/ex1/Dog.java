package evaluation.ex1;



class Dog extends Animal {
    private String dogName;

    public String getDogName() {
		return dogName;
	}

	public void setDogName(String name) {
        dogName = name;
    }

    public void bark() {
        System.out.println("Je suis un chien");
    }
}
