package by.dm_bzh.grow.Dragon.controller;

import java.util.HashMap;
import by.dm_bzh.grow.Dragon.interfaces.*;

//По выбранному действию вернуть объект-исполнитель
public class ChoseAction {
    private HashMap<String, Command> commandsList;

    public ChoseAction(){
        commandsList = new HashMap<String, Command>();
        commandsList.put("showall", new ShowAction());
        commandsList.put("getExp", new  GetExpensiveAction());
        commandsList.put("add", new  AddAction());
        commandsList.put("take", new  CollectAction());
    }
    
    public Command getCommand(String str){
        return commandsList.get(str);
    }    
}
