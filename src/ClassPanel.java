import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ClassPanel extends JPanel {

    private double creditHourTextField = 0;
    private double switchNum = 0;

    ClassPanel() {
	// Setting the format for the class panel
	setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

	// Instantiating objects for class panel elements
	String[] str = { "-", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "F" };
	JTextField courseName  = new JTextField();
	JTextField creditHours = new JTextField();
	JLabel courseLabel     = new JLabel("Class:");
	JLabel creditLabel     = new JLabel("Credit Hours:");
	JComboBox grade        = new JComboBox(str);

	// Putting elements in specified place and height
	courseName.setMaximumSize(new Dimension(200, (int) courseName.getPreferredSize().getHeight()));
	creditHours.setMaximumSize(new Dimension(200, (int) creditHours.getPreferredSize().getHeight()));
	grade.setMaximumSize(new Dimension(200, (int) grade.getPreferredSize().getHeight()));
	courseLabel.setMaximumSize(new Dimension(100, (int) courseName.getPreferredSize().getHeight()));
	creditLabel.setMaximumSize(new Dimension(100, (int) courseName.getPreferredSize().getHeight()));

	creditHours.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		String getCreditHourText = creditHours.getText();
		creditHourTextField = Double.parseDouble(getCreditHourText);
		SemesterPanel.calculateSemesterGpa();
	    }
	});

	grade.addActionListener(new ActionListener() {    

	    @Override
	    public void actionPerformed(ActionEvent arg0) {
		switch ((String)grade.getSelectedItem()) {
    		case "A": switchNum = 4.000;
    		break;
    		case "A-": switchNum = 3.670;
    		break;
    		case "B+": switchNum = 3.330;
    		break;
    		case "B": switchNum = 3.000;
    		break;
    		case "B-": switchNum = 2.670;
    		break;
    		case "C+": switchNum = 2.330;
    		break;
    		case "C": switchNum = 2.000;
    		break;
    		case "C-": switchNum = 1.670;
    		break;
    		case "D+": switchNum = 1.330;
    		break;
    		case "D": switchNum = 1.000;
    		break;
    		case "D-": switchNum = 0.670;
    		break;
    		case "F": switchNum = 0.000;
		}
		SemesterPanel.calculateSemesterGpa();
	    }
	});

	// Displays the class panel elements
	add(courseLabel);
	add(courseName);
	add(grade);
	add(creditLabel);
	add(creditHours);
    }

    public double calculateClassGpa() {
	double grades = switchNum;	
	return grades;
    }
    
    public double calc() {
	    double creditHours = creditHourTextField;
	    double grades = switchNum;
	    double earnedQP = grades * creditHours;
	    double attemptedQP = creditHours * 4.0;
	    double gpa = (earnedQP/attemptedQP) * 4.0;
	    
	    return gpa;
	}
    
    public double getCreditHours() {
	return creditHourTextField;
    }
}
