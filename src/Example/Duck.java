package Example;

public class Duck implements Swimable {
    @Override
    public void swim (){
        System.out.println("Я утка, я умею плавать");
    }
    @Override
    public void makeNoise() {
        System.out.println("Я утка");
    }
}
