package org.prokys.p119;

import java.util.ArrayList;
import java.util.List;

public class P119 {

    public static void main(String[] args) {
        System.out.println(getRow(0));
        System.out.println(getRow(1));
        System.out.println(getRow(2));
        System.out.println(getRow(3));
        System.out.println(getRow(4));

    }
    public static List<Integer> getRow(int rowIndex) {

        List<Integer> startList = new ArrayList<>();
        startList.add(1);

        if (rowIndex > 0){
            for (int i = 0; i < rowIndex; i++){
                List<Integer> tempList = new ArrayList<>();
                tempList.add(1);
                for (int j = 1; j < i+1; j++) {
                    tempList.add(startList.get(j) + startList.get(j-1));
                }
                tempList.add(1);
                startList = tempList;
            }
        }
        return startList;
    }

}
