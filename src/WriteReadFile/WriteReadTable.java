package WriteReadFile;

import Model.Staff;
import Model.Table;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteReadTable {
    public static void writeFile(List<Table> tableList) {

        try {
            File infile = new File("src\\Data\\table.csv");
            FileWriter fw = new FileWriter(infile);
            BufferedWriter bw = new BufferedWriter(fw);

            for (Table table : tableList) {
                bw.write(table.getTableID() +
                        ", " + table.getTableNumber() +
                        ", " + table.getOrder() +
                        "\n");
            }
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static List<Table> readFile() {
        List<Table> tableList = new ArrayList<>();
        try {
            File infile = new File("src\\Data\\table.csv");
            if (!infile.exists()) {
                return tableList;
            }
            FileReader fr = new FileReader(infile);
            BufferedReader br = new BufferedReader(fr);

            String line;
            String splitBy = ", ";
            while ((line = br.readLine()) != null) {
                String[] table = line.split(splitBy);
                Table table1 = new Table();
                table1.setTableID(Integer.parseInt(table[0]));
                table1.setTableNumber(Integer.parseInt(table[1]));



            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return tableList;
    }
}
