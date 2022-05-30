package animal;

public class Main {
    public static void main(String[] args) {
        Veterinarian vet = new Veterinarian();
        Animal[] animals = {new Cat("Whiskas", "Sofa"), new Dog("Chappi", "Mat"),
                            new Horse("Oats", "Barn")};

        for (int i = 0; i < animals.length; i++) {
            System.out.println(vet.treatAnimal(animals[i]));
        }
    }
}
