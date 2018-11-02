import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ClassPanel extends JPanel {

    ClassPanel() {
	// Setting the format for the class panel
	setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
	
	// Instantiating objects for class panel elements
	String[] str = { "-", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "F" };
	JTextField courseName  = new JTextField();
	JTextField creditHours = new JTextField();
	JLabel courseLabel     = new JLabel("Class:");
	JLabel creditLabel     = new JLabel("Credit Hours:");
	JComboBox grade	       = new JComboBox(str);
	
	// Putting elements in specified place and height
	courseName.setMaximumSize(new Dimension(200, (int) courseName.getPreferredSize().getHeight()));
	creditHours.setMaximumSize(new Dimension(200, (int) creditHours.getPreferredSize().getHeight()));
	grade.setMaximumSize(new Dimension(200, (int) grade.getPreferredSize().getHeight()));
	courseLabel.setMaximumSize(new Dimension(100, (int) courseName.getPreferredSize().getHeight()));
	creditLabel.setMaximumSize(new Dimension(100, (int) courseName.getPreferredSize().getHeight()));

	String whatever = (String)(grade.getSelectedItem());
	
	// Displays the class panel elements
	add(courseLabel);
	add(courseName);
	add(grade);
	add(creditLabel);
	add(creditHours);

    }

}
