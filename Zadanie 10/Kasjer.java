import java.util.List;
import java.util.function.Supplier;
import java.util.ArrayList;

public class Kasjer implements KasjerInterface{
	
	RozmieniaczInterface obj;
	Pieniadz pien_rozmieniany;
	int rozmienialne = 0;
	int nierozmienialne = 0;
	int reszta = 0;
	int suma = 0;
	boolean tt;
	boolean tt2;
	Pieniadz minrozm = null;
	List<Pieniadz> listaRozmienialne = new ArrayList<Pieniadz>();
	List<Pieniadz> listaN = new ArrayList<Pieniadz>();
	List<Pieniadz> listaNierozmienialne = new ArrayList<Pieniadz>();
	List<Pieniadz> lista_rozmieniona = new ArrayList<Pieniadz>();
	List<Pieniadz> lista_rozmieniona2 = new ArrayList<Pieniadz>();
	List<Pieniadz> lista2 = new ArrayList<Pieniadz>();
	List<Pieniadz> Kasa = new ArrayList<Pieniadz>();
	List<Integer> Listakombinacji = new ArrayList<Integer>();
	List<Pieniadz> lista = new ArrayList<Pieniadz>();
	int it = 0;
	int it2 = 0;
	
	void printCombinations(List<Pieniadz> Kasa, int N, int sumanieroz2) 
    {
        int[] data = new int[N];
        for (int r = 0; r < Kasa.size(); r++)
            combinations(Kasa, data, 0, N - 1, 0, r, sumanieroz2);
    }
 
    void combinations(List<Pieniadz> Kasa, int[] data, int start, int end,
            int index, int r, int sumanieroz2) 
    {
    	if(tt) {
	        if (index == r) {
	        	suma = 0;
	        	for (int j = 0; j < r; j++) {
	        		suma += data[j];
	        	}

	        	if (suma == sumanieroz2) 
		        {
	        		tt = false;
		        	
		            for (int j = 0; j < r; j++) {
		            	for(int k = 0; k < Kasa.size(); k++) {
		            		if(Kasa.get(k).wartosc() == data[j]) {
		            			lista.add(Kasa.get(k));
		            			Kasa.remove(Kasa.get(k));
		            			break;
		            		}
		            	}
		            }
		            tt2 = false;
		        }
	        }
	        if(tt) {
	        	for (int i = start; i <= end && ((end - i + 1) >= (r - index)); i++) 
	            {
	        		if(tt2) {
		                data[index] = Kasa.get(i).wartosc();
		                suma += Kasa.get(i).wartosc();
		                combinations(Kasa, data, i + 1, end, index + 1, r, sumanieroz2);
	        		}
	            }
	        }
    	}
    }
	
