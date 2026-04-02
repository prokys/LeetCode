package org.prokys.p441;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.sqrt;

public class P441 {

    private static List<Integer> list = getList();

    private static List<Integer> getList() {

        List<Integer> tempList = new ArrayList<>();
        tempList.add(0);

        for (int i = 1; i <= 65535; i++) {
            tempList.add(i+ tempList.get(i-1));
        }
        return tempList;
    }


    public static int arrangeCoins(int n) {

        int temp = (int) sqrt(n);

        for (int i = temp; i < list.size(); i++) {
            if (list.get(i) == n) {
                return i;
            } else if (list.get(i) > n && list.get(i-1) < n) {
                return i-1;
            }
        }

        return 65535;
    }
}
