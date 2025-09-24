package unit3;

public class Student implements Comparable<Student> {
    int age;
    String name;
    int roll_no;

    public Student( int age,String name,int roll_no) {
        this.name = name;
        this.age = age;
        this.roll_no = roll_no;
    }

    public Student(int age) {
        this.age = age;

    }

    public int compareTo(Student st)
{
    if(roll_no ==st.age)
        return 0;
    else if(roll_no > st.age)
        return 1;
    else
        return -1;
}
}
