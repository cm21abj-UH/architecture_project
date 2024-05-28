/*
Carter Marshall
cm21aj@herts.ac.uk
*/
package arcitectureproject.sportsproject_revamp;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

class competitor_list extends manager_class {
    private ArrayList<String[]> CompetitorList;
    manager_class manager = new manager_class();
    ArrayList<String> CompNum = new ArrayList<>();
    ArrayList<String> CompName = new ArrayList<>();
    ArrayList<String> CompAge = new ArrayList<>();
    ArrayList<String> CompCountry = new ArrayList<>();
    ArrayList<String> CompScoresR1 = new ArrayList<>();
    ArrayList<String> CompScoresR2 = new ArrayList<>();
    ArrayList<String> CompScoresR3 = new ArrayList<>();
    ArrayList<String> CompScoresR4 = new ArrayList<>();

    public void setCompList() {
        this.CompetitorList = new ArrayList<>();
    }
    
    /*public void setList() {
        manager.setFile();
        try (BufferedReader br = new BufferedReader(new FileReader(manager.fileName))){
            String line;
            while ((line = br.readLine()) != null) {
                String[] s = line.split(",");
                CompetitorList.add(s);
            }
        }
        catch (IOException e) { //error if a file can't be found or written to
            System.out.println(e);
        }
    }*/
    
    public void setListAlt() throws FileNotFoundException {
        String[] record = new String[2];
        manager.setFile();
        Scanner scan = new Scanner(new File(manager.fileName));
        while (scan.hasNext()) {
            record = scan.nextLine().split(",");
            CompNum.add(record[0]);
            CompName.add(record[1]);
            CompAge.add(record[2]);
            CompCountry.add(record[4]);
            CompScoresR1.add(record[5]);
            CompScoresR2.add(record[6]);
            CompScoresR3.add(record[7]);
            CompScoresR4.add(record[8]);
            CompetitorList.add(record);
        }
    }
    
    public ArrayList<String[]> getList() {
        return CompetitorList;
    }
    
    public void prntList() {
        for (int i = 0; i < CompetitorList.size(); i++) {
            System.out.println(Arrays.toString(CompetitorList.get(i))); //prints the arraylist for debugging purposes
            System.out.println(CompNum.get(i));
            System.out.println(CompName.get(i));
            System.out.println(CompAge.get(i));
            System.out.println(CompCountry.get(i));
            System.out.println(CompScoresR1.get(i));
            System.out.println(CompScoresR2.get(i));
            System.out.println(CompScoresR3.get(i));
            System.out.println(CompScoresR4.get(i));
        }
    }
}
