package by.dm_bzh.grow.Dragon.interfaces;

import java.util.ArrayList;

import by.dm_bzh.grow.Dragon.main.Treasure;

public interface DBaccess {
    public boolean saveTreasure(Treasure tr);
    public ArrayList<Treasure> readTreasures();
}
