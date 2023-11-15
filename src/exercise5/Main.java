package exercise5;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> str = new LinkedList<>();

         do {
            System.out.println("Enter location:");
            Scanner sc = new Scanner(System.in);
            String city = sc.next();

            if(city.equals("end")){
                break;
            }

            str.add(city);

        }while (!str.getLast().equals("end"));

        System.out.println(str);

    }
}
