package Service;

import Model.Table;
import Regex.Regix;

import java.util.List;

public class TableManager {
    List<Table> tableList;
    public void addTable(){
        System.out.println("Nhập id bàn");
        int idTable= Regix.enterInteger();
        System.out.println("Nhập số bàn :");
        int numberTable=Regix.enterInteger();

        Table table=new Table(idTable,numberTable);
        tableList.add(table);

    }
}
