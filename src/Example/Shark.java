package Example;

public class Shark implements Swimable {
    @Override
    public void swim (){
        System.out.println("Я акула, я умею плавать");
    }
    @Override
    public void makeNoise () {
        System.out.println("Я акула");
    }
}
