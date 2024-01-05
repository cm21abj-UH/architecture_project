package arcitectureproject.sports_project;
import java.io.File;
import java.io.FileWriter; 
import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;

public class management {  
    protected String CompetitorList[];
    protected String fileName;
    
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
    public String getFile() {
        System.out.println("provide a file containing competitor information: ");
        Scanner getFile = new Scanner(System.in);
        fileName = getFile.nextLine();
        return fileName;
    }

    public void updateList (String fileName, String[] CompetitorList) {
        ArrayList<String> CompList = new ArrayList<String>();
        try {
            Scanner readFile = new Scanner(new File(fileName));
            while (readFile.hasNextLine()) {
                CompList.add(readFile.nextLine());
            }
            readFile.close();
            System.out.println(CompList);
        }
        catch (IOException e) {
            System.out.println("Failed to modify arraylist.");
        }
    }
    
    public void makeReport (String fileName, String[] CompetitorList) {
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
                System.out.println(readFile.nextLine()); 
                reportWriter.write(readFile.nextLine()); //writes contestant info into txt file
                reportWriter.write('\n'); //seperates contestant information by line
            }
            reportWriter.write("");
            readFile.close();
            reportWriter.close(); //closes their respective files
        }
        catch (IOException e) {
            System.out.println("Couldn't make file.");
        }  
    }
}
