/*
Carter Marshall
cm21aj@herts.ac.uk
*/
package arcitectureproject.sportsproject_revamp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

    /*
    NOTE: FILE MUST BE PLACED IN NETBEANS PROJECT FOLDER!
    EXAMPLE:
    sportsproject_revamp (project file)
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
                            +-Sportsproject_revamp.java
                            +-manager_class.java
                            etc..
    */
class manager_class {
    protected String fileName;
    
    public void setFile() {
        System.out.println("Provide a file containing competitor information: ");
        Scanner getFile = new Scanner(System.in);
        fileName = getFile.nextLine();
    }
    
    public String getFile() {
        return fileName;
    }
    
    public void outputFile() {
        //competitor_list complist = new competitor_list();
        try {
            Scanner readFile = new Scanner(new File(fileName));
            File reportFile = new File("report.txt");
            if (reportFile.createNewFile()) {
                System.out.println("Created file 'report.txt'");
            }
            else {
                System.out.println("A file by this name already exists! Please delete or move it, and try again.");
            }

            FileWriter reportWriter = new FileWriter("report.txt");
            reportWriter.write("All competitor details: \n");
            while (readFile.hasNextLine()) {
                //System.out.println(readFile.nextLine()); //prints file info (debug code)
                reportWriter.write(readFile.nextLine()); //writes contestant info into txt file
                reportWriter.write('\n'); //seperates contestant information by line
            }
            reportWriter.write("Highest scoring competitor details: \n");
            reportWriter.write("placeholder \n");
            reportWriter.write("Lowest score given: \n");
            reportWriter.write("placeholder \n");
            reportWriter.write("Average score of all competitors: \n");
            reportWriter.write("placeholder \n");
            reportWriter.write("Highest score given:");
            reportWriter.write("placeholder \n");
            reportWriter.write("Total scores across all competitors: \n");
            reportWriter.write("placeholder \n");
            readFile.close();
            reportWriter.close(); //closes their respective files/functions
            
            /*
            add comp number input
            */ 
        }
        catch (IOException e) {
            System.out.println("Couldn't make file.");
        }  
    }
};

class competitor_list extends footballer {
    //footballer fball = new footballer();
    manager_class manager = new manager_class();
    private ArrayList<String[]> CompetitorList;

    public void setCompList() {
        this.CompetitorList = new ArrayList<String[]>(10);
    }
    
    public void setList() throws FileNotFoundException {
        String[] record = new String[2];
        manager.setFile();
        Scanner scan = new Scanner(new File(manager.fileName));
        while (scan.hasNext()) {
            record = scan.nextLine().split(",");
            CompetitorList.add(record);
        }
    }

    public ArrayList<String[]> getList() {
        return CompetitorList;
    }
    
    public void prntList() {
        for (int i = 0; i < CompetitorList.size(); i++) {
            System.out.println(Arrays.toString(CompetitorList.get(i))); //prints the arraylist for debugging purposes
        }
    }
}
