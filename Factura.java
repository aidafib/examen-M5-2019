package empresa;

import java.util.ArrayList;

public class Factura {

    private int descompte = 0;
    private float total = 0;
    private ArrayList<Producte> llistat;
    private int idFactura;

    public Factura (int id, ArrayList<Producte> items, int descFactura){
		idFactura = id;
        llistat = items;
		descompte = descFactura;
    }

    public void mostraFactura (){	
        System.out.println("La factura té els següents items:");
		total = 0;
		for(int i = 0; i < this.llistat.size(); i++){
		    total = total + llistat.get(i).getPreu();
		    System.out.println(llistat.get(i).getNom() + " amb preu: " + llistat.get(i).getPreu());
		}
		total = total + total*0.21f;
	    System.out.println("El preu total (amb IVA) és = " + total);
		if(descompte > 0){
		    desc(total);
		}
    }    

    public void desc (float total){    
        total = total - this.descompte;    
        System.out.println("El descompte és de " + descompte + " euros");
		System.out.println("El preu total amb descompte és = " + total);
    }

    public void mostraEsborrany (){	
		System.out.println("L'esborrany de la factura té els següents items:");	
		total = 0;
		for(int i = 0; i < this.llistat.size(); i++){
		    total = total + llistat.get(i).getPreu();
		    System.out.println(llistat.get(i).getNom() + " amb preu: " + llistat.get(i).getPreu());
		}
        System.out.println("El preu total (sense IVA) és = " + total);
		float importIVA = total*0.21f;
		System.out.println("L'import del IVA és = " + importIVA);
    }   

    public void actualitzarStock (){        
        System.out.println("Els productes de la factura "+ idFactura +" s'han descomptat del stock del magatzem.");
    }

}


