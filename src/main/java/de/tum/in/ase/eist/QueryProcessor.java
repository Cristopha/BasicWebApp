package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

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
            String[] words = query.split(" ");
            for (int i = 0; i < words.length; i++) {
                if (Integer.parseInt(words[i]) > biggest) {
                    biggest = Integer.parseInt(words[i]);
                }
            }
            return Integer.toString(biggest);
        } else if (query.contains("plus")) {

        }
        return null;
    }
}
