import code.CompareNumber;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import test.GameProcess;
import test.Generator;
import test.NumberWherter;
import test.OneNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import static java.lang.Integer.*;
import static org.fest.assertions.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.timeout;
import static org.mockito.Mockito.verify;

/**
 * Created by yumingjie on 15-2-4.
 */
public class OneNumber{
    @Test
    public void test_one_number(){
        try{
            OneNumbers o = new OneNumbers();
            for (int i = 0; i < 3; i++) {
                System.out.println(o.sc(parseInt("9")));
            }
        }catch (Exception e){
            fail(e.getMessage());
        }
    }


    @Test
    public void test_is_4(){
        try{
            OneNumbers o = new OneNumbers();
            assertThat(o.sc(parseInt("4")).length()).isEqualTo(4);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void test3(){
        Impl();
    }

    private void Impl() {
        Random r = mock(Random.class);
        given(r.nextInt(10))
                .willReturn(1, 2, 3, 4)
                .willReturn(1, 2, 3, 4)
                .willReturn(2, 3, 4, 5)
                .willReturn(4, 5, 6, 7);
        System.out.println(r.nextInt(10));
        Generator g = new Generator(r);
        Set<String> set = new HashSet<String>();
        set.add(g.generate());
        set.add(g.generate());
        set.add(g.generate());

        //System.out.println(set.size());
    }

    @Test()
    public void show_print_welcome_first_when_game_start(){
        PrintStream printStream = mock(PrintStream.class);
        BufferedReader bufferedReader = mock(BufferedReader.class);
        CompareNumber compareNumber = new CompareNumber();
        NumberWherter numberWherter = new NumberWherter();
        GameProcess gameProcess = new GameProcess(printStream,bufferedReader,compareNumber,numberWherter);
        printStream.print("WelCome");
        printStream.print("Plase input your answer(6):");
        printStream.print("4A0B");
        printStream.print("Plase input your answer(5):");
        printStream.print("3A1B");
        printStream.print("Plase input your answer(4):");
        printStream.print("2A2B");
        printStream.print("Plase input your answer(3):");

        printStream.print("1A3B");
        printStream.print("Plase input your answer(2):");
        printStream.print("0A4B");
        printStream.print("Plase input your answer(1):");
        printStream.print("0A0B");
    }
}