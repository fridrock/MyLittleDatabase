package commandExecutors.commands;

import commandExecutors.Command;
import ouput.CommandOutput;

public class UseDatabase extends Command {
    private String name;

    public UseDatabase(String name) {
        this.name = name;
    }

    @Override
    public CommandOutput execute() {
        return store.useDb(name);
    }
}
