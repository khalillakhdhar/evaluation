package evaluation.ex1;

class Cat extends Animal {
    private String catName;

    public void setCatName(String name) {
        catName = name;
    }

    @Override
    public void speak() {
        System.out.println("Je suis un chat");
    }

	public String getCatName() {
		return catName;
	}

	@Override
	public String toString() {
		return "Cat [catName=" + catName + "]";
	}
	
}
