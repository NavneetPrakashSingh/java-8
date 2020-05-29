package Generics.Example2;

import com.company.Generics.Example2.WithGenerics.GenericsStack;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StackWithGenerics {
    GenericsStack<String> stack;

    @Before
    public void setup() {
        stack = new GenericsStack<>(2);
    }

    @Test
    public void addElementsToStack() {
        Assert.assertEquals(stack.push("one"), true);
        Assert.assertEquals(stack.push("one"), true);
        Assert.assertEquals(stack.push("one"), false);
    }

    @Test
    public void removeElementsFromStack() {
        Assert.assertEquals(stack.push("one"), true);
        Assert.assertEquals(stack.pop(), "one");
        Assert.assertEquals(stack.pop(), null);
    }
}
