import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        int x = 23, y = 54, z = 58;
//        String name = "Saram";
//        System.out.println(name + " is " + z + " years old.");
//        System.out.println(name.length());
//        System.out.println(name.toUpperCase());
//        System.out.println(name.contains("ara"));
        List<String> restaurants = new ArrayList<>();
        Scanner list = null;
        try {
            list = new Scanner(new File("D:\\Uni Work\\2nd Semester\\Programming Fundamentals\\Food Delivery\\restaurants.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        while (list.hasNext()){
            restaurants.add(list.nextLine());
        }
        for (String value : restaurants) {
            System.out.println(value);

        }
    }
}