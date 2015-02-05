package test;

import code.CompareNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Created by yumingjie on 15-2-5.
 */
public class GameProcess {
    private PrintStream out;
    private BufferedReader reader;
    private CompareNumber compareNumber;
    private NumberWherter numberWHere;

    public GameProcess(PrintStream out,BufferedReader reader,CompareNumber compareNumber,NumberWherter numberWHere){
        this.out = out;
        this.reader = reader;
        this.compareNumber = compareNumber;
        this.numberWHere = numberWHere;
    }

    public void start() throws IOException {
        out.print("Welcome!");
        out.print("Please input your answer(6)");
        String input = numberWHere.getWhert();
        String anser = reader.readLine();
    }
}
