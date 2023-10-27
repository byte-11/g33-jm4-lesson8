package serialized;

import task3.Student;

import java.io.Serializable;

public class StudentList implements Serializable {
    private Student[] students;

    public StudentList(Student[] students) {
        this.students = students;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
}
