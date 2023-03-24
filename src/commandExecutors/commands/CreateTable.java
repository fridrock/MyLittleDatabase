package commandExecutors.commands;

import commandExecutors.Command;
import ouput.CommandOutput;
import store.Field;

public class CreateTable extends Command {
    private Field[] fields;
    private String name;
    public CreateTable(String name, Field[] fields) {
        this.name = name;
        this.fields = fields;
    }

    @Override
    public CommandOutput execute() {
        return store.createTable(name, fields);
    }
}
