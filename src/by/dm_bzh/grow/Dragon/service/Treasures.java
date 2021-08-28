package by.dm_bzh.grow.Dragon.service;

import java.util.ArrayList;

import by.dm_bzh.grow.Dragon.dal.DataProvider;
import by.dm_bzh.grow.Dragon.in_out.Input;
import by.dm_bzh.grow.Dragon.in_out.ToShow;
import by.dm_bzh.grow.Dragon.main.Treasure;

public class Treasures {
    private static Treasures trs=null;
    private ArrayList<Treasure> treasures;
    private DataProvider provider = DataProvider.getInstance();

    private Treasures(){
        treasures =provider.getDAOTreasure().readTreasures();        
    }
    
    public static Treasures getInstance(){
        if (trs==null) { trs=new Treasures(); }
        return trs;
    }
    //Создание нового "сокровища"
    public Treasure addTreasure() {                
        Treasure tr=CreateTreasure.create();
        treasures.add(tr);           
        if (provider.getDAOTreasure().saveTreasure(tr))  return tr; 
          else { treasures.remove(tr); return null; } 
    }

    // Поиск самого дорогого сокровища
    public Treasure getMostExpensive() {
        if (treasures.isEmpty()) return null; 
        Treasure tr=treasures.get(0);
        for (int i=1; i<treasures.size(); i++){
            if (tr.getPrice()<treasures.get(i).getPrice()) {
                tr=treasures.get(i);
            }
        }           
        return tr;
    }

    //Вернуть список всех сокровищ
    public ArrayList<Treasure> getTreasuresList() {
        return treasures;        
    }
    //выбора сокровищ на заданную сумму.
    public ArrayList<Treasure> CollectTreasures() {
        ArrayList<Treasure> myTreasures=new ArrayList<Treasure>();
        ArrayList<Treasure> treasuresCopy=new ArrayList<Treasure>();
        for (Treasure treasure : treasures) {                           //Создание копии списка сокровищ
            treasuresCopy.add(treasure.clone());            
        }        
        Treasure tr;
        int choise, choise2, qt, sum, total=0;
        Input.InpStop("Выбор сокровищ на сумму. Нажмите ввод для продолжения");        
        int l=treasures.size();        
        ArrayList<Integer> chosenNum = new ArrayList<Integer>();        
        while (true){                           
            choise=Input.InpInt(ToShow.showMany("", treasuresCopy)+"Введите номер сокровища из списка, 0 - завершить выбор");            
            if (choise==0) break;
            choise--;
            if (choise>=0 && choise<l) {                
                tr=treasuresCopy.get(choise).clone();                
                choise2=Input.InpInt("В наличии "+tr.getQuantity()+" единиц сокровища. Введите желаемое количество");
                if (choise2>0 && choise2<=tr.getQuantity()) {
                    qt=treasuresCopy.get(choise).getQuantity()-choise2;
                    treasuresCopy.get(choise).setQuantity(qt);
                    tr.setQuantity(choise2);
                    myTreasures.add(tr);
                    sum=choise2*tr.getPrice(); 
                    total+=sum;
                    chosenNum.add(choise2);
                    Input.InpStop("Выбрано сокровище "+ " на сумму "+sum+". Общая сумма выбранных сокровищ составляет "+total+". Нажмите ввод для продолжения");            
                }else Input.InpStop("Введено невозможное количество, нажмите ввод для продолжения");
            }
        }
        return myTreasures;
    }    
}
