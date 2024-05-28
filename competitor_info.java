/*
Carter Marshall
cm21aj@herts.ac.uk
*/
package arcitectureproject.sportsproject_revamp;

class footballer {
    private String Name;
    private int Age;
    private String Country;
    private String Level;
    private int CompNumber;  
    private double AverageScore;
    private int[] Scores = {5, 3, 3, 2};
    
    public void setName(String sName) {
        Name = sName;
    }
    
    public String getName() {
        return Name;
    }
    
    public void setAge(int sAge) {
        Age = sAge;
    }
    
    public int getAge() {
        return Age;
    }
    
    public void setCountry(String sCountry) {
        Country = sCountry;
    }
    
    public String getCountry() {
        return Country;
    }
    
    public void setLevel(String sLevel) {
        Level = sLevel;
    }
    
    public String getLevel() {
        return Level;
    }
    
    public void setCompNumber(int sCompNum) {
        CompNumber = sCompNum;
    }
    
    public int getCompNumber() {
        return CompNumber;
    }
    
    public double getOverallScore() {
        int ScoresLength = Scores.length;
        double ScoresSum = 0;
        for (int i = 0; i < ScoresLength; i++) {
            ScoresSum += Scores[i];
        }
        
        AverageScore = ScoresSum / ScoresLength;
        return AverageScore;
    }
    
    public void getFullDetails() {
        System.out.println("Competitor number: " + CompNumber + ", " + "named " + Name + ", " + "from the country " + Country + ".");
        System.out.println(Name + " is a " + Level + " aged " + Age +" and has an overall score of " + AverageScore);
    }
    
    public void getShortDetails() {
        //
    }   
}

