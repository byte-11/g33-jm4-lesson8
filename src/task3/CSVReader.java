package task3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
    public List<Student> getStudentsFromCSV(String filePath) throws IOException {
        final BufferedReader bf = new BufferedReader(new FileReader(filePath));
        String nextLine = bf.readLine();

        final List<Student> students = new ArrayList<>();

        while ((nextLine = bf.readLine()) != null) {
            final String[] params = nextLine.split(",");
            students.add(new Student(
                    params[0],
                    Integer.parseInt(params[1]),
                    Double.parseDouble(params[2])
            ));
        }
        bf.close();

        return students;
    }
}
