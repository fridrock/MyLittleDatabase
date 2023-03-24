package commandExecutors;



import ouput.CommandOutput;
import store.Store;

import java.util.List;

public abstract class Command {
    protected Store store = Store.getInstance();
    public abstract CommandOutput execute();
}
