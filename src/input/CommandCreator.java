package input;

import commandExecutors.Command;

import java.util.Arrays;
import java.util.List;

public class CommandCreator {
    public static Command createCommandOnString(String commandString){
        List<String> parts  = getPartsOfCommand(commandString);
        String commandType = parts.get(0);

        return new Command();
    }
    private static List<String> getPartsOfCommand(String commandString){
        List<String> parts = Arrays.asList(commandString.split(" "));
        //TODO handle () and other stuff
        return parts;
    }
}
