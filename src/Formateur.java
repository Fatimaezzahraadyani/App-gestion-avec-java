import java.util.Scanner;

public class Formateur extends Personne{
    private String specialite;
    private double salaire;
    private Classe classe;



    public Formateur(int Id, String nom, String prenom, String email,String specialite,double salaire, Classe classe) {
        super(Id, nom, prenom, email);
        this.specialite = specialite;
        this.salaire = salaire;
        this.classe = classe ;

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

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }
    Scanner sc = new Scanner(System.in);
    public void AjouterFormateur(){
        System.out.println("entrer un nom : ");
        String nom=sc.nextLine();
        setNom(nom);
        System.out.println("entrer un prenom : ");
        String prenom=sc.nextLine();
        setPrenom(prenom);
        System.out.println("entrer un Id : ");
        int Id=sc.nextInt();
        setId(Id);
        System.out.println("enter un email : ");
        String email=sc.nextLine();
        setEmail(email);
    }
    public void AfficherFormateur(){
        System.out.println(getNom());
        System.out.println(getPrenom());
        System.out.println(getId());
        System.out.println(getEmail());
    }
    public void Modifierformateur(){
        System.out.println("entrer le nouveau nom : ");
        String name=sc.nextLine();
        setNom(name);
        System.out.println("entrer le nouveau prenom : ");
        String prenom=sc.nextLine();
        setPrenom(prenom);
        System.out.println("entrer le nouveau Id : ");
        int Id=sc.nextInt();
        setId(Id);
        System.out.println("entrer le nouveau email : ");
        String email=sc.nextLine();
        setEmail(email);
        AfficherFormateur();
    }

}
