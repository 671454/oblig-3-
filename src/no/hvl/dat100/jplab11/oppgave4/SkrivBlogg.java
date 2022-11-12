package no.hvl.dat100.jplab11.oppgave4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.Innlegg;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {

		PrintWriter skriver = null;
		try {

			skriver = new PrintWriter(mappe + filnavn);
			String blogg = samling.toString();
			skriver.write(blogg);

		} catch (FileNotFoundException e) {
			System.out.println("Filen finnes ikke");
		}

		finally {
			if (skriver != null) {
				skriver.close();
				return true;
			}
		}
		return false;

	}
}