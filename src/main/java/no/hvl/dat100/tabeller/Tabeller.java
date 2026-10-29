package no.hvl.dat100.tabeller;

import java.time.Duration;
import java.time.Instant;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < tabell.length; i++){
			sb.append(tabell[i]);
			if (i != tabell.length - 1)
				sb.append(",");
		}
		sb.append("]");

		System.out.println(sb);
	}

	// b)
	public static String tilStreng(int[] tabell) {

		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < tabell.length; i++){
			sb.append(tabell[i]);
			if (i != tabell.length - 1)
				sb.append(",");
		}
		sb.append("]");

		return sb.toString();
	}

	// c)
	public static int summer(int[] tabell) {

		int sum = 0;
		for (int value : tabell){
            sum += value;
		}

		int initial = 0;
		int sumWhile = 0;
		do {
			if (tabell.length == 0) break;
            sumWhile += tabell[initial];
			initial++;
        }
		while (initial < tabell.length);

		return sumWhile;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		for (int value : tabell){
			if (value == tall)
				return true;
		}

		return false;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		for (int i = 0; i < tabell.length; i++){
			if (tabell[i] == tall){
				return i;
			}
		}

		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {

		int[] newTabell = new int[tabell.length];

		for (int i = 0; i < tabell.length; i++){
			newTabell[i] = tabell[tabell.length - 1 -i];
		}

		return newTabell;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

        for (int k = 0; k < tabell.length; k++) {
            for (int i = k+1; i < tabell.length; i++) {
                if (tabell[k] > tabell[i]) {
					return false;
                }
            }
        }

		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int[] concatenated = new int[tabell1.length + tabell2.length];
		for (int i = 0; i < tabell1.length; i++){
			concatenated[i] = tabell1[i];
		}
		for (int i = 0; i < tabell2.length; i++){
			concatenated[tabell1.length + i] = tabell2[i];
		}
		return concatenated;
	}
}
