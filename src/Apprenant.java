import java.util.ArrayList;
import java.util.Scanner;


public class Apprenant extends Personne{
    static ArrayList<Apprenant> appr = new ArrayList<>();
    private Classe classe ;
    private ArrayList<Double> notes=new ArrayList<Double>();

   public Apprenant(int Id,String nom,String prenom,String email,double note, Classe classe){
        super(Id,nom,prenom,email);
        this.classe = classe;
        this.notes.add(note);
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

        System.out.println("entrer la note : ");
        Double note=sc.nextDouble();
        sc.nextLine();

        Apprenant a=new Apprenant(Id,nom,prenom,email,note,null);
        appr.add(a);

    }
    public void AfficherApprenant(Apprenant a){
        System.out.println(a.toString());
    }


    public void ModifierApprenant(){
        System.out.println("Veuillez saisir ID d'apprenant : ");
        int id= sc.nextInt();
        sc.nextLine();
        for (Apprenant a : appr){
            if(a.getId()==id){
                System.out.println("entre le nouveau ID : ");
                a.setId(sc.nextInt());
                System.out.println("entrer le nouveau nom : ");
                a.setNom(sc.nextLine());

                System.out.println("entrer le nouveau prenom : ");
                a.setPrenom(sc.nextLine());

                System.out.println("entrer le nouveau email : ");
                a.setEmail(sc.nextLine());
            }
        AfficherApprenant(a);
    }
    }
    public void AssocierApprenant(){
        System.out.println("entrer l'Id d'apprenant :");
        int ID = sc.nextInt();
        sc.nextLine();
        Apprenant p = null;
        for (Apprenant a : appr){
            if(a.getId() == sc.nextInt()){
                p = a;
                break;
            }
        }
        if(p==null){
            System.out.println("apprenant non trouvé !");
            return;
        }

        System.out.println("entre le nom de classe");
        //sc.nextLine();
        String S = sc.nextLine();
        boolean trouveClasse = false;

            for (Classe a : Classe.classe) {
                if (a.getNom().equals(sc.nextLine())) {
                    a.Apprenants.add(p);
                    p.setClasse(a);
                    System.out.println("Bien Associer !");
                    trouveClasse=true;
                }else{
                    System.out.println("cree une classe premiérement");
                }

            }
    }
    public void SuppApprenant() {
        System.out.println("Veuillez saisir ID d'apprenant que vous voulez supprimer: ");
        int Id = sc.nextInt();
        for (Apprenant a : appr) {
            if (a.getId() == Id) {
                appr.remove(a);
                System.out.println("Bien Supprimé !");
                break;
            } else {
                System.out.println("apprenant non trouvé ");
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



