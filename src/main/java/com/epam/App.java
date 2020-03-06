package com.epam;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class App {
    private static final Logger logger=LogManager.getLogger(App.class.getName());
    public static  void main(String args[])
    {
        MyCustomClass<Integer> l1=new MyCustomClass<>();
        logger.info("My Custom Class");
        for(int i=10;i<30;i++)
            l1.add(i);
        logger.info("Size of my List :"+l1.size()+"");
        l1.display();
        l1.remove(2);
        logger.info("Size of my List :"+l1.size()+"");
        l1.display();

    }
}
