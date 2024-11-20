package org.prokys.p13;

import java.util.Map;

public class P13 {

    public static void main(String[] args) {


        String string = "MCMXCIV";

        System.out.println(romanToInt(string));
    }

        public static int romanToInt(String s) {
            Map<Character, Integer> values = Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);

            int number = 0;
            for (int i = 0; i < s.length(); i++) {
                char character = s.charAt(i);
                char nextCharacter;
                if (i == s.length()-1){
                    nextCharacter = ' ';
                }else{
                    nextCharacter = s.charAt(i + 1);
                }

                switch (character) {
                    case 'I': {
                        if (nextCharacter == 'V' || nextCharacter == 'X') {
                            number = number - values.get(s.charAt(i));
                        } else {
                            number = number + values.get(s.charAt(i));
                        }
                        break;
                    }
                    case 'X': {
                        if (nextCharacter == 'L' || nextCharacter == 'C') {
                            number = number - values.get(s.charAt(i));
                        } else {
                            number = number + values.get(s.charAt(i));
                        }
                        break;
                    }
                    case 'C': {
                        if (nextCharacter == 'D' || nextCharacter == 'M') {
                            number = number - values.get(s.charAt(i));
                        } else {
                            number = number + values.get(s.charAt(i));
                        }
                        break;
                    }
                    default:
                        number = number + values.get(s.charAt(i));
                }
            }
            return number;
        }
}
