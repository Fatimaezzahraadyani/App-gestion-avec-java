import java.util.ArrayList;
import java.util.Scanner;



public class Formateur extends Personne{
    static ArrayList<Formateur> formateur = new ArrayList<>();
    private String specialite;
    private double salaire;
    private Classe classe;



    public Formateur(int Id, String nom, String prenom, String email,String specialite,double salaire, Classe classe) {
        super(Id, nom, prenom, email);
        this.specialite = specialite;
        this.salaire = salaire;
        this.classe = classe ;

    }
    public Formateur(){

    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public Classe getClasse(Formateur b) {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public static ArrayList<Formateur> getFormateur() {
        return formateur;
    }

    public static void setFormateur(ArrayList<Formateur> formateur) {
        Formateur.formateur = formateur;
    }

    static Scanner sc = new Scanner(System.in);
    public Formateur AjouterFormateur(){

        System.out.println("entrer un nom : ");
        String nom=sc.nextLine();

        System.out.println("entrer un prenom : ");
        String prenom=sc.nextLine();

        System.out.println("entrer un Id : ");
        int Id=sc.nextInt();
        sc.nextLine();

        System.out.println("enter un email : ");
        String email=sc.nextLine();

        System.out.println("entrer la spécialiter : ");
        String specialite=sc.nextLine();

        System.out.println("entrer le salaire : ");
        double salaire=sc.nextDouble();


        Formateur a=new Formateur(Id,nom,prenom,email,specialite,salaire,null);
        formateur.add(a);
        return a;
    }
    public void AfficherFormateur(Formateur a){
        System.out.println(a.toString());
    }
    public void ModifierFormateur() {
        boolean Trouve = false ;
        System.out.println("Veuillez saisir ID de formateur : ");
        int id = sc.nextInt();
        sc.nextLine();
        Trouve= true;
        for (Formateur T : formateur) {
            if (T.getId() == id) {
                System.out.println("entrer le nouveau nom : ");
                String newname = sc.nextLine();

                System.out.println("entrer le nouveau prenom : ");
                String newprenom = sc.nextLine();

                System.out.println("entrer le nouveau Id : ");
                int newId = sc.nextInt();
                sc.nextLine();

                System.out.println("entrer le nouveau email : ");
                String newemail = sc.nextLine();

                System.out.println("entrer la nouvelle specialiter :");
                String newspecialite = sc.next();

                System.out.println("entrer le nouveau salaire :");
                double newsalaire = sc.nextDouble();

                Formateur a = new Formateur(id, newname, newprenom, newemail, newspecialite, newsalaire, null);
                formateur.set(id, a);
                AfficherFormateur(a);
                break;
            }
        }
        if(!Trouve){
                System.out.println("Formateur non trouvé !!");
            }

    }

    public void AssocierFormateur() {


        System.out.println("entrer l'Id du formateur :");
        //sc.nextInt();
        Formateur b = null;
        for (Formateur a : formateur){
            if(a.getId() == sc.nextInt()){
                b = a;
            }
        }
        sc.nextLine();
        System.out.println("entre le nom de classe");
        String L = sc.nextLine();
        ArrayList<Classe>C=Classe.classe;
        for (Classe a : C) {
            if (a.getNom().equals(sc.nextLine())) {
                a.setFormateur(b);
                b.setClasse(a);
                System.out.println("Bien Associer !");
            }else{
                System.out.println("cree une classe premiérement");
            }

        }
    }

    public void SupprimerFormateur(){
        System.out.println("entre l'Id de formateur que vous voullez :");
        int Id =sc.nextInt();
        for (Formateur a : formateur) {
            if (a.getId()==Id) {
                formateur.remove(a);
                System.out.println("Formateur bien supprimer !");
                break;
            }else{
                System.out.println("formateur non trouvé !");
            }
        }
    }

    @Override
    public String toString() {
        return "Formateur{" +
                "specialite='" + specialite + '\'' +
                ", salaire=" + salaire +
                ", classe=" + classe +
                '}';
    }
}


