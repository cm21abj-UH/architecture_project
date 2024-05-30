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

        complist.setCompList();
        complist.setList();
        complist.prntList();
        ui.FrameMain();
    }
}
