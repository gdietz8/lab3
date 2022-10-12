import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test 
	public void testReverseInPlace2() {
    int[] input1 = { 3, 4 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 4, 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }
  
  @Test
  public void testReversed2() {
    int[] input1 = {4,5};
    assertArrayEquals(new int[]{5,4}, ArrayExamples.reversed(input1));
  }

  /* 
  @Test
  public void testAverageWithoutLowest() {
    double[] input1 = {0.0};
    double expected = 0.0;
    assertArrayEquals(expected, ArrayExamples.averageWithoutLowest(input1));
  }


  private void assertArrayEquals(double expected, double averageWithoutLowest) {
  }*/

}
