/*
Carter Marshall
cm21aj@herts.ac.uk
*/
package arcitectureproject.sports_project;
import java.util.Scanner; //gets the package for scanners, which are needed for input information
import java.util.Random;

public class competitorInfo {
    
    String Name = "";
    Integer Age = 0;
    String Country = "";
    String Level = "";
    Integer CompNumber = 0;
    protected int[] Scores = {0, 1, 2, 3, 4, 5};
    
    public void getCompetitorInfo(String[] args) {

        Scanner getName = new Scanner(System.in);
        System.out.println("Enter the contestant's name: ");
        Name = getName.nextLine();
        
        boolean AgeCheck = false;
        while (!AgeCheck) {
            try {
                Scanner getAge = new Scanner(System.in);
                System.out.println("Enter the contestant's age: ");
                Age = getAge.nextInt();
                AgeCheck = true;
            } catch (Exception e) {
                System.out.println("That's not a number!");
            }
        }
        
        Scanner getCountry = new Scanner(System.in);
        System.out.println("Enter the contestant's country: ");
        Country = getCountry.nextLine();
        
        boolean SkillCheck = false;
        while (!SkillCheck) {
            Scanner getLevel = new Scanner(System.in);
            System.out.println("Enter the contestant's skill level.");
            System.out.println("Valid skill levels: 'Novice', 'Expert': ");
            Level = getLevel.nextLine();
            if (Level.equals("Novice") || Level.equals("novice")) {
                System.out.println("swag test real the second");
                Level = "Novice"; //sets the skill with a capitalised start, because chances are, the name and country will have a capital first letter
                SkillCheck = true;
            }
            else if (Level.equals("Expert") || Level.equals("expert")) {
                System.out.println("swag test real the second");
                Level = "Expert";
                SkillCheck = true;
            }
            else {
                System.out.println("This is not a recognised skill level.");
            }
        }
        
        Random rand = new Random();
        CompNumber = rand.nextInt(999);
    } 
    
    public int[] getScoreArray() { //sets and returns the array
        return Scores.clone();
    }
    
    public double getOverallScore(int[] Scores) {
        int ScoresLength = Scores.length;
        int ScoresSum = 0;
        for (int i = 0; i < ScoresLength; i++) {
            ScoresSum += Scores[i];
        }
        
        int MeanScore = ScoresSum / ScoresLength;
        double AverageScore = MeanScore;
        System.out.println("This gives them an overall score of "+AverageScore);
        return 5;
    }
    
    public void getFullDetails(double MeanScore, int[] Scores) {
        System.out.println(java.util.Arrays.toString(Scores));
        System.out.println("Competitor number is"+CompNumber+", competitor name is "+Name+ ", and from the country "+Country + ".");
        System.out.println(Name+" is a "+Level+"and recieved these scores: "+Scores[1]+", "+Scores[2]+", "+Scores[3]+", "+Scores[4]+", "+Scores[5]+".");
        System.out.println("This gives them an overall score of "+MeanScore);
    }
    
    public void getShortDetails() {
        System.out.println("CN " + CompNumber + "([name]) has overall score of" + "([score placeholder])");
    }
}
