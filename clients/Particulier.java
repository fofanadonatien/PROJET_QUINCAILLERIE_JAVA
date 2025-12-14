package clients;

// TODO Question 26: écrire la classe Particulier.
// 
public class Particulier extends Client {
    protected String prenom;
    protected Civilite civilite;
    
    
    public Particulier(String nom, String adressePostale, String adresseElectronique, String prenom, Civilite civilite){
        super(nom,adressePostale,adresseElectronique);
        this.prenom = prenom;
        this.civilite = civilite;
    }
    
    public String toString(){
        return civilite.toString()+" "+prenom+" "+nom;
    }
}
