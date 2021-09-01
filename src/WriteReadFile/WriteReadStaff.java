package WriteReadFile;

import Model.Staff;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteReadStaff {
    public static void writeFile(List<Staff> staffList) {

        try {
            File infile = new File("src\\Data\\staff.csv");
            FileWriter fw = new FileWriter(infile);
            BufferedWriter bw = new BufferedWriter(fw);

            for (Staff staff : staffList) {
                bw.write(staff.getId() +
                        ", " + staff.getName() +
                        ", " + staff.getDayOfBirth() +
                        ", " + staff.getWorkingPosition() +
                        "\n");
            }
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static List<Staff> readFile() {
        List<Staff> staffList = new ArrayList<>();
        try {
            File infile = new File("src\\Data\\staff.csv");
            if (!infile.exists()) {
                return staffList;
            }
            FileReader fr = new FileReader(infile);
            BufferedReader br = new BufferedReader(fr);

            String line;
            String splitBy = ", ";
            while ((line = br.readLine()) != null) {
                String[] staff = line.split(splitBy);
                Staff staff1 = new Staff();
                staff1.setId(Integer.parseInt(staff[0]));
                staff1.setName(staff[1]);
                staff1.setDayOfBirth(staff[2]);
                staff1.setWorkingPosition(staff[3]);
                staffList.add(staff1);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return staffList;
    }

}
