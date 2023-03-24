package store;
import ouput.CommandOutput;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Database> dbs = new ArrayList<>();
    private static Store store;
    private int currentDb = -1;
    private Store(){

    }
    public static Store getInstance(){
        if(store==null){
            store = new Store();
        }
        return store;
    }
    public CommandOutput createDb(String dbName){
        this.dbs.add(new Database(dbName));
        currentDb = dbs.size()-1;
        return new CommandOutput("Created database called:" +dbName);
    }
    public CommandOutput useDb(String dbName){
        for(int i = 0;i<dbs.size();i++){
            if(dbs.get(i).getName()==dbName){
                currentDb = i;
                break;
            }
        }
        return new CommandOutput("Using database called:" +dbName);
    }
    public CommandOutput deleteDb(String dbName){
        for(int i = 0;i<dbs.size();i++){
            if(dbs.get(i).getName()==dbName){
                dbs.remove(i);
                break;
            }
        }
        return new CommandOutput("Deleted database called:" +dbName);
    }
    public CommandOutput createTable(String tableName, Field[] fields){
        Table table = new Table(tableName, fields);
        dbs.get(currentDb).addTable(table);
        return new CommandOutput("Created table called:" +tableName);
    }

}
