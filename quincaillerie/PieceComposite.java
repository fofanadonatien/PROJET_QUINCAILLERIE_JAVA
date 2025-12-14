package quincaillerie;

import java.util.ArrayList;

// TODO Question 4: écrire la classe PieceComposite.
// 
public abstract class PieceComposite extends Piece{
    
    protected ArrayList<Piece> liste;
    
    public PieceComposite(String nom, String reference){
        super(nom, reference);
        liste = new ArrayList<>();
    }
    
    public void ajoute(Piece p){
        liste.add(p);
    }
    @Override
    public String toString(){
        
        String s = "";
        
        for(Piece p : liste){
          s += "   " + p.toString()+" \n";
        }
        return s;
    }
    @Override
    public int dureeGarantieDeBase(){
            int min = Integer.MAX_VALUE;
            
        for(Piece d : liste){
            int g = d.dureeGarantieDeBase();
            if(g < min){
                min = g;
            }
        }
        return min;
    }
   public int dureeFabrication(){
       if (liste.isEmpty()) return 0;
       int max = Integer.MIN_VALUE;
       
       for(Piece p : liste){
           int g =p.dureeFabrication();
           if(g>max){
               max = g;
           }
       }
        return max;
    }
}