package serialized;

import task3.Student;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        StudentList studentList = new StudentList(
//                new Student[]{
//                        new Student("Alice", 24, 80),
//                        new Student("Bob", 24, 79),
//                        new Student("Ann", 24, 87),
//                        new Student("John", 24, 50)
//                });
//
//        ObjectOutputStream ous = new ObjectOutputStream(
//                new FileOutputStream("resources/students_list.txt")
//        );
//        ous.writeObject(studentList);
        ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("resources/students_list.txt")
        );
        StudentList studentList = (StudentList) ois.readObject();
        for (Student student : studentList.getStudents()) {
            System.out.println(student);
        }

    }

}
