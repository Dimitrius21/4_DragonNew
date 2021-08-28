package by.dm_bzh.grow.Dragon.controller;

import java.util.ArrayList;

import by.dm_bzh.grow.Dragon.in_out.ToShow;
import by.dm_bzh.grow.Dragon.interfaces.*;
import by.dm_bzh.grow.Dragon.main.Treasure;
import by.dm_bzh.grow.Dragon.service.Treasures;

//Отобразить список всех сокровищ
public class ShowAction implements Command {

    @Override
    public String execute(){
        String str;
        Treasures tr = Treasures.getInstance();
        ArrayList<Treasure> list = tr.getTreasuresList();
        if (list.isEmpty()) str = "Список сокровищ пуст";
            else  str = ToShow.showMany("Список всех сокровищ", list);
        return str;
    }    
}
