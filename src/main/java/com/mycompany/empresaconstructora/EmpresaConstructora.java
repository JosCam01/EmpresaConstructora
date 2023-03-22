
package com.mycompany.empresaconstructora;
class Vivenda{
        int m2;
        int q_hab;
        int preu;
        String nom;
        String nif;
    }
public class EmpresaConstructora {
    
    static void construirVivenda(Vivenda [][][]edifici){
        int escalaInroduida=Teclat.lligInt("Dis-me la escala: ");
        int pisInroduit=Teclat.lligInt("Dis-me el pis: ");
        int portaInroduida=Teclat.lligInt("Dis-me la porta: ");
        
        edifici[escalaInroduida][pisInroduit][portaInroduida] = new Vivenda();
        edifici[escalaInroduida][pisInroduit][portaInroduida].m2=Teclat.lligInt("Metros:");
        edifici[escalaInroduida][pisInroduit][portaInroduida].preu=Teclat.lligInt("Preu:");
        edifici[escalaInroduida][pisInroduit][portaInroduida].q_hab=Teclat.lligInt("Habitacions:");
        edifici[escalaInroduida][pisInroduit][portaInroduida].nom=Teclat.lligString("Nom del comprador:");
        edifici[escalaInroduida][pisInroduit][portaInroduida].nif=Teclat.lligString("NIF:");
            }

    static void comprarVivenda(Vivenda [][][]edifici){
        int escala=Teclat.lligInt("Disme la escala:");
        int piso=Teclat.lligInt("Disme la piso:");
        int porta=Teclat.lligInt("Disme la porta:");
        if (edifici[escala][piso][porta]==null){
            System.out.println("No s'ha construit edifici: ");
        }
        else{
            if(edifici[escala][piso][porta].m2>0 && edifici[escala][piso][porta].nom==null){
                edifici[escala][piso][porta].nom=Teclat.lligString("Nom del propietari:");   
            }
        }
    }
   
    public static void main(String[] args) {
        
        final int escales= 5;
        final int piso= 7;
        final int porta= 4;
        Vivenda edifici[][][]= new Vivenda[escales][piso][porta];
        
        boolean eixir= true;
        int resposta;
        while(eixir){
            System.out.println("1. Construir vivenda.");
            System.out.println("2. Comprar vivenda.");
            System.out.println("3.Mostra propietats d'algu.");
            System.out.println("4.Eixir.");
            resposta=Teclat.lligInt("Introdueix una opció. ");
        }
    }
}

/**
 * 
 */
