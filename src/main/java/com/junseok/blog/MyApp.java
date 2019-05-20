package com.junseok.blog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.junseok.logging.OtherLogging;

public class MyApp {
	
//	private static final Logger logger = LogManager.getLogger();
	private static final Logger logger = LoggerFactory.getLogger(MyApp.class);
	
	private static MyAppSubOne subOne = new MyAppSubOne();
	private static MyAppSubTwo subTwo = new MyAppSubTwo();
	private static OtherLogging otherLogging = new OtherLogging();
	
	
	public static void main(String[] args) {

        logger.trace("MyApp TRACE log");
        logger.debug("MyApp DEBUG log");
        logger.info("MyApp INFO log");
        logger.warn("MyApp WARN log");
        logger.error("MyApp ERROR log");
//        logger.fatal("MyApp FATAL log");
        
        subOne.doLogging();
        subTwo.doLogging();
        otherLogging.doLogging();
	}

}
