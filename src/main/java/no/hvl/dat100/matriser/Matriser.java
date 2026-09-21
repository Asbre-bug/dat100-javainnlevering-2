package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {

		StringBuilder sb = new StringBuilder();
        for (int j = 0; j < matrise.length; j++) {
            int[] row = matrise[j];
            sb.append("{");
            for (int i = 0; i < row.length; i++) {
                sb.append(row[i]);
                if (i != row.length - 1) {
                    sb.append(",");
                }
            }
            sb.append("}");
            if (j != matrise.length - 1) {
                sb.append(",");
            }
        }
		System.out.println("{" + sb + "}");
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		StringBuilder sb = new StringBuilder();
        for (int[] row : matrise) {
            for (int i = 0; i < row.length; i++) {
                sb.append(row[i]);
                if (i != row.length - 1) {
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }
		System.out.println(sb.toString());
		return sb.toString();
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

		int[][] newMatrise = new int[matrise.length][matrise[0].length];

        for (int i = 0; i < matrise.length; i++) {
            for (int j = 0; j < matrise[i].length; j++) {
                newMatrise[i][j] = matrise[i][j] * tall;
            }
        }

		return newMatrise;
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		if (a.length != b.length) return false;

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a[i].length; j++) {

				if(a[i][j] != b[i][j]) {
					return false;
				}
			}
		}

		return true;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO

		throw new UnsupportedOperationException("Metoden speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
	
	}
}
