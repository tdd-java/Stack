import org.junit.Test;

import java.util.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class StackTest {

    @Test
    public void shouldBeAbleToPushElementToStack() throws InvalidStackSizeException, StackOverflowException {
        Stack stack = new Stack(10);
        stack.push(12);
        assertThat(stack.size(), is(1));
    }


    @Test(expected = InvalidStackSizeException.class)
    public void shouldThrowExceptionWhenSizeIsPassedAsZero() throws InvalidStackSizeException {
        new Stack(0);

    }

    @Test(expected = InvalidStackSizeException.class)
    public void shouldThrowExceptionWhenSizeIsPassedAsNegative() throws InvalidStackSizeException {
        new Stack(-10);
    }

    @Test(expected = StackOverflowException.class)
    public void shouldThrowStackFullExceptionWhenAnAttemptMadeToPushWhenCapacityIsFull() throws InvalidStackSizeException, StackOverflowException {
        Stack stack = new Stack(2);
        stack.push(10);
        stack.push(20);
        stack.push(30);
    }

    @Test(expected = StackEmptyException.class)
    public void shouldBeAbleToPopElementFromStack() throws InvalidStackSizeException, StackOverflowException, StackEmptyException {
        Stack stack = new Stack(2);
        stack.push(10);
        stack.push(20);
        assertThat(stack.pop(), is(20));
        assertThat(stack.pop(), is(10));
        assertThat(stack.pop(), is(10));

    }
}
