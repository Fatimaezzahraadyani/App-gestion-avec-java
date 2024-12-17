import java.util.*;
public class Classe {
    private String nom;
    private Formateur formateur;
    ArrayList<Apprenant> Apprenants = new ArrayList<>();

    public Classe(String nom, Formateur formateur) {
        this.nom = nom;
        this.formateur = formateur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Formateur getFormateur() {
        return formateur;
    }

    public void setFormateur(Formateur formateur) {
        this.formateur = formateur;
    }

    public ArrayList<Apprenant> getApprenants() {
        return Apprenants;
    }

    public void setApprenants(ArrayList<Apprenant> apprenants) {
        Apprenants = apprenants;
    }
}
