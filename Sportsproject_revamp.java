/*
Carter Marshall
cm21aj@herts.ac.uk
*/
package arcitectureproject.sportsproject_revamp;

import java.io.FileNotFoundException;

public class Sportsproject_revamp {
    public static void main(String[] args) throws FileNotFoundException {
        manager_class manager = new manager_class();
        footballer footballPlayer = new footballer();
        competitor_list complist = new competitor_list();
        

        manager.getFile();

        /*!!!everything below is a class test!!!
        footballPlayer.setAge(22);
        footballPlayer.setCompNumber(555);
        footballPlayer.setCountry("UK");
        footballPlayer.setLevel("Novice");
        footballPlayer.setName("Cool Name");
        footballPlayer.getOverallScore();
        !!!everything above is a class test!!!*/

        complist.setCompList();
        complist.setList();
        complist.prntList();
        footballPlayer.getFullDetails();
        //manager.outputFile();
    }
}
