package menjacnica;

import java.util.LinkedList;

import menjacnica.sistemkseoperacije.SOIzvrsiTransakciju;
import menjacnica.sistemkseoperacije.SOUcitajIzFajla;

public class MenjacnicaJavna {

	private LinkedList<Valuta> kursnaLista = new LinkedList<Valuta>();

	public double izvrsiTransakciju(Valuta valuta, boolean prodaja, double iznos) {
		return SOIzvrsiTransakciju.izvrsi(valuta, prodaja, iznos);
	}

	public void ucitajIzFajla(String putanja) {
		SOUcitajIzFajla.izvrsi(putanja, kursnaLista);

	}
}