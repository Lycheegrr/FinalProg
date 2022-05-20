import javax.swing.JOptionPane;

public class Balcita_Bingo {
    
    public static void main(String[] args) {
        int y = Integer.parseInt(JOptionPane.showInputDialog("Enter a number from 1-75"));
            if(y<=15) {
                JOptionPane.showMessageDialog(null, "B");
            }
            else if(y<=30){
                JOptionPane.showMessageDialog(null, "I");
            }
            else if(y<=45){
                JOptionPane.showMessageDialog(null, "N");
            }
            else if(y<=60){
                JOptionPane.showMessageDialog(null, "G");
            }
            else if(y<=75){
                JOptionPane.showMessageDialog(null, "O");
            }
            else{
                JOptionPane.showMessageDialog(null, "Invalid Number");
            }

    }
    
}
