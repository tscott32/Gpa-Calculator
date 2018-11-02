import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainPanel {

    public MainPanel() {
	frame();
    }
    
    public void frame() {
	
	// Instantiating objects for the main panel
	SemesterPanel semesterPanel = new SemesterPanel();
	JPanel mainPanel = new JPanel(new BorderLayout());
	JFrame border = new JFrame();
	JPanel panel = new JPanel();
	JButton addSemester = new JButton("Add Semester");
	// Setting values for the panel
	border.setSize(400, 400);
	border.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
	border.add(mainPanel);
	mainPanel.add(panel, BorderLayout.CENTER);
//	mainPanel.add(gpaOutput, BorderLayout.PAGE_END);
	panel.add(semesterPanel);
	panel.add(addSemester);

	// Method for add semester button
	addSemester.addActionListener(new ActionListener() {
	    
	    	public void actionPerformed(ActionEvent e) {
	    	    SemesterPanel newSemester = new SemesterPanel();
	    	    panel.add(newSemester);
	    	    panel.remove(addSemester);
	    	    panel.add(addSemester);
	    	    border.revalidate();
	    	}
	});
	// Setting the border to visible.
	// Wait until the end for this to avoid bugs.
	border.setVisible(true);
    }
}
