package by.dm_bzh.grow.Dragon.controller;


import by.dm_bzh.grow.Dragon.in_out.ToShow;
import by.dm_bzh.grow.Dragon.interfaces.Command;
import by.dm_bzh.grow.Dragon.main.Treasure;
import by.dm_bzh.grow.Dragon.service.Treasures;

public class GetExpensiveAction implements Command {

    @Override
    public String execute() {
        String str;
        Treasures tr = Treasures.getInstance();
        Treasure treasure = tr.getMostExpensive();
        if (treasure==null) str = "Список сокровищ пуст";
            else  str = ToShow.showOne("Самое дорогое сокровище", treasure);
        return str;       
    }
    
    
}
