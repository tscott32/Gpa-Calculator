import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SemesterPanel extends JPanel {
    
    // Method to update GUI whenever an action occurs
    public void validate() {
   	this.revalidate();
    }
    
    // Semester panel constructor
    SemesterPanel(){
    
	// Declaring objects for semester panel
	setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
	ClassPanel class1 = new ClassPanel();
	ClassPanel class2 = new ClassPanel();
	ClassPanel class3 = new ClassPanel();
	ClassPanel class4 = new ClassPanel();
	JButton addClass  = new JButton("Add Class");
	GpaPanel gpaPanel = new GpaPanel();
	JLabel   gpaLabel = new JLabel("GPA:");
	
	// Method for add class button
	addClass.addActionListener(new ActionListener() {    
	    	public void actionPerformed(ActionEvent e) {
	    	    ClassPanel newClass = new ClassPanel();
	    	    // We add and remove these buttons so that
	    	    // the GUI updates properly with every action event
	    	    add(newClass);
	    	    remove(addClass);
	    	    add(addClass);
	    	    remove(gpaLabel);
	    	    add(gpaLabel);
	    	    remove(gpaPanel);
	    	    add(gpaPanel);
	    	    validate();
	    	}
	});

	// Adding all objects to the GUI
	add(class1);
	add(class2);
	add(class3);
	add(class4);
	add(addClass);
	add(gpaLabel);
	add(gpaPanel);
    }
}
