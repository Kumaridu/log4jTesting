package com.axonactive.Log4jApply;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
 private static Logger logger=LogManager.getLogger(App.class);

    public static void main( String[] args )
    {
    	logger.info("Logger is configured correctly but with info");
    	logger.error("Logger is configured correctly but with info");
    	logger.warn("Logger is configured correctly but with info");
    	logger.fatal("Logger is configured correctly but with info");
    	logger.debug("Logger is configured correctly but with info");
        System.out.println( "Hello World!" );
    }
}
