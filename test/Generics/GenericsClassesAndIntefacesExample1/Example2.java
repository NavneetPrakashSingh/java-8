package Generics.GenericsClassesAndIntefacesExample1;

import com.company.GenericsClassesAndInterfaces.Example2.BubbleSort;
import com.company.GenericsClassesAndInterfaces.Example2.InsertionSort;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Example2 {
    BubbleSort bubble;
    InsertionSort insertion;
    @Before
    public void setup(){
        bubble = new BubbleSort();
        insertion = new InsertionSort();
    }

    @Test
    public void testBubbleSort(){
        int[] input = {2,1,3};
        input = bubble.sort(input);
        Assert.assertEquals(input[0],1);
    }

    @Test
    public void testInsertionSort(){
        int[] input={2,1,3};
        input = insertion.sort(input);
        Assert.assertEquals(input[0],1);
    }
}
