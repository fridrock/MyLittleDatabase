package commandExecutors.commands;

import commandExecutors.Command;
import ouput.CommandOutput;
import store.Store;

public class CreateDatabase extends Command {
    private String name;
    public CreateDatabase(String name){
        this.name = name;
    }
    @Override
    public CommandOutput execute() {
        return store.createDb(name);
    }
}
