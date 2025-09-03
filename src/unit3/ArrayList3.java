package unit3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayList3 {
    public static void main(String[] args) {
        ArrayList<String> Products = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of products");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            Products.add(sc.next());

        }
        Iterator itr = Products.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());

        }
//        Products.addLast("Aman");
//        Products.addFirst("Anshuman");
        //Collections.sort(Products);
        System.out.println(Products);
//        System.out.println(Products.getFirst());
//        System.out.println(Products.getLast());
    }

}