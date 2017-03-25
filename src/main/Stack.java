import java.util.ArrayList;

public class Stack {

    private static int CAPACITY = 0;
    private final ArrayList<Integer> array;

    public Stack(int size) throws InvalidStackSizeException {
        if(size <=0)
            throw new InvalidStackSizeException();
        this.CAPACITY = size;
        this.array = new ArrayList<Integer>(size);
    }

    public void push(int element) throws StackOverflowException {
        if (isFull() ){
            throw new StackOverflowException();
        }
        this.array.add(element);
    }

    public int size()  {
        return this.array.remove(array.size());
    }

    public boolean isFull() {
        return array.size() == CAPACITY;
    }

    public Integer pop() throws StackEmptyException {
        if(isEmpty())
            throw new StackEmptyException();
        return array.remove(array.size()-1);
    }

    public boolean isEmpty() {
        return array.size() == 0;
    }
}
