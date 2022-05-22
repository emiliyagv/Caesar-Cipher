import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.CoreMatchers.*;

public class Htest{
     @Test 
  public void testEquals() { 
     Caesar a = new Caesar(4);
    String s = "computer";
    String changed = a.cipher(s);
    assertThat("gsqtyxiv", equalTo(a.cipher(s))); 
   assertThat("computer", equalTo(a.decipher(changed))); 
 Caesar b = new Caesar(2);
    String changed1 = b.cipher(s);
assertThat("eqorwvgt", equalTo(b.cipher(s))); 
   assertThat("computer", equalTo(b.decipher(changed1)));

Caesar c = new Caesar(5);
    String changed2 = c.cipher(s);
   assertThat("htruzyjw", equalTo(c.cipher(s))); 
   assertThat("computer", equalTo(c.decipher(changed2)));

  } 

    @Test(expected = IllegalArgumentException.class)
  public void checkthrows() {
       Caesar b = new Caesar(26);
  } 
}

