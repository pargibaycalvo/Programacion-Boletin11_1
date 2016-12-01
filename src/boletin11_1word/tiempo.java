/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin11_1word;

import javax.swing.JOptionPane;

/**
 *
 * @author Ped90
 */
public class tiempo {
        private int añot, mest, diat;
        public int añoactual,añoanterior;
        public int mesactual, mesanterior;
        public int diaactual, diaanterior;

           
    public tiempo() {
    }

    public tiempo(int añoact, int añoant, int mesact, int mesant, int diaact, int diaant) {
        this.añoactual = añoact;
        this.añoanterior = añoant;
        this.mesactual = mesact;
        this.mesanterior = mesant;
        this.diaactual = diaact;
        this.diaanterior = diaant;
        
    }
    public void datosaño(){
        int añoact = Integer.parseInt(JOptionPane.showInputDialog ("Introduzca el año actual "));
        while ((añoact<0)||(añoact>2016)){
            añoact = Integer.parseInt(JOptionPane.showInputDialog ("ERROR. El año no puede ser inferior a cero ni mayor que 2016 "));
        }   
        int añoant = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el año anterior"));
        while ((añoant<0)||(añoant>2016)){
            añoant = Integer.parseInt (JOptionPane.showInputDialog("ERROR. El año no puede ser inferior a cero ni mayor que 2016 "));
        }
        System.out.println("Total de años pasados : "+(añot=(añoact - añoant)));
    }
    
    
    public void datosmeses(){
        int mesact = Integer.parseInt(JOptionPane.showInputDialog ("Introduzca el mes actual "));
         while ((mesact<0)||(mesact>12)){
            mesact = Integer.parseInt(JOptionPane.showInputDialog ("El mes no puede ser inferior a cero ni mayor que 12 "));
        }
        int mesant = Integer.parseInt(JOptionPane.showInputDialog ("Introduzca el mes anterior "));
         while ((mesant<0)||(mesant>12)){
            mesant = Integer.parseInt(JOptionPane.showInputDialog ("El mes no puede ser inferior a cero ni mayor que 12 "));
        }
        System.out.println("Total de meses pasados : "+(añot*12));
    }
        
    public void datosdias(){
        int diaact = Integer.parseInt(JOptionPane.showInputDialog ("Introduzca el dia actual "));
         while ((diaact<1)||(diaact>31)){
            diaact = Integer.parseInt(JOptionPane.showInputDialog ("El dia no puede ser inferior a 1 ni mayor de 31 "));
         }
        int diaant = Integer.parseInt(JOptionPane.showInputDialog ("Introduzca el dia anterior "));
         while ((diaant<1)||(diaant>31)){
            diaant = Integer.parseInt(JOptionPane.showInputDialog ("El dia no puede ser inferior a 1 ni mayor que 31 "));
        }
        System.out.println("El total de dias pasados son : "+(añot*365));
    }
    
 
           
        
}

    
        
    
 

