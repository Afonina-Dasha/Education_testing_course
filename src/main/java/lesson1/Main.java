package lesson1;

import java.util.*;

public class Main {


    public static void main(String[] args) throws IllegalAccessException, InstantiationException /*JsonProcessingException*/ {
        /*ObjectMapper objectMapper = new ObjectMapper;*/

        HashMap<String, Object> object = new HashMap<>();
        object.put("squadName","Super hero squad");
        object.put("homeTown", "Metro City");
        object.put("formed", 2016);
        object.put("secretBase", "Super tower");
        object.put("active", true);
        List<Map<String, Object>> members = new ArrayList<>();

        members.add(Map.of(
                "name", "Molecule Man",
                "age", 29 ,
                "secretIdentity", "Dan Jukes",
                "powers", new String[]{"Radiation resistance", "Turning tiny", "Radiation blast"}
                )
        );
        object.put("members", members);

        HashMap<String, Object> object1 = new HashMap<>();
        object1.put("name", "Madame Uppercut");
        object1.put("age", 39);
        object1.put("secretIdentity", "Jane Wilson");
        object1.put("powers", new String[]{"Million tonne punch", "Damage resistance", "Superhuman reflexes"});

        HashMap<String, Object> object2 = new HashMap<>();
        object2.put("name", "Eternal Flame");
        object2.put("age", 1000000);
        object2.put("secretIdentity", "Unknown");
        object2.put("powers", new String[]{"Immortality", "Heat Immunity", "Inferno","Teleportation", "Interdimensional travel"});

        /*objectMapper.writeValueAsString(object);*/
    }
}

