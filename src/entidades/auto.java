/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author CATOLICA
 */
public class auto {
    Random r1 =new Random();
    public ArrayList<mantenimiento> lMantenimiento=new ArrayList<mantenimiento>();
    public String placa,fecha;
    
      Calendar c= Calendar.getInstance();
   
    
     
    
  SimpleDateFormat sdfe = new SimpleDateFormat("dd/MM/yyyy ");  
 
  public Date date = new Date(); 
    
    
   
  public auto(int a){
      generarFecha();
      date=c.getTime();
      
      this.fecha=sdfe.format(date);
      agregarMantenimiento(a);
      generarPlaca();
  }
  
  
  public void generarPlaca(){
      this.placa="P000-0";
      for (int i = 0; i < 2; i++) {
         this.placa= this.placa.concat(String.valueOf(r1.nextInt(9+1+1)+1));
      }
 
  }
  
  public void generarFecha(){
      c.set(r1.nextInt(31+1+1)+1, r1.nextInt(12+1+1)+1, r1.nextInt(c.get(Calendar.YEAR)+2000+2000)+2000);
  }
  public void agregarMantenimiento(int a){
    
      for (int i = 0; i <a ; i++) {
          this.lMantenimiento.add(new mantenimiento());
      }
  }
  
  
  
    
}
