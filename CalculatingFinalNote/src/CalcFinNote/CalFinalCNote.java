package CalcFinNote;
import javax.swing.JOptionPane;

public class CalFinalCNote {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Please enter your name");
		int Vize;
		int Final;
		int Last;
		Vize = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter your midterm note"));
		if(Vize>100) { JOptionPane.showMessageDialog(null, "Vize notu 100 den büyük olamaz");
		JOptionPane.showInputDialog(null, "Vize notunu yeniden gir");}
		else if(Vize<0) {JOptionPane.showMessageDialog(null, "Vize notu 0dan küçük olamaz");
		Vize = Integer.parseInt(JOptionPane.showInputDialog("Vize notunu yeniden gir"));
		JOptionPane.showMessageDialog(null, "Vize has entered");}
		Final = Integer.parseInt(JOptionPane.showInputDialog("Please enter your Final"));
		JOptionPane.showMessageDialog(null, "Final has entered");
		int X= Vize*4/10;
		int Y= Final*6/10;
		Last = X+Y;
		if(Last>=60) {JOptionPane.showMessageDialog(null, Last+ " ile geçtin "+ name +" Baþaracaðýný biliyordum");

	}else {JOptionPane.showMessageDialog(null, Last+" ile Kaldýn "+ name+ " Daha fazla çalýþmalýsýn");
		
	
	
	}
	}
		

}

