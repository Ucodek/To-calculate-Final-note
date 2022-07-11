package CalcFinNote;
import javax.swing.JOptionPane;

public class CalFinalCNote {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Please enter your name");
		int Vize;
		int Final;
		int Last;
		Vize = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter your midterm note"));
		if(Vize>100) { JOptionPane.showMessageDialog(null, "The midterm note can't be greater than 100");
		JOptionPane.showInputDialog(null, "please enter your midterm note again");}
		else if(Vize<0) {JOptionPane.showMessageDialog(null, "The midterm note cannot be lower than 0");
		Vize = Integer.parseInt(JOptionPane.showInputDialog("please enter your midterm note again"));
		JOptionPane.showMessageDialog(null, "Vize has entered");}
		Final = Integer.parseInt(JOptionPane.showInputDialog("Please enter your Final"));
		JOptionPane.showMessageDialog(null, "Final has entered");
		int X= Vize*4/10;
		int Y= Final*6/10;
		Last = X+Y;
		if(Last>=60) {JOptionPane.showMessageDialog(null, "You passed the course with "Last+ "grade" + name +" I knew you could make it");

	}else {JOptionPane.showMessageDialog(null," You failed the course with"+ Last+ name+ " You have to work harder");
		
	
	
	}
	}
		

}

