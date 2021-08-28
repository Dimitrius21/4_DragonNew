package by.dm_bzh.grow.Dragon.controller;

import by.dm_bzh.grow.Dragon.in_out.ToShow;
import by.dm_bzh.grow.Dragon.interfaces.Command;
import by.dm_bzh.grow.Dragon.main.Treasure;
import by.dm_bzh.grow.Dragon.service.Treasures;

//Добавление сокровища в список
public class AddAction implements Command {

    @Override
    public String execute() {
        String str;
        Treasures tr = Treasures.getInstance();
        Treasure treasure = tr.addTreasure();
        if (treasure==null) str = "Ошибка сохранения. Сокровище не добавлено";
            else  str = ToShow.showOne("Сокровище добавлено", treasure);
        return str;    
    }
    
}