   public List<Pieniadz> rozlicz(int cena, List<Pieniadz> pieniadze){
	   
	   rozmienialne = 0;
	   nierozmienialne = 0;
	   listaRozmienialne.clear();
	   listaNierozmienialne.clear();
	   lista.clear();
	   for(Pieniadz p : pieniadze) {
		   if(p.czyMozeBycRozmieniony()) {
			   rozmienialne += p.wartosc();
			   listaRozmienialne.add(p);
		   }
		   else {
			   nierozmienialne += p.wartosc();
			   listaNierozmienialne.add(p);
		   }
		   lista2.add(p);
	   }
	  
	   if(nierozmienialne < cena) {
		   reszta = rozmienialne + nierozmienialne - cena;
		   Kasa.addAll(listaRozmienialne);
		   
		   while(reszta != 0) {
			   
			for(int j = 0; j < Kasa.size(); j++) {
				if(Kasa.get(j).wartosc() != 1 && Kasa.get(j).czyMozeBycRozmieniony()) {
					pien_rozmieniany = Kasa.get(j);
					Kasa.remove(j);
					dostępDoRozmieniacza(obj);
				}
			}   
			
			for(int j = 0; j < Kasa.size(); j++) {
				Pieniadz p = Kasa.get(j);
				if(Kasa.get(j).czyMozeBycRozmieniony()) {
					if(p.wartosc() <= reszta) {
						reszta -= p.wartosc();
						Kasa.remove(Kasa.get(j));
						j--;
						lista.add(p);
					}
				}   
			}
			
			for(int j = 0; j < Kasa.size(); j++) {
				Pieniadz p = Kasa.get(j);
					if(p.wartosc() <= reszta) {
						reszta -= p.wartosc();
						Kasa.remove(Kasa.get(j));
						j--;
						lista.add(p);
					}   
			}
	
			   if(Kasa.size() == 0) {
				   Kasa.addAll(listaRozmienialne);
			   }
			   if(reszta == 0) {
				   break;
			   }
			   
			   minrozm = listaRozmienialne.get(0);
			   for(Pieniadz p : listaRozmienialne) {
				   if(p.wartosc() < minrozm.wartosc()) {
					   minrozm = p;
				   }
			   }
			
			   int index = listaRozmienialne.indexOf(minrozm);
			   listaRozmienialne.remove(index);
			   int index2 = Kasa.indexOf(minrozm);
			   Kasa.remove(index2);
			   
			   pien_rozmieniany = minrozm;
			   dostępDoRozmieniacza(obj);
			
			   while(lista_rozmieniona.size() == 0);
			  
			   listaRozmienialne.addAll(lista_rozmieniona);
		   }
		   Kasa.addAll(listaNierozmienialne);
		   listaRozmienialne.clear();
	   }
	   else if(nierozmienialne > cena && rozmienialne == 0) {
		   tt = true;
		   tt2 = true;
		   it++;
		   listaN.clear();
		   
		   cena -= rozmienialne;
		   int sumaN = 0;
		   boolean isless = false;
		   int count = 0;
		   while(!isless) {
			   Pieniadz maxN = listaNierozmienialne.get(0);
			   for(Pieniadz p : listaNierozmienialne) {
				   if(p.wartosc() > maxN.wartosc()) {
					   maxN = p;
				   }
			   }
			   
			   sumaN += maxN.wartosc();
			   
			   if(count == 0) {
				   if(sumaN >= cena) {
					   int index = listaNierozmienialne.indexOf(maxN);
					   listaN.add(maxN);
					   lista.add(listaNierozmienialne.get(index));
					   listaNierozmienialne.remove(index);
					   isless = true;
				   }
				   else {
					   int index = listaNierozmienialne.indexOf(maxN);
					   listaNierozmienialne.remove(index);
					   listaN.add(maxN);
				   }
			   }
			   else {
				   if(sumaN < cena) {
					   int index = listaNierozmienialne.indexOf(maxN);
					   listaN.add(maxN);
					   lista.add(listaNierozmienialne.get(index));
					   listaNierozmienialne.remove(index);
					 
				   }
				   else {
					   int index = listaNierozmienialne.indexOf(maxN);
					   lista.add(listaNierozmienialne.get(index));
					   listaNierozmienialne.remove(index);
					   isless = true;
				   }
			   }
			   count++;
		   }
		   int sumanieroz2 = 0;
		   for(Pieniadz p : listaN) {
			   sumanieroz2 += p.wartosc();
		   }
		   sumanieroz2 = Math.abs(sumanieroz2 - cena);
		   
		   while(sumanieroz2 != 0) {
			  
			   boolean czysa = false;
		
			   for(int j = 0; j < Kasa.size(); j++) {
				   Pieniadz p = Kasa.get(j);
				   if(Kasa.get(j).czyMozeBycRozmieniony()) {
					   if(p.wartosc() <= sumanieroz2) {
						   sumanieroz2 -= p.wartosc();
						   Kasa.remove(Kasa.get(j));
						   j--;
						   lista.add(p);
					   }
					   else {
						   czysa = true;   
					   }
				   }
			   }

			  
			   if(czysa == false) {
				 
				   printCombinations(Kasa, Kasa.size(), sumanieroz2);
				   sumanieroz2 = 0;
			   }

			   if(sumanieroz2 > 0) {
				  
				   	for(int i = 0; i < Kasa.size(); i++) {
				   		if(Kasa.get(i).czyMozeBycRozmieniony()) {
	
				   			pien_rozmieniany = Kasa.get(i);
				   			Kasa.remove(Kasa.get(i));
				   			
				   			dostępDoRozmieniacza(obj);
							while(lista_rozmieniona.size() == 0);
							break;
				   		}
				   	}
			   }  
		   }
	   }
	   return lista;
   }

	public List<Pieniadz> stanKasy(){
	
		 return Kasa;
	}

	public void dostępDoRozmieniacza(RozmieniaczInterface rozmieniacz){
		obj = rozmieniacz;
		
		lista_rozmieniona.clear();
		if(pien_rozmieniany != null) {
			lista_rozmieniona = rozmieniacz.rozmien(pien_rozmieniany);
			Kasa.addAll(lista_rozmieniona);
		}
	}

	public void dostępDoPoczątkowegoStanuKasy(Supplier<Pieniadz> dostawca) {
	
		Pieniadz nowy_pieniadz = dostawca.get();
		while(nowy_pieniadz != null) {
			Kasa.add(nowy_pieniadz);
			nowy_pieniadz = dostawca.get();
		}
	}
}