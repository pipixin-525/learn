package code012;

public class Demo98Instanceof {

    public static void main(String[] args) {
        Demo98Animal animal = new Demo98Cat();
        animal.eat();

        giveMeAPat(new Demo98Cat());
    }

    public static void giveMeAPat(Demo98Animal animal) {
        if (animal instanceof Demo98Dog) {
            Demo98Dog dog = (Demo98Dog) animal;
            dog.watchHouse();
        }
        if (animal instanceof Demo98Cat) {
            Demo98Cat cat = (Demo98Cat) animal;
            cat.catchMouse();
        }
    }
}
