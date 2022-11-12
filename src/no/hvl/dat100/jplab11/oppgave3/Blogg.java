package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	private Innlegg[] innleggtabell;
	private int nesteledig;

	public Blogg() {
		innleggtabell = new Innlegg[20];
		nesteledig = 0;
	}

	public Blogg(int lengde) {
		innleggtabell = new Innlegg[lengde];

	}

	public int getAntall() {
		return nesteledig;
	}

	public Innlegg[] getSamling() {
		return innleggtabell;

	}

	public int finnInnlegg(Innlegg innlegg) {

		int pos = 0;
		boolean funnet = false;

		while (!funnet && pos < nesteledig) {

			if (innleggtabell[pos].getId() == innlegg.getId()) {
				funnet = true;
			} else
				pos++;

		}

		if (funnet) {
			return pos;
		} else
			return -1;
	}

	public boolean finnes(Innlegg innlegg) {

		boolean funnet = false;
		if (finnInnlegg(innlegg) > (-1)) {
			funnet = true;
		}
		return funnet;
	}

	public boolean ledigPlass() {

		if (nesteledig < innleggtabell.length) {
			return true;
		}
		return false;

	}

	public boolean leggTil(Innlegg innlegg) {

		boolean ok = false;

		if (!(finnes(innlegg)) && ledigPlass()) {
			innleggtabell[nesteledig] = innlegg;
			nesteledig++;
			ok = true;
		}
		return ok;

	}

	public String toString() {
		String streng = "";

		for (int i = 0; i < innleggtabell.length; i++) {
			streng += innleggtabell[i].toString();

		}
		return nesteledig + "\n" + streng;

	}

	// valgfrie oppgaver nedenfor

	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}

	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());

	}

	public boolean slett(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
	}

	public int[] search(String keyword) {

		throw new UnsupportedOperationException(TODO.method());

	}
}