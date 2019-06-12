package jacksonDeserialisation;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class RatesDeserialiser {

    public RatesDTO ratesMapped;

    public RatesDeserialiser(String fileName){
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            ratesMapped = objectMapper.readValue(new File(fileName), RatesDTO.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
