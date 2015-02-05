import org.junit.Test;
import test.GameProcess;
import test.Generator;
import test.OneNumbers;

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
        Generator g = new Generator(r);
        Set<String> set = new HashSet<String>();
        set.add(g.generate());
        set.add(g.generate());
        set.add(g.generate());

        //System.out.println(set.size());
    }

    @Test
    public void show_print_welcome_first_when_game_start(){
        //PrintStream printStream = mock(PrintStream.class);
        OutputStream outputStream = mock(OutputStream.class);
        //new GameProcess();
        try {
            verify(outputStream).flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}