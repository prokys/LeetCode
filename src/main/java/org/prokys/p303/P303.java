package org.prokys.p303;

import org.prokys.utils.NumArray;

import java.util.ArrayList;
import java.util.List;

public class P303 {

    public static Integer[] sumRanges(List<int[]> list){

        List<Integer> results = new ArrayList<>();

        results.add(null);

        for (int i = 1; i < list.size(); i++) {
            NumArray numArray = new NumArray(list.get(0));
            int [] range = list.get(i);
            results.add(numArray.sumRange(range[0], range[1]));
        }

        System.out.println(results);

        return results.toArray(new Integer[0]);
    }

}
