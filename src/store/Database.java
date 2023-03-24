package store;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private String name;
    private List<Table> tables = new ArrayList<>();

    public String getName() {
        return name;
    }

    public List<Table> getTables() {
        return tables;
    }

    public Database(String name) {
        this.name = name;
    }
    public void addTable(Table table){
        tables.add(table);
    }
}
