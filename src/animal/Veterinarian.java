package animal;

import java.util.Objects;

public class Veterinarian {

    private Animal animal;

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
    public String treatAnimal(Animal animal) {
        return animal.getFood() + " " + animal.getLocation();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Veterinarian that = (Veterinarian) o;
        return Objects.equals(animal, that.animal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(animal);
    }

    @Override
    public String toString() {
        return "Veterinarian{" +
                "animal=" + animal +
                '}';
    }
}

