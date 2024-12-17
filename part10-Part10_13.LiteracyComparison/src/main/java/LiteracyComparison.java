
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class LiteracyComparison {

    public static void main(String[] args) {
        readData();

    }

    public static List<DataComparison> readData() {
        List<DataComparison> data = new ArrayList<>();

        String fileName = "literacy.csv";

        try {
            Files.lines(Paths.get(fileName))
                    .map(row -> row.split(","))
                    .filter(parts -> parts.length >= 5)
                    .map(parts -> new DataComparison(parts[0], parts[1], parts[2], parts[3], Integer.valueOf(parts[4]),
                            Double.valueOf(parts[5])))
                    .forEach(person -> data.add(person));

        } catch (Exception e) {
            // TODO: handle exception
        }

        data.stream()
                .sorted((p1, p2) -> Double.compare(p1.getLiteracyPercent(), p2.getLiteracyPercent()))
                .forEach(datas -> System.out.println(datas));
        return data;
    }

}
