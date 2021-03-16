import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class JSONTester {

    public static void main(String[] args) throws IOException {

        Reader reader = new BufferedReader(new FileReader("src/main/java/data.json"));

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode parser = objectMapper.readTree(reader);

        for(JsonNode pm: parser.path("students")){

            Student s = new Student(); // asta cred ca doar ar rezerva spatiu.. cam atat
            Address address = new Address();

            s.setId(pm.path("id").asInt());
            s.setName(pm.path("name").asText());
            s.setUni(pm.path("uni").asText());

            JsonNode a = pm.path("address");
            address.setStreet(a.path("street").asText());
            address.setCity(a.path("city").asText());
            s.setAddress(address);

//            System.out.println("aici!! : " + s.getAddress());
            System.out.println(s);

        }

    }

}
