import java.util.ArrayList;
import java.util.Scanner;


public class Apprenant extends Personne{
    static ArrayList<Apprenant> appr = new ArrayList<>();
    private Classe classe ;
    private ArrayList<Double> notes=new ArrayList<Double>();

   public Apprenant(int Id,String nom,String prenom,String email,Classe classe){
        super(Id,nom,prenom,email);
        this.classe = classe;
    }

    public Apprenant() {
        super();
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
    static Scanner sc = new Scanner(System.in);

    public void AjouterApprenant(){

        System.out.println("entrer un nom : ");
        String nom=sc.nextLine();

        System.out.println("entrer un prenom : ");
        String prenom=sc.nextLine();

        System.out.println("enter un email : ");
        String email=sc.nextLine();

        System.out.println("entrer un Id : ");
        int Id=sc.nextInt();
        sc.nextLine();


        Apprenant a=new Apprenant(Id,nom,prenom,email,null);
        appr.add(a);

    }
    public void AfficherApprenant(Apprenant a){
        System.out.println(a.toString());
    }


    public void ModifierApprenant(){
        System.out.println("Veuillez saisir ID d'apprenant : ");
        int id= sc.nextInt();

        System.out.println("entrer le nouveau nom : ");
        String name=sc.nextLine();
        System.out.println("entrer le nouveau prenom : ");
        String prenom=sc.nextLine();

        System.out.println("entrer le nouveau email : ");
        String email=sc.nextLine();

        Apprenant a = new Apprenant(id,name,prenom,email,null);
        appr.set(id,a);

        AfficherApprenant(a);

    }
    public void SuppApprenants(){
        System.out.println("Veuillez saisir ID d'apprenant que vous voulez supprimer: ");
        int Id = sc.nextInt();
        for (Apprenant a : appr){
            if(a.getId()==Id){
                appr.remove(a);
            }
        }
    }


    @Override
    public String toString() {

        return super.toString() +
                "\n classe=" + classe +
                "\n notes=" + notes
                ;
    }
}



