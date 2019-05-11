package common.helpers;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.stream.Stream;

public class DataHelper {
    private static HashMap<String, String> testDataParameters = new HashMap<String, String>();
    private static String dataParameter;

    public static String getDataParameter(String key) {
        if (testDataParameters.size() == 0)
            readTestData("Parameters");

        dataParameter = testDataParameters.get(key);

        return dataParameter;
    }

    private static void readTestData(String type) {
        String dataFileName;
        String dataFilePath;

        ObjectMapper objectMapper =
                new ObjectMapper()
                        .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        dataFileName = Util.getProperty("DATA");
        dataFilePath = System.getProperty("user.dir") + Util.getProperty("path") + dataFileName;

        String JSONTemp = readLineByLine(dataFilePath);

        try {
            JSONTemp = objectMapper.readTree(JSONTemp).get("Parameters").toString();
            testDataParameters = objectMapper.readValue(JSONTemp,
                    new TypeReference<HashMap<String, String>>() {
                    });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String readLineByLine(String filePath) {
        StringBuilder contentBuilder = new StringBuilder();

        try (Stream<String> stream = Files.lines(Paths.get(filePath), StandardCharsets.UTF_8)) {
            stream.forEach(s -> contentBuilder.append(s).append("\n"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contentBuilder.toString();
    }
}
