package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Arab {
    public String arabianSol(String... input){

        int result = 0;

        int first = Integer.parseInt(input[0]);
        char sign = input[1].charAt(0);
        int second = Integer.parseInt(input[2]);

        switch (sign){
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case '/':
                result = first / second;
                break;
            case '*':
                result = first * second;
                break;
        }

        String res = Integer.toString(result);
        return res;
    }
}
