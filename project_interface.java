/*
Carter Marshall
cm21aj@herts.ac.uk
*/
package arcitectureproject.sports_project;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class project_interface {
    JFrame Frame;
    JButton TestButton;
    public void PanelMain() {
       JFrame Frame = new JFrame("hello"); 
       JButton TestButton = new JButton("hello");
       //TestButton.setBounds(100, 100, 100, 100);
       
       //Frame.add(TestButton);
       
       Frame.setSize(400, 500);
       Frame.setLayout(null);
       Frame.setVisible(true);
    }
}
