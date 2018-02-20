package externalDictionary;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static coreFunctions.GlobalDefinitions.FILE_NAME;

public class DictionaryReader {
    public static List fileReader() {
        List<String> items = new ArrayList<>();
        try {
            Stream<String> stream = Files.lines(Paths.get(FILE_NAME), StandardCharsets.UTF_8);
            items = stream.collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return items;
    }

    public static int dictionarySize() {

        return (DictionaryReader.fileReader().size()/2);
    }
}