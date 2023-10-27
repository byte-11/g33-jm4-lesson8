import task3.CSVReader;
import task3.FileManager;
import task3.Student;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        CSVReader csvReader = new CSVReader();
        final FileManager fileManager = new FileManager();

        final List<Student> students = csvReader.getStudentsFromCSV("resources/info.csv");
        fileManager.writeStudentsAnalysis(students, "resources/analysis.txt");
    }
}