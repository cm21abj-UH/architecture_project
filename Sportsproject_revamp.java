/*
Carter Marshall
cm21aj@herts.ac.uk
*/
package arcitectureproject.sportsproject_revamp;

import java.io.FileNotFoundException;

public class Sportsproject_revamp {
    public static void main(String[] args) throws FileNotFoundException {
        sportsinterface ui = new sportsinterface();
        manager_class manager = new manager_class();
        footballer footballPlayer = new footballer();
        competitor_list complist = new competitor_list();
        
        //note that this program currently asks for the file used twice as inheritence is slightly broken for file reader/report.txt maker
        manager.setFile();
        complist.setCompList();
        complist.setList();
        complist.prntList();
        manager.outputFile();
        ui.FrameMain();
    }
}
