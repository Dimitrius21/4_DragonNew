package by.dm_bzh.grow.Dragon.dal;

import by.dm_bzh.grow.Dragon.interfaces.DBaccess;

public class DataProvider {
    private final static DataProvider instance = new DataProvider();
    private final DBaccess DAOTreasure  = new FileData();

    private DataProvider(){}

    public static DataProvider getInstance() {
        return instance;
    }

    public FileData getDAOTreasure() {
        return  (FileData) DAOTreasure;        
    }

}
