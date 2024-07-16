package Pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter

public class Team {
    private int id;
    private Map<String,Object> area;
    private String name;
    private String shortName;
    private String tla;
    private String crestUrl;
    private String address;
    private String phone;
    private String website;
    private String email;
    private int founded;
    private String clubColors;
    private String venue;
    private String lastUpdated;

}
