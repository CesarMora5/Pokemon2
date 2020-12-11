/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thae
 */
import java.io.*;
import java.math.*;
import java.util.ArrayList;
public class Mapa {
    BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
    String lugar1="Paine";
    String lugar2="Pueblo Paleta";
    String lugar3="Ciudad Lavanda";
    String lugar4="Ciudad Celeste";
    String lugar5="Ciudad azul";
    String lugar6="Ciudad Verde";
    String lugar7="Ciudad Plateada";


    Mapa (String lugar1, String lugar2, String lugar3, String lugar4, String lugar5, String lugar6,String lugar7) throws IOException 
    {

        String leer;
        System.out.println("Ingrese 1 para ir hacia paine");
        System.out.println("Ingrese 2 para ir hacia Pueblo Paleta");
        System.out.println("Ingrese 3 para ir hacia Ciudad Lavanda");
        System.out.println("Ingrese 4 para ir hacia Ciudad Celeste");
        System.out.println("Ingrese 5 para ir hacia Ciudad Azul");
        System.out.println("Ingrese 6 para ir hacia Ciudad verde");
        System.out.println("Ingrese 7 para ir hacia Ciudad Plateada");
        int op=Integer.parseInt(lector.readLine());
        if (op==1)
        {
            System.out.println("LLegaste a la ciudad "+lugar1);
        }
        if (op==2)
        {
            System.out.println("LLegaste a la ciudad "+lugar2);            
        }
        if (op==3)
        {
            System.out.println("LLegaste a la ciudad "+lugar3);
        }
        if (op==4)
        {
            System.out.println("LLegaste a la ciudad "+lugar4);
        }
        if (op==5)
        {
            System.out.println("LLegaste a la ciudad "+lugar5);
        }
        if (op==6)
        {
            System.out.println("LLegaste a la ciudad "+lugar6);
        }
        if (op==7)
        {
            System.out.println("LLegaste a la ciudad "+lugar7);   
        }
    }
}