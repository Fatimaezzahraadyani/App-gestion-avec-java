import java.util.ArrayList;
import java.util.Scanner;

public class Apprenant extends Personne{
    private Classe classe ;
    private ArrayList<Double> notes=new ArrayList<Double>();


   public Apprenant(int Id,String nom,String prenom,String email,Classe classe){
        super(Id,nom,prenom,email);
        this.classe = classe;
    }


    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public ArrayList<Double> getNotes() {
        return notes;
    }

    public void setNotes(ArrayList<Double> notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {

        return super.toString() +
                "\n classe=" + classe +
                "\n notes=" + notes +
                ;
    }
}



