package designpatterns.structural.proxy;

import java.util.logging.Logger;

public class ExpensiveObjectImpl implements ExpensiveObject {
    private Logger logger = Logger.getLogger(ExpensiveObject.class.getName());

    public ExpensiveObjectImpl(){
        heavyInitialConfiguration();
    }

    @Override
    public void process() {
        logger.info("Processing complete.");
    }

    private void heavyInitialConfiguration(){
        logger.info("Loading initial configuration...");
    }
}
