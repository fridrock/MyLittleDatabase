package store;

import java.util.ArrayList;
import java.util.List;

public class Table {
    private String tableName;
    private Field[] fields;
    private List<Entity> entities;
    Table(String tableName, Field[] fields){
        this.tableName = tableName;
        this.fields = fields;
        this.entities = new ArrayList<>();
    }

}
