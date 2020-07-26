package in.tejagubba;

import java.util.AbstractList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Arrays;

public class MyList<E> extends AbstractList<E> {
    private static final Logger logger=Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    private static final int INITIAL_CAPACITY = 10;
    private int actSize = 0;
    private Object eleInfo[];
    private int i=0;

    public MyList() {
        eleInfo =new Object[INITIAL_CAPACITY];
        i=0;
    }

    @Override
    public E get(int index) {
        E x =(E) eleInfo[index];
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    public boolean add(E e) {
        eleInfo[i]=e;
        i++;
        if(i >= actSize)
            increaseListSize();

        return true;
    }

    public E remove(int index) {
        int j;
        Object x= eleInfo[index];
        for(j=index;j<actSize-1;j++)
            eleInfo[j]= eleInfo[j+1];
        i--;
        actSize--;
        return (E)x;
    }

    private void increaseListSize() {
        actSize = eleInfo.length * 2;
        eleInfo = Arrays.copyOf(eleInfo, actSize);
    }

    public void display() {
        String s="";
        for (int i = 0; i < this.i; i++)
            s = s + eleInfo[i] + " ";
        logger.log(Level.INFO,s+"\n");
    }

}
