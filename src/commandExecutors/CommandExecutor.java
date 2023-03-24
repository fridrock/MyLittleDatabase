package commandExecutors;

import commandExecutors.commands.CreateDatabase;
import ouput.CommandOutput;
import store.Store;

public class CommandExecutor {

    public CommandOutput executeCommand(Command command){
        return command.execute();
    }


}

