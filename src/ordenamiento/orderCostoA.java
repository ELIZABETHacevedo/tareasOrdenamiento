/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamiento;

import entidades.mantenimiento;
import java.util.Comparator;

/**
 *
 * @author Mery Acevedo
 */
public class orderCostoA implements Comparator<mantenimiento> {

    @Override
    public int compare(mantenimiento t, mantenimiento t1) {
        return Double.compare(t.costo, t1.costo);
    }
    
}
