/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author CATOLICA
 */
public class mantenimiento {
    public double costo;
    Random r1 =new Random();
    Calendar c= Calendar.getInstance();
    
  SimpleDateFormat sdfe = new SimpleDateFormat("dd/MM/yyyy ");  
  String form;
  public Date date = new Date(); 

  
  public mantenimiento(){
      generarFecha();
      date=c.getTime();
      form = sdfe.format(date);
      this.costo=r1.nextDouble()*100+10;
  }
  
  
  
  public void generarFecha(){
      c.set(r1.nextInt(31+1+1)+1, r1.nextInt(12+1+1)+1,r1.nextInt(c.get(Calendar.YEAR)+2001)+2001*2);
  }
  
  
//  
//  
//  public void setTiempo(int a,int m,int d){
//      c.set(a, m, d);
//        date=c.getTime();
//        form = sdfe.format(date);
//  }
  
   public String getTiempo() {
         
        return (form);
    }
}
