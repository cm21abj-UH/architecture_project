/*
Carter Marshall
cm21aj@herts.ac.uk
*/
package arcitectureproject.sportsproject_revamp;
import java.awt.*;
import static java.awt.SystemColor.text;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFileChooser;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import static java.util.Collections.copy;
import javax.swing.filechooser.FileSystemView;
import javax.swing.DefaultListModel;

public class sportsinterface extends JFrame {
    competitor_list complist = new competitor_list();
    JList CompData;
    
    public String fileSet;
    JFrame Frame;
    JPanel Panel;

    JScrollPane listScroller;
    
    public void FrameMain() {
        DefaultListModel<String> Competitors = new DefaultListModel<>();
        Competitors.addElement("[100, Ann Sthen, 23, Female, UK, 5, 2, 1, 5]");
        Competitors.addElement("[101, George Beth Shon, 31, Male, UK, 2, 4, 5, 1]");
        Competitors.addElement("[102, Kaith Andy Clos, 29, Female, UK, 4, 5, 2, 2]");
        Competitors.addElement("[103, Rinon Grov, 25, Male, US, 1, 1, 5, 5]");
        Competitors.addElement("[104, Mark Do Leno, 22, Male, UK, 5, 5, 4, 2]");
        Competitors.addElement("[105, Harry Patrick, 32, Male, UK, 2, 5, 3, 8]");
        Competitors.addElement("[106, Vicy Mathew, 33, Male, UK, 5, 2, 3, 3]");
        Competitors.addElement("[107, Monica Loy, 29, Female, US, 4, 4, 3, 2]");
        Competitors.addElement("[108, Susan Mathew, 28, Female, US, 5, 2, 5, 3]");
        Competitors.addElement("[109, Andy Lov, 22, Female, US, 5, 2, 1, 2]");
        Competitors.addElement("[110, Mary Francis, 27, Male, UK, 3, 4, 2, 4]");
        
        CompData = new JList<>(Competitors);
        add(CompData);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Manager");       
        this.setSize(200,200);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

}
