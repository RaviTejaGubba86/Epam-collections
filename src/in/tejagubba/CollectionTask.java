package in.tejagubba;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CollectionTask {
    private static final Logger logger=Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    public static void main(String[] args) {
        MyList<Integer> integers = new MyList<Integer>();
        for(int i = 0;i<15;i++) integers.add(i);
        integers.remove(3);
        integers.remove(3);
        logger.log(Level.INFO,"Size of List :"+integers.size()+"");
        logger.log(Level.INFO,"Print List\n");
        logger.log(Level.INFO," List : \n");
        integers.display();
    }
}
