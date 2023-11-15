package exercise4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Map<String, String> locations = new HashMap<>();

        locations.put("Wasington", "Woles");
        locations.put("London", "Stevens");
        locations.put("Berlin", "Volzen");

        System.out.println("Enter location:");
        Scanner sc = new Scanner(System.in);
        String city = sc.next();

        System.out.println(locations.get(city));
    }
}
