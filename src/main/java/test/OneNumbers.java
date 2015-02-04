package test;

import java.awt.*;
import java.util.*;

/**
 * Created by yumingjie on 15-2-4.
 */
public class OneNumbers {

    private java.util.List<String> strings = new ArrayList<String>();

    public String sc(int num_count) {
        String numStr = "";
        for(int i = 0 ; i < num_count ; i++){
            int num = (int)(Math.random()*9);
            if(!numStr.contains(String.valueOf(num))) {
                numStr = numStr.concat(String.valueOf(num));
            }else{
                i--;
            }
        }
        if(strings.size()>=3){
            strings.clear();
        }
        if(strings.contains(numStr)){
            return sc(num_count);
        }
        strings.add(numStr);
        return numStr;
    }


    public String test_one_number(int i) {
        return "1";
    }
}
