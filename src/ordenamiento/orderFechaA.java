/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamiento;

import entidades.auto;
import java.util.Comparator;

/**
 *
 * @author Mery Acevedo
 */
public class orderFechaA 
   implements Comparator<auto>{
        
 

    @Override
    public int compare(auto t, auto t1) {
        return t.date.compareTo(t1.date);
    }
}
