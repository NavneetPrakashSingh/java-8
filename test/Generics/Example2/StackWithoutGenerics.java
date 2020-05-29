package Generics.Example2;

import com.company.Generics.Example2.WithoutGenerics.Stack;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StackWithoutGenerics {
    Stack stack;
    @Before
    public void setup(){
        stack = new Stack(2);
    }
    @Test
    public void addElementsToStack(){
        Assert.assertEquals(stack.push(2),true);
        Assert.assertEquals(stack.push(3),true);
        Assert.assertEquals(stack.push(4),false);
    }

    @Test
    public void removeElementsFromStack(){
        stack.push(1);
        Assert.assertEquals(stack.poll(),1);
        Assert.assertEquals(stack.poll(),null);
    }
}
