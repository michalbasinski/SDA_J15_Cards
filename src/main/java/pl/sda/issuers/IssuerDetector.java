package pl.sda.issuers;

import java.util.List;

public class IssuerDetector {

    public String detect(String cardNo) {
        String filePath = this.getClass().getClassLoader()
                .getResource("issuers.csv").getPath();

        RuleBaseCreator creator = new RuleBaseCreator(filePath);
        List<Rule> rules = creator.create();

        String result = "UNKNOWN";

        for (Rule rule : rules) {
            if (cardNo.startsWith(rule.getPrefix())
                    && cardNo.length() == rule.getLength()) {
                result = rule.getName();
            }
        }

        return result;
    }

}
