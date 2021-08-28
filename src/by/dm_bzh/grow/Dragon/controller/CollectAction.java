package by.dm_bzh.grow.Dragon.controller;

import java.util.ArrayList;
import by.dm_bzh.grow.Dragon.in_out.ToShow;
import by.dm_bzh.grow.Dragon.interfaces.Command;
import by.dm_bzh.grow.Dragon.main.Treasure;
import by.dm_bzh.grow.Dragon.service.Treasures;

//выбор сокровищ на сумму
public class CollectAction implements Command {

    @Override
    public String execute() {
        String str;
        Treasures tr = Treasures.getInstance();
        ArrayList<Treasure> list = tr.CollectTreasures();
        int sum=0;
        for (Treasure treasure : list) {                                //Вычисляем сумму сокровищ
            sum+=treasure.getPrice()*treasure.getQuantity();
        }
        if (list.isEmpty()) str = "Список выбранных сокровищ пуст";
            else  str = ToShow.showMany("Выбрано сокровищ на сумму - " + sum +". Список выбранных сокровищ:", list);
        return str;   
    }
}
