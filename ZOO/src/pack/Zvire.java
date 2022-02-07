package pack;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Zvire {
	LocalDate datumNarozeni;
	List<Integer> hodinyKrmeni=new ArrayList<Integer>();  
	int pocetKrmeniZaDen;
	String jmeno;
	boolean zijuVCesku;
	
	public Zvire(LocalDate datumNarozeni, String jmeno, boolean zijuVCesku){
		this.datumNarozeni = datumNarozeni;
		this.jmeno = jmeno;
		this.zijuVCesku = zijuVCesku;
	}
	
	public void vypisInformace(){
		System.out.println("Datum narozen� zv��ete je " +datumNarozeni+ ". ");
		System.out.println("Hodiny krmen� jsou " +hodinyKrmeni+ ".");
		System.out.println("Po�et krmen� za den je " +pocetKrmeniZaDen+ ".");
		System.out.println("Jm�no je " +jmeno+ ".");
		System.out.println("�ije v �esku? " +zijuVCesku+".");
	}

	public List<Integer> getHodinyKrmeni() {
		return hodinyKrmeni;
	}
	
	public LocalDate getDatumNarozeni() {
		return datumNarozeni;
	}

	public int getPocetKrmeniZaDen() {
		return pocetKrmeniZaDen;
	}

	public String getJmeno() {
		return jmeno;
	}

	public boolean isZijuVCesku() {
		return zijuVCesku;
	}
	
	public void setHodinyKrmeni(List<Integer> hodinyKrmeni) {
		this.hodinyKrmeni = hodinyKrmeni;
	}

	public void setPocetKrmeniZaDen(int pocetKrmeniZaDen) {
		this.pocetKrmeniZaDen = pocetKrmeniZaDen;
	}
}
