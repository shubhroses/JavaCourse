import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

import java.awt.*;
import java.text.NumberFormat;

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

        System.out.println(message.replace("Hello", "What A"));
        System.out.println(message);

        // Any methods that modify a string create a copy of the string
        System.out.println(message.toLowerCase());


        System.out.println("Hello \"World\"");
        System.out.println("c: \\Windows\\..");
        System.out.println("c: \nWindows\\..");
        System.out.println("c: \tWindows\\..");

        /*
         * 
         * 
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
         * 
         */
        
        int[] numbers = {2, 3, 5, 1, 4};
        System.out.println(numbers.length); 
        Arrays.sort(numbers);
        
        System.out.println(Arrays.toString(numbers));

        // Method overloading, implementing the same method but for different data types

        //Multi dimensional array
        int[][] nums = new int[2][3];
        nums[0][0] = 1;
        System.out.println(Arrays.deepToString(nums));

        int[][] newNums = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(Arrays.deepToString(newNums));

        final float PI = 3.14F; //Treated as a constant 
        System.out.println(PI);

        //Arithmetic Expressions
        System.out.println(10/3);
        System.out.println((double)10/(double)3);

        int z = 1;
        System.out.println(z++);

        short x = 1;
        int y = x+2;
        // Short has 2 bytes, int has 4 bytes. 
        // It create a new x of type int and then adds, this is implicit casting 
        //byte > short > int > long > float > double
        System.out.println(y);

        double a = 1.1;
        int b = (int)a + 2;
        System.out.println(b);


        double strToInt = Double.parseDouble("123.1");
        System.out.println(strToInt);

        int result = Math.round(1.1F);

        int res = (int) Math.round(Math.random()*100);
        System.out.println(res);
        //Since we are storing a long into an int we can use explicit casting

        // Formating numbers
        //DOnt use new with abstract classes
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String re = currency.format(123456.891);
        System.out.println(re);

        String percent = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(percent);

        //Reading input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Age: ");
        Double c = scanner.nextDouble();
        System.out.println("Your are "+ c);

        Scanner scan = new Scanner(System.in);
        System.out.println("Name: ");
        String name = scan.nextLine().trim();
        System.out.println("You are " + name);


        //1:18.00 in https://www.youtube.com/watch?v=eIrMbAQSU34&ab_channel=ProgrammingwithMosh
    }
}
