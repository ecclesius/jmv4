package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputCheck {

    public Matcher checkStringToArab(String input) {
        Pattern p = Pattern.compile("^\\s*(10|[(9)(8)(7)(6)(5)(4)(3)(2)(1)])\\s*([\\*\\+\\-\\/])\\s*(10|[(9)(8)(7)(6)(5)(4)(3)(2)(1)])\\s*$");
        return p.matcher(input);
    }

    public Matcher checkStringToRoman(String input){
        Pattern p = Pattern.compile("^\\s*(X|IX|VIII|VII|VI|V|IV|III|II|I)\\s*([\\*\\+\\-\\/])\\s*(X|IX|VIII|VII|VI|V|IV|III|II|I)\\s*$");
        return p.matcher(input);
    }
}
