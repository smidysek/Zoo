package pack;

import java.time.LocalDate;

public class Plaz extends Zvire{
	final boolean TEPLOKREVNOST = false;

	public Plaz(LocalDate datumNarozeni, String jmeno, boolean zijuVCesku) {
		super(datumNarozeni, jmeno, zijuVCesku);
	}
	
	@Override
	public void vypisInformace(){
		System.out.println("Datum narozen� zv��ete je " +datumNarozeni);
		System.out.println("Jm�no je " +jmeno+".");
		System.out.println("Zv��e je plaz a je studenokrevn�.");
	}
}
