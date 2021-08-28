package by.dm_bzh.grow.Dragon.main;

import by.dm_bzh.grow.Dragon.controller.CaveController;
import by.dm_bzh.grow.Dragon.in_out.Input;


public class Dragon {

    public void go() {
        CaveController controller = new CaveController();
        int choise;
        String action="";
        while(true){
            choise=Input.InpInt("Выберите действие:", "0 - Выйти из программы", "1 - Добавить сокровище", "2 - Просмотреть все сокровища", 
            "3 - Найти самое дорогое сокровище", "4 - Выбрать сокровища");
            switch (choise){
                case 0 : System.exit(0);
                case 1 : action="add";  break;  
                case 2 : action="showall";  break; 
                case 3 : action="getExp";  break;  
                case 4 : action="take";  break; 
            }   
            System.out.println(controller.actions(action));
        }
    }
    public static void main(String[] args) {
       new Dragon().go();
    }
    
}
