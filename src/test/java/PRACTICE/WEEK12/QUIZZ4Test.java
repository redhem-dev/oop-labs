package PRACTICE.WEEK12;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class QUIZZ4Test {

    @Test
    public void configSaverTest() throws IOException {

        String filename = "data.txt";

        Settings settings = new Settings();
        settings.setUsername("user123");
        settings.setPassword("pass456");

        ConfigSaver.saveConfigurableFields("data.txt", settings);
        settings.setTimeout(30);

        BufferedReader br = new BufferedReader(new FileReader(filename));
        br.close();

        List<String> lines = br.lines().collect(Collectors.toList());

        assertEquals(2, lines.size());
        br.close();
    }
}