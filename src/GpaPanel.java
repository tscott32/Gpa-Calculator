import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GpaPanel extends JPanel {
    
    public GpaPanel() {
	setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
	
	JTextField semesterGpa = new JTextField();
	JTextField overAllGpa  = new JTextField();
	
	semesterGpa.setMaximumSize(new Dimension(200, (int)semesterGpa.getPreferredSize().getHeight()));
	overAllGpa.setMaximumSize(new Dimension(200, (int)overAllGpa.getPreferredSize().getHeight()));
	
	add(semesterGpa);
    }
    
    public static double calculateGpa() {
	int grade = 0;
	int creditHours = 0;
	int qualityPoints = 4 * creditHours;
	double gpa = grade / qualityPoints;
	
	return gpa;
    }
   
}
