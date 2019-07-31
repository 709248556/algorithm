package test;

import java.util.logging.Logger;

/**
 * @author yanlianglong
 * @Title: Children.java
 * @Package test
 * @Description:
 * @date 2019/7/31 18:24
 */
public class Children extends Partner {
    Logger logger = Logger.getLogger("children");
    public Children(){
        logger.info("children");
    }
}
