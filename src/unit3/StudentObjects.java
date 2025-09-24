package unit3;

import java.util.ArrayList;
import java.util.Collections;

public class StudentObjects {
    public static void main(String[] args) {
        ArrayList<Student> stobj = new ArrayList<>();
        stobj.add(new Student(21, "Vijay",100));
        stobj.add(new Student(22, "rohit",18));
     stobj.add(new Student(23, "aman",19));
        stobj.add(new Student(24, "raman",10));
        stobj.add(new Student(25, "virat",25));
        stobj.add(new Student(26, "arjun",45));
        Collections.sort(stobj);
        for (Student st : stobj) {
            System.out.println("Name "+st.name+" Age "+st.age+" Roll "+st.roll_no);
        }
}
}
