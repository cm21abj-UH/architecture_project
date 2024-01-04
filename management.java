package arcitectureproject.sports_project;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;

public class management {
    protected int[] CompetitorList;
    protected String fileName;
    
    public int[] initArray() {
        CompetitorList = new int[9]; //despite the number, this is actually 10 entries
        return CompetitorList;
    }
    
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
    
    public void makeReport(String fileName) { //creates the text file with the report
        try {
            Scanner fileReader = new Scanner(new File("RunCompetitor.csv"));
            
            while (fileReader.hasNextLine()) {
                System.out.println(fileReader.nextLine()); 
            }
        }
        catch (IOException e) {
            System.out.println("Couldn't print file");
        }
    }
}
