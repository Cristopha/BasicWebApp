package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class QueryProcessor {

    public String process(String query) {
        query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
            return "Michel";
        } else if (query.contains("largest")) {
            int biggest = 0;
            Pattern integerPattern = Pattern.compile("-?\\d+");
            Matcher matcher = integerPattern.matcher(query);


            while (matcher.find()) {
                if (Integer.parseInt(matcher.group()) > biggest) {
                    biggest = Integer.parseInt(matcher.group());
                }
            }

            return Integer.toString(biggest);
        } else if (query.contains("plus")) {
            int add = 0;
            Pattern integerPattern = Pattern.compile("-?\\d+");
            Matcher matcher = integerPattern.matcher(query);

            while (matcher.find()) {
                    add += Integer.parseInt(matcher.group());
            }

            return Integer.toString(add);
        }
        return null;
    }
}
