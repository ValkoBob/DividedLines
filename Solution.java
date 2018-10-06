package FaiFly;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
    private String REGEX = "(\\s+)?((\\d+)|(\\w+))(\\s+)((\\d+)|(\\w+))(\\s+)" +
            "((\\d+)|(\\w+))(\\s+)((\\d+)|(\\w+))(\\s+)?";

    ArrayList lineDivision(String input) {
        ArrayList<String> array = new ArrayList<>();
        Pattern p = Pattern.compile(REGEX);
        Matcher m = p.matcher(input);
        int end = 0;
        while(m.find()){
            array.add(input.substring(m.start(), m.end()));
            end = m.end();
        }
        if(end + 1 != input.length()){
            array.add(input.substring(end));
        }
        return array;
    }
}
