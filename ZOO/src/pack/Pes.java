package pack;

import java.time.LocalDate;

public class Pes extends Savec{
	public Pes(LocalDate datumNarozeni, String jmeno, boolean zijuVCesku, int telesnaTeplota) {
		super(datumNarozeni, jmeno, zijuVCesku, telesnaTeplota);
	}
	
	@Override
	public void vypisInformace(){
		System.out.println("Jsem pes.");
	}
}
