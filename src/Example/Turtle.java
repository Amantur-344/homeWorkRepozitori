package Example;

public class Turtle implements Swimable {
    @Override
    public void swim() {
        System.out.println("Я черепаха я плаваю");
    }

    @Override
    public void makeNoise() {
        System.out.println("Я черепаха ");
    }
}
