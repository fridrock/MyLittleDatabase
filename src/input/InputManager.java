package input;

import commandExecutors.Command;

import java.util.Scanner;

public class InputManager {
    private Scanner scanner;
    public InputManager(){
        this.scanner = new Scanner(System.in);
    }
    public Command getCommand(){
        String commandLine="";
        while(scanner.hasNextLine()){
            commandLine += scanner.nextLine();
            if(commandLine.equals("quit")){
                //returning null means finish input of program
                return null;
            }            //this is the end of command
            if(commandLine.charAt(commandLine.length()-1)==';'){
                //create command with this line
                System.out.println(commandLine);
                break;
            }
        }
        return CommandCreator.createCommandOnString(commandLine);
    }

}
