package arcitectureproject.sports_project;

public class Sports_project {
    public static void main(String[] args) {
        competitorInfo compInfo = new competitorInfo();
        management manager = new management();
        //compInfo.getScoreArray();
        //compInfo.getCompetitorInfo(args); 
        //compInfo.getOverallScore(compInfo.Scores);
        //compInfo.getFullDetails();
        manager.getFile();
        manager.updateList(manager.fileName, manager.CompetitorList);
        manager.makeReport(manager.fileName, manager.CompetitorList); //prints file
    }
}
