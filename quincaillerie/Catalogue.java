package quincaillerie;

import java.util.ArrayList;

public class Catalogue {
    protected ArrayList<Piece> liste;
    
    public Catalogue(){
        liste = new ArrayList<>();
    }
    private boolean estPresente(Piece p){
        
        return liste.contains(p);
    }
    
    public void ajoute(Piece p){
        if (!estPresente(p)) {
            liste.add(p);
        }else{
            System.out.println(" existe deja ");
        }
    }
    
    public String toString(){
        String exp = "";
        for(Piece p : liste){
            exp += p.toString()+" \n";
        }
        return exp;
    }
    
    public void affichePiece( String nom, String reference){
        boolean trouver = false;
        for(Piece p : liste){
            if(p.nom.equals(nom) && p.reference.equals(reference)){
                p.affiche();
                trouver = true;
                break;
            }
            
        }
        if(!trouver) {
            System.out.println(" n'existe pas ");
        }
       
    }
    
}

// TODO Questions 21: écrire la classe PieceCompositeEnMontee.
// 
