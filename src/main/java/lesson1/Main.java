package lesson1;

import java.util.*;

public class Main {


    public static void main(String[] args) throws IllegalAccessException, InstantiationException, JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper;
        HashMap<String, Object> object = new HashMap<>();
        object.put("squadName","Super hero squad");
        object.put("homeTown", "Metro City");
        object.put("formed", 2016);
        object.put("secretBase", "Super tower");
        object.put("active", true);
        List<Map<String, Object>> members = new ArrayList<>();
        HashMap<String, Object> member1 = new HashMap<>();
        member1.put("name", "Molecule Man");


    }
}

