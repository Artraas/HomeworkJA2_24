package exercise2;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter word one");
        Scanner s1 = new Scanner(System.in);
        String one = s1.next();
        System.out.println("Enter word two");
        Scanner s2 = new Scanner(System.in);
        String two = s2.next();
        System.out.println("Enter word three");
        Scanner s3 = new Scanner(System.in);
        String three = s3.next();
        System.out.println("Enter word four");
        Scanner s4 = new Scanner(System.in);
        String four = s4.next();
        System.out.println("Enter word five");
        Scanner s5 = new Scanner(System.in);
        String five = s5.next();

        List<String> words = new LinkedList<>();
        words.add(one);
        words.add(two);
        words.add(three);
        words.add(four);
        words.add(five);

        List<String> words1 = Main.doubleValues(words);;

        ListIterator iterator = words1.listIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    private static List<String>  doubleValues(List<String> a){

        List<String> b = new LinkedList<>();

        for (int i = 0; i < a.size(); i++){

            b.add(String.valueOf(a.get(i)));
            b.add(String.valueOf(a.get(i)));

        }
        return b;
    }
}