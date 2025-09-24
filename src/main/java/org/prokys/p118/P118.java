package org.prokys.p118;

import java.util.ArrayList;
import java.util.List;

public class P118 {

    public static void main(String[] args) {
        System.out.println(generate(4));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> startList = new ArrayList<>();
            startList.add(1);
            list.add(startList);
         if (numRows > 1){
            for (int i = 1; i < numRows; i++){
                List<Integer> tempList = new ArrayList<>();
                tempList.add(1);
                    for (int j = 1; j < i; j++) {
                        tempList.add(list.get(i-1).get(j) + list.get(i-1).get(j-1));
                }
                tempList.add(1);
                list.add(tempList);
            }
        }
        return list;
    }
}
