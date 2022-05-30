package animal;

public class Cat extends Animal{

    public Cat(String food, String location) {
        super(food, location);
    }

    @Override
    public String makeNoise() {
        return "Cat makes a sound: \"Meow\"";
    }

    @Override
    public String eat() {
        return "Cat eats Whiskas";

    }

    @Override
    public String toString() {
        return "Cat{" +
                "food='" + food + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
