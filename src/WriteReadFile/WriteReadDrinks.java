package WriteReadFile;

import Model.Drinks;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteReadDrinks {
    public static void writeFile(List<Drinks> drinksList) {

        try {
            File infile = new File("src\\Data\\drinks.csv");
            FileWriter fw = new FileWriter(infile);
            BufferedWriter bw = new BufferedWriter(fw);

            for (Drinks drinks : drinksList) {
                bw.write(drinks.getIdDrinks() +
                        ", " + drinks.getType() +
                        ", " + drinks.getName() +
                        ", " + drinks.getPrice() +
                        "\n");
            }
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static List<Drinks> readFile() {
        List<Drinks> drinksList = new ArrayList<>();
        try {
            File infile = new File("src\\Data\\drinks.csv");
            if (!infile.exists()) {
                return drinksList;
            }
            FileReader fr = new FileReader(infile);
            BufferedReader br = new BufferedReader(fr);

            String line;
            String splitBy = ", ";
            while ((line = br.readLine()) != null) {
                String[] drinks = line.split(splitBy);
                Drinks drinks1 = new Drinks();
                drinks1.setIdDrinks(Integer.parseInt(drinks[0]));
                drinks1.setType(drinks[1]);
                drinks1.setName(drinks[2]);
                drinks1.setPrice(Integer.parseInt(drinks[3]));
                drinksList.add(drinks1);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return drinksList;
    }

}
