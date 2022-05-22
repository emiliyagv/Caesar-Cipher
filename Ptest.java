import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


    @RunWith(Parameterized.class)
public class Ptest
{
    @Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][] {     
                 { "hello", "khoor" }, { "class","fodvv"}, { "caesar", "fdhvdu" }, { "book", "errn" }, { "computer", "frpsxwhu" }  
           });
    }

        private String finp;
        private String fexp;

        public Ptest(String input, String expected) {
        this.finp = input;
        this.fexp = expected;
    }
     @Test
    public void test() {
        Caesar a = new Caesar(3);
        
        assertEquals(fexp, a.cipher(finp));
        assertEquals(finp, a.decipher(fexp));
    }

    }


