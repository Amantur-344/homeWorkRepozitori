package Example;

public class Aquarium {
    public Swimable[] swimables;
    public Aquarium(int size) {
        if(size > 0) {
            swimables =new Swimable[size];
        }
    }
}
