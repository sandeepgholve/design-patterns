package test;

import java.util.regex.*;

public class Test1 {
    public static void main(String[] args) {
        String title = "Sandeep Gholve is a good Man. Sandeep work with ProfitBricks and Sagar is his bother";

        Pattern pattern = Pattern.compile("Sandeep|Sagar");
        Matcher matcher = pattern.matcher(title);

        StringBuffer buffer = new StringBuffer();
        while (matcher.find()) {
            switch (matcher.group()) {
                case "Sandeep":
                    matcher.appendReplacement(buffer, "Sandy");
                    break;

                case "Sagar":
                    matcher.appendReplacement(buffer, "Milind");
                    break;

                default:
                    // Error: Do Nothing
                    break;
            }
        }
        matcher.appendTail(buffer);

        System.out.println(title);
        System.out.println(buffer);
    }
}
