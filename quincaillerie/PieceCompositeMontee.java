package quincaillerie;

// TODO Question 13: écrire la classe PieceCompositeEnMontee.
// 
public class PieceCompositeMontee extends PieceComposite{
    
    protected int dureeMontage;
    protected double prixMontage;
    
    public PieceCompositeMontee(String nom, String reference,
           int dureeMontage, double prixMontage){
        super(nom, reference);
        if(dureeMontage > 0){
            this.dureeMontage = dureeMontage;
        }else{
            this.dureeMontage = 0;
        }
        if(prixMontage > 0){
            this.prixMontage = prixMontage;
        }else{
            this.prixMontage = 0.0;
        }
        
    }
        @Override
    protected void setReference(String reference){
        if (reference == null) {
        reference = "0000"; 
         }
        if(reference.length() == 6 && reference.startsWith("02")){
          this.reference = reference;  
        }else if(reference.length() == 5 && reference.startsWith("0")){
            this.reference = "2" + reference.substring(1);
        }else{
            this.reference = "02" + reference;
        }
    }
    

    @Override
    public double prix(){
        double p = prixMontage;
        for(Piece g : super.liste){
            p += g.prix();
        }
        return p;
    }
   @Override
    public int dureeGarantie(){
        return super.dureeGarantieDeBase() + 6;
    }
    
    @Override
    public void affiche(){
        System.out.println("nom : " + nom);
        System.out.println("référence : " + reference);
        System.out.println("prix : " + prix() + " euros");
        System.out.println("garantie : " + dureeGarantie() + " mois"); 
        System.out.println("durée de fabrication : " + dureeFabrication() + " jour(s)");
        System.out.println("durée de montage atelier : " + dureeMontage + " jour(s) ");
        System.out.println("prix du montage : " + prixMontage + " euros ");
        System.out.println(  super.toString());
    }
    
    
    @Override
    public int dureeFabrication(){
        return super.dureeFabrication()+dureeMontage;
    }
  
    
}