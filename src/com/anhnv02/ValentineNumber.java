package com.anhnv02;
import java.util.regex.*;

public class ValentineNumber {

    private String input;

    public ValentineNumber(String input) {
        this.input = input;
    }

    public boolean isValid() {
        String regEx = "(144|14|1)+";
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(input);

        return matcher.matches();
    }
}
