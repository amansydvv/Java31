package unit3;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting1 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(12);
        al.add(13);
        al.add(4);
        al.add(1);
        al.add(2);
        Collections.sort(al);
        System.out.println(al);
    }
}
