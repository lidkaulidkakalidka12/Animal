package animal;

public class Horse extends Animal{

    public Horse(String food, String location) {

        super(food, location);
    }

    @Override
    public String makeNoise() {
        return "Horse makes a sound: \"Yo-ho-ho\"";
    }

    @Override
    public String eat() {
        return "Horse eats oats";
    }

    @Override
    public String toString() {
        return "Horse{" +
                "food='" + food + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
