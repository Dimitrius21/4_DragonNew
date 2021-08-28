package by.dm_bzh.grow.Dragon.dal;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

import by.dm_bzh.grow.Dragon.interfaces.DBaccess;
import by.dm_bzh.grow.Dragon.main.Treasure;

public class FileData implements DBaccess {
    private String fileName="data.scv";

    //Запись объекта "Сокровище" в файл
    public boolean saveTreasure(Treasure tr) {
        String str=String.format("%s;%d;%d\n", tr.getName(), tr.getQuantity(), tr.getPrice());                
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true));    
            bw.write(str);
            bw.close();
        } catch (Exception e) {
            //e.printStackTrace();            
            return false;
        }       
        return true;
    }
    public ArrayList<Treasure> readTreasures(){
        ArrayList<Treasure> treasures = new ArrayList<>();
        File file = new File(fileName);
        if (file.exists()){                                    //Если существует файл, где храняться записи о "сокровищах"
            try {
                Scanner sc = new Scanner(file);                  //читаем построчно файл
                while (sc.hasNext()){
                    String st=sc.nextLine();
                    Treasure tr=createTreasure(st);              //создаем объект - "сокровище"  из полученной строки
                    if (tr!=null) treasures.add(tr);             //Добавляем "сокровище" в список
                }
                sc.close();
            } catch (Exception e) { 
                System.out.println("Ошибка чтения файла");                
                e.printStackTrace();            
            }           
        }
        return treasures;
    }


    //
    public Treasure createTreasure(String str) {
        int qt, cost;
        if (str.isEmpty()) return null;
        String[] fields=str.split(";");
        String name=fields[0];
        try {
            qt=Integer.parseInt(fields[1]);
            cost=Integer.parseInt(fields[2]);    
        } catch (Exception e) {
            return null;
        }
        return new Treasure(name, qt, cost);
    }

}
