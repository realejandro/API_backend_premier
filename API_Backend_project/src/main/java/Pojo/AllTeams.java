package Pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;
@Getter
@Setter
public class AllTeams {
    private int count;
    private Map<String,Object> filters;
    private List<Team> teams;
}
