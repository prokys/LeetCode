package org.prokys.p232;

import org.prokys.utils.MyQueue;

import java.util.ArrayList;
import java.util.List;

public class P232 {

    public static String[] runCommands(String[] input, Integer[] parameters){

        List<String> results = new ArrayList<>();
        MyQueue myQueue = new MyQueue();

        for (int i = 0; i < input.length; i++) {
            switch (input[i]){
                case "MyQueue":{
                    myQueue = new MyQueue();
                    results.add(null);
                    break;
                }
                case "push":{
                    myQueue.push(parameters[i]);
                    results.add(null);
                    break;
                }
                case "peek":{
                    results.add(Integer.toString(myQueue.peek()));
                    break;
                }
                case "pop":{
                    results.add(Integer.toString(myQueue.pop()));
                    break;
                }
                case "empty":{
                    results.add(Boolean.toString(myQueue.empty()));
                    break;
                }
            }
        }
        return results.toArray(new String[0]);
    }
}
