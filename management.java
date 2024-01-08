/*
Carter Marshall
cm21aj@herts.ac.uk
*/
package arcitectureproject.sports_project;
import java.io.File;
import java.util.List;
import java.io.FileWriter; 
import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;

public class management {  
    private List<String> CompList;
    private String fileName;
    
    /*
    NOTE: FILE MUST BE PLACED IN PROJECT FOLDER!
    EXAMPLE:
    sports_project (project file)
    |
    +-RunCompetitor.csv < place file in 'sports_project'
    |
    +--src
        |
        +--main
            |
            +--java
                 |
                 +--architectureproject
                            |
                            +-Sports_project.java
                            +-management.java
                            etc..
    */
    public void promptFile() {
        System.out.println("Provide a file containing competitor information: ");
        Scanner getFile = new Scanner(System.in);
        fileName = getFile.nextLine();
    }
    
    public String getFile() { //getter
        return fileName;
    }
    
    public void setFile(String newFile) { //setter
        this.fileName = newFile;
    }

    public void updateList(String fileName) {
        CompList = new ArrayList<String>();
        try {
            Scanner readFile = new Scanner(new File(fileName));
            while (readFile.hasNextLine()) {
                CompList.add(readFile.nextLine());
            }
            readFile.close();
        }
        catch (IOException e) { //error if a file can't be found or written to
            System.out.println("Failed to modify arraylist.");
        }
    }
    
    public List<String> getList() {
        return CompList;
    }
    
    public void setList(List<String> newCompList) {
        this.CompList = newCompList;
    }
    
    public void makeReport (String fileName) {
        try {
            Scanner readFile = new Scanner(new File(fileName));
            File reportFile = new File("report.txt");
            if (reportFile.createNewFile()) {
                System.out.println("Created file '" + reportFile.getName() + "'");
            }
            else {
                System.out.println("A file by this name already exists! Please delete or move it, and try again.");
            }

            FileWriter reportWriter = new FileWriter("report.txt");
            while (readFile.hasNextLine()) {
                //System.out.println(readFile.nextLine()); //prints file info (debug code)
                reportWriter.write(readFile.nextLine()); //writes contestant info into txt file
                reportWriter.write('\n'); //seperates contestant information by line
            }
            reportWriter.write("");
            readFile.close();
            reportWriter.close(); //closes their respective files/functions
            
            /*
            TODO: more file output stuff
            add comp number input
            */ 
        }
        catch (IOException e) {
            System.out.println("Couldn't make file.");
        }  
    }
    public void openPanel() {
        project_interface ui = new project_interface();
        ui.PanelMain();
    }
}
