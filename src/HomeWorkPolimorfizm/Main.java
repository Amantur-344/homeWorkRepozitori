package HomeWorkPolimorfizm;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[]args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Что вы хотите купить?"+"\n"+"Water Food Clothes");
        String example = in.nextLine();
      //  Score score = new Score();
        ScoreInterface water =new Water();
        ScoreInterface food = new Food();
        ScoreInterface clothes = new Clothes();


        if (example.equals("water")){
            water.drink();
         //   score.water.drink();
        }else if (example.equals("food")){
            food.eat();
           // score.food.eat();
        }else if (example.equals("clothes")){
            clothes.putOn();
            //score.clothes.putOn();
       }

        FileWriter fileWriter = new FileWriter("homeWork.txt");
        fileWriter.write("1.Облегчение работы, вызывая методы в одном месте изпользуем его в разных друших класссах" +
                "и это очень сильно облегчает работу когда речь идет о больших проектах!!");
        fileWriter.write("2.чесно говоря я не понел что такое, но было связано с обьектами и ссылуами");
        fileWriter.write("3.Потому-что значинеи у них одинаковы например 5 акул 5 черепах и удобно сразу в одом " +
                "массиве и исправлять потом легче будет.");
        fileWriter.write("4.Они все заивисемы друг от друга!?");
        fileWriter.write("Создается массив персон но вот у него не будет места в памяти.");
        fileWriter.close();




    }
}
