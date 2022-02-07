package pack;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ZooAplikace {
	
	public static void main(String[] args) {
		LocalDate datumNarozeni = LocalDate.of(2000, 4, 2);
		List<Integer> hodinyKrmeni=new ArrayList<Integer>();
		hodinyKrmeni.add(16);
		hodinyKrmeni.add(7);
		
		Pes pes = new Pes(datumNarozeni, "Max", false, 36);
		pes.setPocetKrmeniZaDen(2);
		pes.setHodinyKrmeni(hodinyKrmeni);
		pes.vypisInformace();
		
		Medved medved = new Medved(datumNarozeni, "Brumbál", false, 36);
		medved.setHodinyKrmeni(hodinyKrmeni);
		medved.setPocetKrmeniZaDen(3);
		medved.vypisInformace();
		
		Had had = new Had(datumNarozeni, "Snake", false, 30);
		had.setPocetKrmeniZaDen(1);
		had.setHodinyKrmeni(hodinyKrmeni);
		had.vypisInformace();
		
		Krokodyl krokodyl = new Krokodyl(datumNarozeni, "George", false, 30);
		krokodyl.vypisInformace();
		
		Zelva zelva = new Zelva(datumNarozeni, "Rafael", false, 33);
		zelva.vypisInformace();
	}

}
