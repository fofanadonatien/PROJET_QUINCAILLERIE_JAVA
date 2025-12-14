package quincaillerie;

// TODO Question 5: écrire la classe PieceCompositeEnKit.
// 
public class PieceCompositeEnKit extends PieceComposite{
    protected int dureeMontage;
    
        public PieceCompositeEnKit(String nom, String reference, int dureeMontage){
        super(nom, reference);
        if(dureeMontage>0){
        this.dureeMontage = dureeMontage;
        }else{
            dureeMontage = 0;
        }
    }
    
        @Override
    protected void setReference(String reference){
        if (reference == null) {
        reference = "0000"; 
         }
        if(reference.length() == 6 && reference.startsWith("01")){
          this.reference = reference;  
        }else if(reference.length() == 5 && reference.startsWith("0")){
            this.reference = "1" + reference.substring(1);
        }else{
            this.reference = "01" + reference;
        }
        
    }
    
    @Override
    public double prix(){
        double p = 0.0;
        for(Piece g : super.liste){
            p+=g.prix();
        }
        return p;
    }
   @Override
    public int dureeGarantie(){
        return super.dureeGarantieDeBase()/2;
    }
    
    @Override
    public void affiche(){
        System.out.println("nom : " + nom);
        System.out.println("référence : " + reference);
        System.out.println("prix : " + prix() + " euros");
        System.out.println("garantie : " + dureeGarantie() + " mois"); 
        System.out.println("durée de fabrication : " + dureeFabrication() + " jour(s)");
        System.out.println("durée de montage particulier : " + dureeMontage + " mn ");
        System.out.println("composants : \n" + super.toString());
    }
  
}