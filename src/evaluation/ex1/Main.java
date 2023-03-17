package evaluation.ex1;


public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.setCatName("Misty");
        myCat.speak();

        Dog myDog = new Dog();
        myDog.setDogName("Rufus");
        myDog.bark();
    }
}