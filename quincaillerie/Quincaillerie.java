package quincaillerie;

import clients.Civilite;
import clients.Client;
import clients.Entreprise;
import clients.Particulier;

public class Quincaillerie {

    public static void main(String[] args) {
    /* TODO Question 3: Afficher les caractéristiques de pneu, chambre à air e, disque de jante et rayon*/
    
   PieceDeBase p1 = new PieceDeBase("pneu", "4741",12.5,60,2);
   p1.affiche();
   PieceDeBase p2 = new PieceDeBase("chambre à air", "4565",4.0,20,2);
   p2.affiche();
   PieceDeBase p3 = new PieceDeBase("disque de jante", "1214",4.5,60,2);
   p3.affiche();
   PieceDeBase p4 = new PieceDeBase("rayon", "4748",1.0,20,1);
   p4.affiche();
   PieceDeBase p5 = new PieceDeBase("jante en kit", "1214",0.0,0,0);
   p4.affiche();
  /*Question 6: Afficher les fiches caractéristiques des 2 piièces composites jantes en kit et brouette en kit décrites dans l'énoncé.*/
   PieceCompositeEnKit pk1 = new PieceCompositeEnKit("jante en kit", "4541",10);
    pk1.ajoute(p3);
    pk1.ajoute(p4);
    pk1.ajoute(p4);
    pk1.ajoute(p4);
    pk1.affiche();
    PieceCompositeEnKit pk2 = new PieceCompositeEnKit("roue de brouette en kit", "1512",15);
    pk2.ajoute(p1);
    pk2.ajoute(p2);
    pk2.ajoute(pk1);
    pk2.affiche();
/* Question 14: Afficher les fiches caractéristiques des 2 piièces composites jantes montée et brouette montée décrites dans l'énoncé.*/
   PieceCompositeMontee pm1 = new PieceCompositeMontee("jante en kit", "4541",1, 7.0);
    pm1.ajoute(p3);
    pm1.ajoute(p4);
    pm1.ajoute(p4);
    pm1.ajoute(p4);
    pm1.affiche();
  PieceCompositeMontee pm2 = new PieceCompositeMontee("roue de brouette en kit", "1512", 1, 8.0);
    pm2.ajoute(p3);
    pm2.ajoute(p2);
    pm2.ajoute(pm1);
    pm2.affiche();
/* Question 27: Ajouter un client particulier et une entreprise et afficher le résultat.*/
   Catalogue cat = new Catalogue();
    cat.ajoute(p3);
    cat.ajoute(p4);
    cat.ajoute(p4);
    cat.ajoute(p4);
    cat.ajoute(p3);
    cat.ajoute(p2);
    cat.ajoute(pm1);
    
    cat.toString();
    cat.affichePiece("roue de brouette en kit","011512");
    
    Client Bernanrd = new Particulier("Madi", "1245", "bernad@gmail.com","Bernand",Civilite.M);
    Client gesco = new Entreprise("gesco", "rue 25","gesco@gmail","bg1245936587");
    System.out.println(Bernanrd);
    System.out.println(gesco);
    }
    
    
}
