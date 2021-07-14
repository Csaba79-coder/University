package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import specialization.Specialization;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static model.UnitType.DEFAULT;


public class Reader {

    public static List<Specialization> specializations = new ArrayList<>();

    public Reader() {
    }

    public static void Buffer(String fileName) throws IOException {
        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        for (String line; (line = bufferedReader.readLine()) != null; ) {
            String[] parts = line.split(";");
            // TODO creat lists (instantiaton!!!)
            specializations.add(new Specialization(parts[0], parts[1], parts[2], DEFAULT,
                    parts[4].split("|"), Integer.parseInt(parts[5]), parts[6].split("|")));
            System.out.println(line);
        }
    }

    public static List<Specialization> getSpecializations() {
        return specializations;
    }

    public static void printSpecializations() {
        for (int i = 0; i < specializations.size(); i++) {
            System.out.println(specializations.get(i).getNameOfSpecialization() + " : " + Arrays.toString(specializations.get(i).getRecommendedSemester()));
        }
    }
}
