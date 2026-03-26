package org.prokys.p401;

import java.util.ArrayList;
import java.util.List;

public class P401 {

    public static List<String> readBinaryWatch(int turnedOn) {

        List<String> result = new ArrayList<>();

        List<List<Integer>> combinationsMinutes = new ArrayList<>();
        for (int j = 0; j <= turnedOn; j++) {
            List<Integer> minutes = new ArrayList<>();
            for (int i = 0; i < 60; i++) {

                int bitCount = Integer.bitCount(i);
                if (bitCount == turnedOn -j){
                    minutes.add(i);
                }

            }
            combinationsMinutes.add(minutes);
        }

        List<List<Integer>> combinationsHours = new ArrayList<>();
        for (int j = 0; j <= turnedOn; j++) {
            List<Integer> hours = new ArrayList<>();
            for (int i = 0; i < 12; i++) {

                int bitCount = Integer.bitCount(i);
                if (bitCount == turnedOn -j){
                    hours.add(i);
                }

            }
            combinationsHours.add(hours);
        }

        for (int i = 0; i < combinationsHours.size(); i++) {
            for (int j = 0; j < combinationsMinutes.size(); j++) {
                if (i+j == turnedOn) {
                    List<Integer> minutes = combinationsMinutes.get(j);
                    List<Integer> hours = combinationsHours.get(i);

                    for (int k = 0; k < hours.size(); k++) {
                        for (int l = 0; l < minutes.size(); l++) {
                            int minute = minutes.get(l);

                            if (minute < 10){
                                result.add(hours.get(k) + ":0" + minute);
                            }else  {
                                result.add(hours.get(k) + ":" + minute);
                            }


                        }
                    }
                }
            }
        }

        return result;
    }
}
