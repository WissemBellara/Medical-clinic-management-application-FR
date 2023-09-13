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
public class Prescription {
    private String NomMedc ;
    private String Pos ;
    private String Analyse ;
    private String Acte ;
    private String Spereq ;
    private String NomMed ;
 /* Classe prescription qui presente comme attribut NomMedicament,posologie, analyse(intitulé), acte radio specialite requise 
                                      nom medecin specialiste */
    @Override
    public String toString() {
        String res = "Prescription :" ;
        if (!"".equals(NomMed))
            res+=" Nom Medecin : " + NomMed + " Specialite requise : " + Spereq; 
        if (!"".equals(NomMedc))
            res+=" Medicament : " + NomMedc + " Posologie : " + Pos;
        if (!"".equals(Analyse))
            res+=" Analyse : " + Analyse + " Intitulé :" + Acte;
        return res+"\n";         /* fonction tostring */
    }

    public void setNomMedc(String NomMedc) {
        this.NomMedc = NomMedc;
    }

    public void setPos(String Pos) {
        this.Pos = Pos;
    }

    public void setAnalyse(String Analyse) {
        this.Analyse = Analyse;
    }

    public void setActe(String Acte) {
        this.Acte = Acte;
    }

    public void setSpereq(String Spereq) {
        this.Spereq = Spereq;
    }

    public void setNomMed(String NomMed) {
        this.NomMed = NomMed;
    }
   }
