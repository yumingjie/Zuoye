package test;

import java.util.Map;
import java.util.Random;

/**
 * Created by yumingjie on 15-2-4.
 */
public class Generator {
    private Random r;
    public Generator(Random r){
        this.r = r;
    }

    public String generate(){
        return String.valueOf(Math.random() * 9);
    }
}
