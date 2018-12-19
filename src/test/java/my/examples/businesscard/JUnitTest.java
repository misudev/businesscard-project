package my.examples.businesscard;

import org.junit.Before;
import org.junit.Test;

public class JUnitTest {
    @Before
    public void init() throws Exception{
        System.out.println("init");
    }
    @Test
    public void test1() throws Exception{
        System.out.println("test1");
    }
    @Test
    public void test2() throws Exception{
        System.out.println("test2");
    }
}
