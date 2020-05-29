package Generics.Example1;

import com.company.Generics.Example1.WithoutGenerics.CircularBuffer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CircularBufferTest {

    CircularBuffer buffer;
    @Before
    public void setup() {
        buffer = new CircularBuffer(2);
    }

    @Test
    public void addElementToCircularBuffer() {
        Assert.assertEquals(buffer.add(1),true);
        Assert.assertEquals(buffer.add(3),true);
        Assert.assertEquals(buffer.add(4),false);
    }

    @Test
    public void removeElementsFromCircularBuffer(){
        buffer.add(2);
        Assert.assertEquals(buffer.remove(),2);
    }

    @Test
    public void removeEmptyCircularBuffer(){
        Assert.assertEquals(buffer.remove(),null);
    }

    @Test
    public void addElementsAndThenRemove(){
        buffer = new CircularBuffer(2);
        Assert.assertEquals(buffer.add(1),true);
        Assert.assertEquals(buffer.add(3),true);
        Assert.assertEquals(buffer.add(2),false);
        Assert.assertEquals(buffer.remove(),1);
        Assert.assertEquals(buffer.remove(),3);
    }

    @Test
    public void checkSizeMethod(){
        buffer = new CircularBuffer(2);
        Assert.assertEquals(buffer.size(),2);
    }

    @Test
    public void checkIfCircularBufferWorksForStringValues(){
        buffer = new CircularBuffer(2);
        Assert.assertEquals(buffer.add("String"),true);
    }
}
