package clients;

// TODO Question 27: écrire la classe Entreprise.
// 
public class Entreprise extends Client {
    protected String SIRET;
    
    public Entreprise(String nom, String adressePostale, String adresseElectronique, String SIRET){
        super(nom,adressePostale,adresseElectronique);
        this.SIRET = SIRET;
    }
    
    
    public String toString(){
        return "avec l'entreprise "+nom+", puis son numéro de siret ("+SIRET+").";
    }
    
}