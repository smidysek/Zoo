package pack;

import java.time.LocalDate;

public class Plaz extends Zvire{
	final boolean TEPLOKREVNOST = false;

	public Plaz(LocalDate datumNarozeni, String jmeno, boolean zijuVCesku) {
		super(datumNarozeni, jmeno, zijuVCesku);
	}
	
	@Override
	public void vypisInformace(){
		System.out.println("Datum narození zvíøete je " +datumNarozeni);
		System.out.println("Jméno je " +jmeno+".");
		System.out.println("Zvíøe je plaz a je studenokrevné.");
	}
}
