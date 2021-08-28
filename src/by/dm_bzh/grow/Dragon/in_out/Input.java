package by.dm_bzh.grow.Dragon.in_out;

import java.util.*;

;public class Input {
    private static Scanner sc =new Scanner(System.in);
    public static String InpString(String text) {
        String str="";
        System.out.println(text); 
        System.out.print("?: ");
        do {
          str = sc.nextLine().trim();
        } while (str.isEmpty()); 
        return str;        
    }
    public static int InpInt(String text) {
        int i=0;
        System.out.println(text); 
        System.out.print("?: ");
        while(!sc.hasNextInt()){
          sc.nextLine();        
        }
          i=sc.nextInt();        
          sc.nextLine();        
        return i;        
    }
  public static int InpInt(String ... text) {
    int i=0;
    for(String st : text) System.out.println(st); 
    System.out.print("?: ");
    while(!sc.hasNextInt()){
      sc.nextLine();        
    }
      i=sc.nextInt();        
      sc.nextLine();        
    return i;        
  }
  public static void InpStop(String text) {    
        System.out.println(text);
        sc.nextLine();
  }      
    
}
