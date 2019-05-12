package pl.sda.issuers;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class RuleBaseCreator {

    private String dbPath;

    RuleBaseCreator(String dbPath) {
        this.dbPath = dbPath;
    }

    List<Rule> create() {
        List<Rule> result = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(dbPath))) {
            String line = bufferedReader.readLine();

            String[] headers = line.split(";");

            while ((line = bufferedReader.readLine()) != null) {
                String[] values = line.split(";");
                //Rule rule = createRule();

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }

    private Rule createRule(String[] headers, String[] values) {
        Rule rule = new Rule();
        for (int i = 0; i < headers.length; i++) {
            if ("name".equalsIgnoreCase(headers[i])) {
                rule.setName(values[i]);
            }
            if ("prefix".equalsIgnoreCase(headers[i])) {
                rule.setPrefix(values[i]);
            }
            if ("length".equalsIgnoreCase(headers[i])) {
                rule.setLength(Integer.parseInt(values[i]));
            }
        }
        return rule;
    }
}
