package exercise3;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner numE = new Scanner(System.in);
        int num = numE.nextInt();

        LinkedList<Integer> list = Main.getIntegerList(num);

        int minValue = Main.getMinimum(list);

        System.out.println(minValue);
    }
    private static LinkedList<Integer> getIntegerList(int n){
        LinkedList<Integer> list = new LinkedList<>();

        Scanner num = new Scanner(System.in);

        for (int i = 0; i < n; i++){
            System.out.println("Enter next value");
            list.add(num.nextInt());
        }
        return list;
    }

    private static int getMinimum(LinkedList<Integer> list){
        int minValue = list.get(0);

        for (int i = 1; i < list.size(); i++){
            if (list.get(i) < minValue){
                minValue = list.get(i);
            }
        }
        return minValue;
    }
}
