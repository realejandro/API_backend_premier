import Pojo.AllTeams;
import Pojo.Team;
import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;
import io.restassured.response.Response;
import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import static io.restassured.RestAssured.*;


/**
 * Created by nurkulov 12/26/19
 */
public class APITasks {
@Test
public void testAllTeams(){
    getAllTeams();
}
    /*
     * GET all soccer team names listed in given resource
     * Deserialization type: POJO
     */

    public static List<String> getAllTeams() {
        Response response = given().header("X-Auth-Token", "5b9ab7f78862490cacb6141c7eed96e9")
            .get("http://api.football-data.org/v2/teams/")
            .then().statusCode(200).extract().response();

        AllTeams allTeams = response.as(AllTeams.class); //deserialiation
        List<String> teamNames = new ArrayList<>();
        List<Team> teams = allTeams.getTeams();
        for (Team team: teams){
            System.out.println(teamNames.add(team.getName()));
        }
        return teamNames;
    }

    /*
     * GET name of all midfielders from Serie A competition whose country is Brazil
     * note: endpoint `competitions/SA/scorers`
     * Deserialization type: TypeReference
     */
    // First we need to get scorers key from the response
    // Which returns list of Map Objects
    // Inside the map objects we have nationality and position keys
    // We are looking for a condition that position is midfielder and nationality is brazil
    public static String getMidfielderFromBrazil() {

        return null;
    }

    /*
     * GET list of all competitions
     * Deserialization type: TypeReference
     */
    public static List<String> getAllCompetitions() {
       return null;

    }

    /*
     * GET names of all midfielders from England team
     * note: England team id is 66
     * Deserialization type: Pojo
     */
    public static List<String> getMidfielders() throws IOException, URISyntaxException {
        return null;
    }

    /*
     * GET names of all defenders from England team
     * note: England team id is 66
     * Deserialization type: TypeReference
     */
    public static List<String> getDefenders() throws URISyntaxException, IOException {

        return null;
    }

    /*
     * GET names of all attackers from England team whose origin country is England
     * note: England team id is 66
     * Deserialization type: Pojo
     */
    public static List<String> getAttackerFromEngland() throws URISyntaxException, IOException {

        return null;
    }

    /*
     * GET names of a team with number 1 stading for UEFA 2021
     * note: endpoint for competitions: `competitions/<year>/
     * note: endpoint for scorers: `competitions/<year>/standings`
     * Deserialization type: POJO
     */
    public static String getTeamStanding() {
        return null;
    }

    /*
     * GET names of second highest scorrer from competitions of 2000 season
     * note: endpoint for competitions: `competitions/SA/scorers
     * note: endpoint for scorers: `competitions/SA/scorers`
     * Deserialization type: TypeReference and POJO
     */
    public static String getLowestScorer() {
        return null;
    }
}
