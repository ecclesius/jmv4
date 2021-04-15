package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;

public class Main {

    public static void main(String[] args) throws Exception {

        String result = "";
        Arab arabSol = new Arab();
        Roman romanSol = new Roman();
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        InputCheck InputCheck = new InputCheck();
        Matcher matches = InputCheck.checkStringToArab(input);
        if (!matches.matches()) {
            matches = InputCheck.checkStringToRoman(input.toUpperCase());
            if (!matches.matches()){
                throw new Exception("Ошибка ввода. Недопустимые символы, используйте операторы (+ - / *), арабские числа (1-10) или римские (I-X)");
            }
            else{
                result = romanSol.romanSol(matches.group(1),matches.group(2),matches.group(3));
            }
        }
        else{
            result = arabSol.arabianSol(matches.group(1),matches.group(2),matches.group(3));
        }

        System.out.println(result);
    }
}
