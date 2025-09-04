package unit3;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Collections;

public class LinkedLIst1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elemenets");
        int  n = sc.nextInt();
        for( int i =0;i<n;i++){
            list.add(sc.nextInt());}
            Iterator itr = list.iterator();
            while(itr.hasNext())
                System.out.println(itr.next());
            Collections.sort(list);
            System.out.println(list);
            System.out.println(("Mininimum"+list.getFirst()));
            System.out.println(("Maximum"+list.getLast()));
        }
    }




