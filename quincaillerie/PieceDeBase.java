package quincaillerie;

// TODO Question 2: Ecrire la classe PieceDeBase.
// 
public class PieceDeBase extends Piece{
    protected double prix;
    protected int dureeGarantie;
    protected int dureeFabrication;
    
    public PieceDeBase(String nom, String reference, double prix,
              int dureeGarantie, int dureeFabrication){
        super(nom, reference);
        if(prix > 0){
        this.prix = prix;
        }else{
            prix = 0;
        }
        if(dureeGarantie >0){
        this.dureeGarantie = dureeGarantie;
        }else{
            dureeGarantie =0;
        }
        if(dureeFabrication > 0){
        this.dureeFabrication = dureeFabrication;
        }else{
            dureeFabrication = 0;
        }
    }

    @Override
    protected void setReference(String reference){
        if (reference == null) {
        reference = "0000"; 
         }
        if(reference.length() == 6 && reference.startsWith("00")){
             this.reference = reference;
        }else if(reference.length() == 5 && reference.startsWith("0")){
            this.reference = "0"+reference;
        }else{
            this.reference = "00"+reference;
        }
       
    }
    @Override

    public void affiche() {
        System.out.println("nom : " + nom);
        System.out.println("référence : " + reference);
        System.out.println("prix : " + prix() + " euros");
        System.out.println("garantie : " + dureeGarantie() + " mois");
        System.out.println("durée de fabrication : " + dureeFabrication() + " jour(s)");
    }


    @Override
    public double prix(){
        return prix;
    }
   @Override
    public int dureeGarantie(){
        return dureeGarantie;
    }
    @Override
    public int dureeGarantieDeBase(){
        return dureeGarantie;
    }
    @Override
    public int dureeFabrication() {
        return dureeFabrication;
    }
}
