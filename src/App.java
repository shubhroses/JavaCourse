import java.util.Date;

import javax.sound.midi.Soundbank;

import java.awt.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int age = 30; //Dont neet to allocate memory
        age = 35;
        System.out.println(age);

        int viewsCount = 123_456_789;
        long cnt = 3_123_456_789l;
        float price = 10.99f;

        char letter = 'A';
        boolean isEligable = false;

        Date now = new Date(); // Must allocate memory for reference types
        System.out.println(now);

        Point point1 = new Point(1, 2); //Stores a reference to an object somewhere in memory 
        Point point2 = point1;
        point1.x = 2;

        System.out.println(point2);

        String message = "Hello World";
        System.out.println(message.endsWith("World")); 
        System.out.println(message);

        //48.12 in https://www.youtube.com/watch?v=eIrMbAQSU34&ab_channel=ProgrammingwithMosh
    }
}
