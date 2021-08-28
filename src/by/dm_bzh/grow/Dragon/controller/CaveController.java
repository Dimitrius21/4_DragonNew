package by.dm_bzh.grow.Dragon.controller;

import by.dm_bzh.grow.Dragon.interfaces.Command;

//Выбор объекта с методом исполнителем полученной задачи и его запуск
public class CaveController {
   
    private ChoseAction choise=new ChoseAction();
    Command command;
    
    public String  actions(String str) {
   
        command = choise.getCommand(str);
        return command.execute(); 
        
    }
}
