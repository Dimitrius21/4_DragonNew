package by.dm_bzh.grow.Dragon.in_out;

import java.util.ArrayList;
import by.dm_bzh.grow.Dragon.main.Treasure;

//Преобразование в строку для выводв
public class ToShow {

    public static String showMany(String title, ArrayList<Treasure> list) {
        StringBuilder sb = new StringBuilder();
        if (!title.isEmpty()) sb.append("\n" + title + "\n\n");
        int i=1;
        for(Treasure tr : list){
            sb.append(i+" "+tr.toString()+"\n");
            i++;
        }
        return new String(sb);
    }    
    
    public static String showOne(String title, Treasure tr) {
        StringBuilder sb = new StringBuilder();
        sb.append("\n" + title + "\n\n");
        sb.append(tr.toString()+"\n");        
        return new String(sb);
    } 
}
