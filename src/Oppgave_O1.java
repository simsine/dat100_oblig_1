import static javax.swing.JOptionPane.*;

public class Oppgave_O1 {
	static final int[] trinn_inntekt = {198_350, 279_150, 642_950, 926_800, 1_500_000}; // Nedre grensen for hver inntektstrinn
	static final double[] trinn_skatt = {0.017, 0.04, 0.134, 0.164, 0.174}; // Skatteprosent for hvert skattetrinn
	
	private static int beregnSkattetInntekt(int inntekt) {
		int inntekt_skattet = 0;
		for (int i = 0; i < trinn_inntekt.length; i++) {
			int trinn_skattet = (int) Math.floor((inntekt - trinn_inntekt[i]) * trinn_skatt[i]);
			if (trinn_skattet <= 0) {
				break;
			}
			inntekt_skattet += trinn_skattet;
		}
		return inntekt_skattet;
	}
	public static void main(String[] args) {
		int inntekt = Integer.parseInt(showInputDialog("Hva var inntekten din året 2023?"));
		
		int inntekt_skattet = beregnSkattetInntekt(inntekt);
		
		showMessageDialog(null, "Du må betale " + inntekt_skattet + "kr i skatt.\n Du står da igjen med " + (inntekt - inntekt_skattet) + "kr.");
	}
}
