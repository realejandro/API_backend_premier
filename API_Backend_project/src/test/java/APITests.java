import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nurkulov 12/26/19
 */
public class APITests {

    @Test
    public void getTeamUEFAPosition() {
        String team = APITasks.getTeamStanding();
        Assert.assertEquals(TestConstants.getTeam(), team);
    }

    @Test
    public void getLowestScorer() throws IOException, URISyntaxException {
        String actualSecondHighestScorer = APITasks.getLowestScorer();
        Assert.assertEquals(TestConstants.getExpectedLowestScorer(), actualSecondHighestScorer);
    }

    @Test
    public void getDefendersTest() throws IOException, URISyntaxException {
        List<String> acturalDefenders = APITasks.getDefenders();
        Assert.assertEquals("Failed to verify number of defenders", TestConstants.getActualDefenders().length, acturalDefenders.size());
        Assert.assertEquals("Invalid defenders list from England", Arrays.asList(TestConstants.getActualDefenders()), acturalDefenders);
    }

    @Test
    public void getMidfieldersTest() throws IOException, URISyntaxException {
        List<String> actualMidfielders = APITasks.getMidfielders();
        Assert.assertEquals("Failed to verify number of midfielders", TestConstants.getExpectedMidfielders().length, actualMidfielders.size());
        Assert.assertEquals("Invalid midfielders list from England", Arrays.asList(TestConstants.getExpectedMidfielders()), actualMidfielders);
    }

    @Test
    public void getAttackerFromEnglandTest() throws IOException, URISyntaxException {
        List<String> actualAttackerFromEngland = APITasks.getAttackerFromEngland();
        Assert.assertEquals("Failed to verify number of attackers", TestConstants.getExpectedAttackers().length, actualAttackerFromEngland.size());
        Assert.assertEquals("Failed to verify list of attackers from England team", Arrays.asList(TestConstants.getExpectedAttackers()), actualAttackerFromEngland);
    }

    @Test
    public void getMidfielderFromBrazil() throws IOException, URISyntaxException {
        String actualMidfielderFromBrazil = APITasks.getMidfielderFromBrazil();
        Assert.assertEquals("Invalid name of player from Brazil on a midfield position", TestConstants.getExpectedMidfielderFromBrazil(), actualMidfielderFromBrazil);
    }

    @Test
    public void getAllTeamsTest() throws IOException, URISyntaxException {
        List<String> actualTeams = APITasks.getAllTeams();
        Assert.assertEquals(TestConstants.getExpectedTeams().length, actualTeams.size());
        Assert.assertEquals(Arrays.asList(TestConstants.getExpectedTeams()), actualTeams);
    }

    @Test
    public void getAllCompetitionsTest() throws IOException, URISyntaxException {
        List<String> actualCompetitionsList = APITasks.getAllCompetitions();
        Collections.sort(actualCompetitionsList);
        Collections.sort(TestConstants.getExpectedCompetitionsList());
        Assert.assertEquals(TestConstants.getExpectedCompetitionsList().size(), actualCompetitionsList.size());
        Assert.assertEquals(TestConstants.getExpectedCompetitionsList(), actualCompetitionsList);
    }

}
