/*
Carter Marshall
cm21aj@herts.ac.uk
*/
package arcitectureproject.sports_project;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFileChooser;
import java.io.File;
import java.util.ArrayList;

public class project_interface {
    management manager = new management();
    JList CompetitorData;
    
    public String fileSet;
    JFrame Frame;

    JScrollPane listScroller;
    
    public void PanelMain() {
        JFrame Frame = new JFrame("Manager"); 

        JScrollPane listScroller = new JScrollPane(CompetitorData);
        Frame.add(listScroller);

        Frame.setSize(400, 500);
        Frame.setLayout(null);
        Frame.setVisible(true);
    }
    
    /*public void RetrieveCompList() {
        this.manager.CompList = new ArrayList<>();
        JList CompetitorData = new JList(manager.CompList.getList());
        System.out.println(manager.CompList);
    }*/
}
