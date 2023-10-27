package task3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class FileManager {

    private final DataAnalysis dataAnalysis = new DataAnalysis();


    public void writeStudentsAnalysis(List<Student> students, String filePath) throws IOException {
        StringBuilder res = new StringBuilder();
        res.append("- Average score : " + dataAnalysis.calculateAverageScore(students) + "\n");
        res.append("- Max age : " + dataAnalysis.getMaxAge(students) + "\n");
        res.append("- Max score : " + dataAnalysis.getMaxScore(students) + "\n");
        res.append("- Total entries : " + dataAnalysis.totalEntries(students) + "\n");
        res.append("- Individuals with a Score > 80 : " +
                dataAnalysis.getStudentsWithMoreScore(students, 80).stream()
                        .map(s -> s.getName())
                        .collect(Collectors.toList()) + "\n");

        BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));
        bw.write(res.toString());
        bw.close();
    }
}
