/*
Carter Marshall
cm21aj@herts.ac.uk
*/
package arcitectureproject.sports_project;

public class Sports_project {
    public static void main(String[] args) {
        project_interface ui = new project_interface();
        competitorInfo compInfo = new competitorInfo();
        management manager = new management();

        ui.PanelMain();
        //manager.getFile();
        //manager.updateList(manager.fileName);
        //manager.makeReport(manager.fileName); //prints file
    }
}
