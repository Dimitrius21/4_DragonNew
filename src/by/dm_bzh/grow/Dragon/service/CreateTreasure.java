package by.dm_bzh.grow.Dragon.service;

import by.dm_bzh.grow.Dragon.in_out.Input;
import by.dm_bzh.grow.Dragon.main.Treasure;

public class CreateTreasure {
    public static Treasure create() {        
        String name;
        int qt, price;
        System.out.println("\nДобавление нового сокровища\n");
        name=Input.InpString("Введите название сокровища");                
        price=Input.InpInt("Введите цену единицы сокровища");        
        qt=Input.InpInt("Введите количество сокровища");                        
        return new Treasure(name, qt, price);        
    }
    
}
