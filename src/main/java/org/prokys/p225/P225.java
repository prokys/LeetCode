package org.prokys.p225;

import org.prokys.utils.MyStack;

import java.util.ArrayList;
import java.util.List;


public class P225 {

    public static String[] runCommands(String[] input, Integer[] parameters){

        List<String> results = new ArrayList<>();
        MyStack myStack = new MyStack();

        for (int i = 0; i < input.length; i++) {
            switch (input[i]){
                case "MyStack":{
                    myStack = new MyStack();
                    results.add(null);
                    break;
                }
                case "push":{
                    myStack.push(parameters[i]);
                    results.add(null);
                    break;
                }
                case "top":{
                    results.add(Integer.toString(myStack.top()));
                    break;
                }
                case "pop":{
                    results.add(Integer.toString(myStack.pop()));
                    break;
                }
                case "empty":{
                    results.add(Boolean.toString(myStack.empty()));
                    break;
                }
            }
        }
        return results.toArray(new String[0]);
    }
}
