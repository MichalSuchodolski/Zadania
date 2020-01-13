package HelloWord;

import java.util.ArrayList;

public class Student {

    String name;
    String surname;

    static ArrayList<Student> studentlist = new ArrayList<>();

    static {
        new Student("Jan", "Kowalski");
    }

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
        studentlist.add(this);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public String printList(){
        return studentlist.toString();
    }



    public static void main(String[] args) {
        Student student1 = new Student("Michal", "Suchodolski");
        Student student2 = new Student("Janusz", "Wanda");
        System.out.println(studentlist);

    }


}









