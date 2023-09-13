/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;

;

import java.util.ArrayList;

/**
 *
 * @author WissemPC
 */
public class Consultation {
    private int JDC ; //JDC = Jours du Consultation
    private int MDC ;  //MDC = Mois du consultation                          
    private int ADC ;   //ADC = Annee du consultation
    private String Dia ; //Dia = Diagnostic
    private ArrayList <Prescription> pres ; //ArrayList du Prescription
//Getters And Setters
    public int getJDC() {
        return JDC;
    }

    public int getMDC() {
        return MDC;
    }

    public int getADC() {
        return ADC;
    }

    public String getDia() {
        return Dia;
    }

    public ArrayList<Prescription> getPres() {
        return pres;
    }
public void ajtPres(Prescription p)
{           
    pres.add(p) ;                       //Ajouter une nouvelle prescription a l'arraylist de Prescription
}
    @Override
    public String toString() {                  
        String res="" ;
        res+=" Date Consultation : " +JDC + "/" + MDC + "/" +ADC + " Diagnostique : " +Dia +"\n" ;      //Afficher Tout ce qui contient le Consultation 
        for (int i=0;i<pres.size();i++)
            res+=pres.get(i).toString();
        return res;
    }

    public void setJDC(int JDC) {
        this.JDC = JDC;
    }

    public void setMDC(int MDC) {
        this.MDC = MDC;
    }

    public void setADC(int ADC) {
        this.ADC = ADC;
    }

    public void setDia(String Dia) {
        this.Dia = Dia;
    }

    public void setPres(ArrayList<Prescription> pres) {
        this.pres = pres;
    }
    
}
