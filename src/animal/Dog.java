package animal;

public class Dog extends Animal{

    public Dog(String food, String location) {
        super(food, location);
    }

    @Override
    public String makeNoise() {
        return "Dog makes a sound: \"Gouw\"";
    }

    @Override
    public String eat() {
        return "Dog eats Chappi";
    }

    @Override
    public String toString() {
        return "Dog{" +
                "food='" + food + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
