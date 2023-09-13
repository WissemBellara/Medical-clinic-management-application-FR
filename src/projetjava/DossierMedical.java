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
public class DossierMedical {
private String Ref ;        //Ref = Reference
private String Nom;         
private String Prenom ;
private int JDN;            //JDN = Jour de Naissance   
private int MDN ;           //MDN = Mois du Naissance
private int ADN ;           //ADN = Aneee du Naissance
private String Genre ;      
private long Telephone ;
private ArrayList <Consultation> Con ; //ArrayList du consultation (Chaque Consultation presente une liste de Prescription (Voir Classe Consultation))
//Getters And Setters And ToString
    @Override
    public String toString() {      //Retourne Tout concernant le dossier Medical (Avec Consultations et Prescriptions)
        String res="" ;
        res+="Reference " +Ref + " Nom :" + Nom + " Prenom : " +Prenom + " Date Naissance : " +JDN + "/" + MDN + "/" +ADN+ " Genre : " +Genre + " Telephone : " + Telephone +"\n" ;
        for (int i=0;i<Con.size();i++)
            res+=Con.get(i).toString();
        return res;
    }
    
    public String dp() {    //Retourne que les donnees Personnels
        String res="" ;
        res+="Reference " +Ref + " Nom :" + Nom + " Prenom : " +Prenom + " Date Naissance : " +JDN + "/" + MDN + "/" +ADN+ " Genre : " +Genre + " Telephone : " + Telephone +"\n" ;
       return res;
    }

    public String getRef() {
        return Ref;
    }

    public String getNom() {
        return Nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public int getJDN() {
        return JDN;
    }

    public int getMDN() {
        return MDN;
    }

    public int getADN() {
        return ADN;
    }

    public String getGenre() {
        return Genre;
    }

    public long getTelephone() {
        return Telephone;
    }

    public ArrayList<Consultation> getCon() {
        return Con;
    }

    public void setRef(String Ref) {
        this.Ref = Ref;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }

    public void setJDN(int JDN) {
        this.JDN = JDN;
    }

    public void setMDN(int MDN) {
        this.MDN = MDN;
    }

    public void setADN(int ADN) {
        this.ADN = ADN;
    }

    public void setGenre(String Genre) {
        this.Genre = Genre;
    }

    public void setTelephone(long Telephone) {
        this.Telephone = Telephone;
    }

    public void setCon(ArrayList<Consultation> Con) {
        this.Con = Con;
    }

}
