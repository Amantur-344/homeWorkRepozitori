package Example;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String [] args) throws IOException {



        FileWriter fileWriter = new FileWriter("text.txt");
        fileWriter.write("hello world!\n");
        fileWriter.write("hello world 2");
        fileWriter.close();

        fileWriter = new FileWriter("numbers.txt");
        for(int i = 0; i < 10; i++) {
            fileWriter.write(i + "\n");
        }
        fileWriter.close();

        fileWriter = new FileWriter("alphabet.txt");
        for(int i = 65; i < 91; i++) {
            char c = (char)i;
            fileWriter.write(c + "\n");
        }
        fileWriter.close();
}}
