package task3;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DataAnalysis {
    public double calculateAverageScore(final List<Student> students) {
        double sum = 0;
        for (Student student : students) {
            sum += student.getScore();
        }

        return sum / students.size();
    }

    public double getMaxScore(final List<Student> students) {
        return students.stream().max((s1, s2) -> {
            if (s1.getScore() > s2.getScore()) {
                return 1;
            } else if (s1.getScore() < s2.getScore()) {
                return -1;
            } else {
                return 0;
            }
        }).get().getScore();
    }

    public int getMaxAge(final List<Student> students) {
        return students.stream().max((s1, s2) -> {
            if (s1.getAge() > s2.getAge()) {
                return 1;
            } else if (s1.getAge() < s2.getAge()) {
                return -1;
            } else {
                return 0;
            }
        }).get().getAge();
    }

    public int totalEntries(final List<Student> students) {
        return students.size();
    }

    public List<Student> getStudentsWithMoreScore(final List<Student> students, final double score) {
        return students.stream()
                .filter(student -> student.getScore() > score)
                .collect(Collectors.toList());
    }

    public int getMinAge(final List<Student> students){
        return students.stream()
                .min(Comparator.comparing(Student::getAge))
                .get().getAge();
    }

}
