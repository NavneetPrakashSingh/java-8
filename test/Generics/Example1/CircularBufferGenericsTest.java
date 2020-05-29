package Generics.Example1;

import com.company.Generics.Example1.WithGenerics.GenericsCircularBuffer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CircularBufferGenericsTest {
    GenericsCircularBuffer<String> buffer;
    @Before
    public void setup(){
        buffer = new GenericsCircularBuffer<>(2);
    }
    @Test
    public void addElementToCircularBuffer(){
        Assert.assertEquals(buffer.add("one"),true);
        Assert.assertEquals(buffer.add("two"),true);
        Assert.assertEquals(buffer.add("three"),false);
    }
    @Test
    public void removeElementFromCircularBuffer(){
        Assert.assertEquals(buffer.remove(),null);
    }
    @Test
    public void checkaddAndRemove(){
        Assert.assertEquals(buffer.add("one"),true);
        Assert.assertEquals(buffer.add("two"),true);
        Assert.assertEquals(buffer.add("three"),false);
        Assert.assertEquals(buffer.remove(),"one");
        Assert.assertEquals(buffer.remove(),"two");
        Assert.assertEquals(buffer.remove(),null);
    }
}
