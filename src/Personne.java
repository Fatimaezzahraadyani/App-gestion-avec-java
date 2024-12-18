public abstract class Personne {
    private int Id;
    private String nom;
    private String prenom;
    private String email;



    public Personne(int Id,String nom,String prenom,String email){
         this.nom = nom;
         this.prenom = prenom ;
         this.email = email;
         this.Id = Id ;
     }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Personne : \n"
                +"\n nom = " + nom
                +"\n prenom = " + prenom
                +"\n email = " + email
                +"\n Id =" + Id ;
    }

}