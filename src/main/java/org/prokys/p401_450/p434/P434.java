package org.prokys.p401_450.p434;

public class P434 {

    public static int countSegments(String s) {

        String[] array = (s.split("\\s"));
        int result = 0;

        for (int i = 0; i < array.length; i++) {
            if (!array[i].equals("")) {
                result++;
            }
        }

        return result;
    }
}
