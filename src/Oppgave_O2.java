import static javax.swing.JOptionPane.*;

public class Oppgave_O2 {
	public static void main(String[] args) {
		for (int i = 1; i<=10;i++) {
			int poengSum = 0;
			boolean gyldigInput = false;
			while (!gyldigInput) {
				poengSum = Integer.parseInt(showInputDialog("Hvilken poengsum skal utregnes?"));
				if(poengSum < 0 || poengSum > 100) {
					showMessageDialog(null, "Ugyldig poengsum, prøv på nytt.");
				} else {
					gyldigInput = true;
				}				
			}
			char karakter;
			if (poengSum >= 90) {
				karakter = 'A';
			} else if (poengSum >= 80) {
				karakter = 'B';
			} else if (poengSum >= 60) {
				karakter = 'C';
			} else if (poengSum >= 50) {
				karakter = 'D';
			} else if (poengSum >= 40) {
				karakter = 'E';
			} else {
				karakter = 'F';
			}
			showMessageDialog(null, "Karakter: " + karakter);
		}				
	}
}
