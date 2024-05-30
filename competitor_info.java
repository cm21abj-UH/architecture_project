/*
Carter Marshall
cm21aj@herts.ac.uk
*/
package arcitectureproject.sportsproject_revamp;

class footballer {
    protected String Name;
    protected int Age;
    protected String Country;
    protected String Level;
    protected int CompNumber;  
    protected double AverageScore;
    protected int[] Scores = {1, 2, 3, 4}; //score example
    
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
        System.out.println("CN " + CompNumber + " (placeholder initials) " + "has overall score of " + AverageScore);
    }   
    
    public int[] getScoreArray() {
        return Scores;
    }
} 

