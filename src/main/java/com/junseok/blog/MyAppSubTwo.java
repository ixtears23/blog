package com.junseok.blog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyAppSubTwo {

//	static final Logger logger = LogManager.getLogger();
	private static final Logger logger = LoggerFactory.getLogger(MyAppSubTwo.class);
	
	public void doLogging() {
		
        logger.trace("MyAppSubTwo TRACE log");
        logger.debug("MyAppSubTwo DEBUG log");
        logger.info("MyAppSubTwo INFO log");
        logger.warn("MyAppSubTwo WARN log");
        logger.error("MyAppSubTwo ERROR log");
//        logger.fatal("MyAppSubTwo FATAL log");
	}
	
	
}
