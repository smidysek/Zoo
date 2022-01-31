package pack;

import java.time.LocalDate;

public class ZooAplikace {

	public static void main(String[] args) {
		Pes pes = new Pes(2000, "Max", false, 36);
		pes.vypisInformace();
		pes.setPocetKrmeniZaDen(2);
		pes.setHodinyKrmeni(9,17);
		
		Medved medved = new Medved(2000, "Brumbál", false, 36);
		medved.vypisInformace();
		medved.setPocetKrmeniZaDen(3);
		medved.setHodinyKrmeni(9,17);
		
		Had had = new Had(2000, "Snake", false, 36);
		had.vypisInformace();
		had.setPocetKrmeniZaDen(1);
		had.setHodinyKrmeni(9);
		
		Krokodyl krokodyl = new Krokodyl(2000, "George", false, 36);
		krokodyl.vypisInformace();
		
		Zelva zelva = new Zelva(2000, "Rafael", false, 36);
		zelva.vypisInformace();
	}

}
