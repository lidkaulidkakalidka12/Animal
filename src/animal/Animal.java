package animal;

public abstract class Animal {
    protected String food;
    protected String location;


    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public abstract String makeNoise();

    public abstract String eat();

    public String sleep(){
        return "Sees a sweet dream";
    }
}
