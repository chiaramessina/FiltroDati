package FlitraggioDati;
import java.util.ArrayList;
public class prodotti {
	
	//metodo filtro che restituisce solo prodotti della stessa categoria
			
			public static void filtroCategoria(ArrayList <Prodotto> prodotti) {
				for(Prodotto s: prodotti) {
					if(s.categoria.equals("condimento")) {
						System.out.print(s.nome);
					}
				}
			}

	public static void main(String[] args) {
		Prodotto a= new Prodotto("pepe","condimento",2);
		Prodotto b= new Prodotto("paprika","spezia",5);
		Prodotto c= new Prodotto("sale","condimento",3);
		Prodotto d= new Prodotto("patate","ortaggio",2);
		Prodotto e= new Prodotto("salsa","condimento",4);
		
		ArrayList <Prodotto> prodotti= new ArrayList <Prodotto>();
		prodotti.add(a);
		prodotti.add(b);
		prodotti.add(c);
		prodotti.add(d);
		prodotti.add(e);
		

	}

}
