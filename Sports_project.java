/*
Carter Marshall
cm21aj@herts.ac.uk
*/
package arcitectureproject.sports_project;

public class Sports_project {
    public static void main(String[] args) {
        //project_interface ui = new project_interface();
        //competitorInfo compInfo = new competitorInfo();
        management manager = new management();

        manager.promptFile(); //asks for file input
        manager.updateList(manager.getFile()); //updates the arraylist
        manager.makeReport(manager.getFile()); //creates file
        manager.openPanel(); //opens the GUI
    }
}
