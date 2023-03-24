package core;

import commandExecutors.Command;
import commandExecutors.CommandExecutor;
import input.InputManager;
import ouput.CommandOutput;
import ouput.OutputManager;

public class App {
    //app start method produce next steps
    //1)Get user input from InputManager class
    //2)Get Command from InputManager class
    //3)Send Command to CommandExecutor class
    //4)Behind the scene CommandExecutor use Store class to manipulate data
    //5)CommandExecutor returns result of Command
    //6)This result is sent to OutPutManager
    private InputManager inputManager;
    private CommandExecutor commandExecutor;
    private OutputManager outputManager;
    public App(){
        inputManager = new InputManager();
        commandExecutor = new CommandExecutor();
        outputManager = new OutputManager();
    }
    public void start(){
        //TODO make bad command
        Command currentCommand;
        while((currentCommand = inputManager.getCommand())!=null){
            CommandOutput output = commandExecutor.executeCommand(currentCommand);
            outputManager.output(output);
        }
    }
}
