package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Roman {
    public String romanSol(String... input){
        int result = 0;
        char sign = input[1].charAt(0);

        Byz firstb = Byz.valueOf(input[0].toUpperCase());
        Byz secondb = Byz.valueOf(input[2].toUpperCase());
        int firsti = firstb.getTranslation();
        int secondi = secondb.getTranslation();

        switch (sign){
            case '+':
                result = firsti + secondi;
                break;
            case '-':
                result = firsti - secondi;
                break;
            case '/':
                result = firsti / secondi;
                break;
            case '*':
                result = firsti * secondi;
                break;
        }

        List<String> resbuffer = new ArrayList<>();

        if (result == 100){
            resbuffer.add("C");
            result -= 100;
        }
        while (result >= 90){
            resbuffer.add("XC");
            result -= 90;
        }
        while (result >= 50){
            resbuffer.add("L");
            result -= 50;
        }
        while (result >= 40){
            resbuffer.add("XL");
            result -= 40;
        }
        while (result >= 10){
            resbuffer.add("X");
            result -= 10;
        }
        while (result >= 9){
            resbuffer.add("IX");
            result -= 9;
        }
        while (result >= 5){
            resbuffer.add("V");
            result -= 5;
        }
        while (result >= 4){
            resbuffer.add("IV");
            result -= 4;
        }
        while (result >= 1){
            resbuffer.add("I");
            result -= 1;
        }

        return String.join("", resbuffer);
    }
}
