package Generics.GenericsClassesAndIntefacesExample1;

import com.company.GenericsClassesAndInterfaces.Example1.AgeComparator;
import com.company.GenericsClassesAndInterfaces.Example1.AverageGradeComparator;
import com.company.GenericsClassesAndInterfaces.Example1.Reverse;
import com.company.GenericsClassesAndInterfaces.Example1.Students;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

public class Example1 {
    List<Students> students;
    @Before
    public void before(){
        Students studentObj = new Students();
        students = studentObj.getAllStudents();
    }
    @Test
    public void testAgeComparator(){
        Collections.sort(students,new AgeComparator());
        Assert.assertEquals(students.get(0).age,14);
    }
    @Test
    public void testReverseAgeComparator(){
        Collections.sort(students,new Reverse<>(new AgeComparator()));
        Assert.assertEquals(students.get(0).age,15);
    }
    @Test
    public void testAverageGradeComparator(){
        Collections.sort(students,new AverageGradeComparator());
        Assert.assertEquals(students.get(0).averageGrade,9);
    }
    @Test
    public void testReverseAverageGradeComparator(){
        Collections.sort(students,new Reverse<>(new AverageGradeComparator()));
        Assert.assertEquals(students.get(0).averageGrade,10);
    }
}
