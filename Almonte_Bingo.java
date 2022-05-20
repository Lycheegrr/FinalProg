import javax.swing.JOptionPane;
 
public class Almonte_Bingo {

    public static void main(String args[]) {
                int number;
		char result;

		number=Integer.parseInt(JOptionPane.showInputDialog("Enter B-I-N-G-O number between 1-75: "));
		 
		if (number>=1 && number<=15) {
			result ='B';
			JOptionPane.showMessageDialog(null, "Chosen number corresponds to " +result);
		}
       		  
		else if (number >= 16 && number <= 30) {
			result ='I';
			JOptionPane.showMessageDialog(null, "Chosen number corresponds to " +result);
		}
		else if (number >= 31 &&  number <= 45) {
			result ='N';
			JOptionPane.showMessageDialog(null, "Chosen number corresponds to " +result);
		}
		else if (number >= 46 && number <= 60 ) {
			result ='G';
			JOptionPane.showMessageDialog(null, "Chosen number corresponds to "+result);
		}
		else if (number >= 61 && number <= 75) {
			result ='O';
			JOptionPane.showMessageDialog(null, "Chosen number corresponds to "+result);
		}
		else 
	
		JOptionPane.showMessageDialog(null, "Invalid B-I-N-G-O number!", null, JOptionPane.WARNING_MESSAGE);
	}

	}
