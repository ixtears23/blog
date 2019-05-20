package com.junseok.blog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyAppSubOne {

//	private static final Logger logger = LogManager.getLogger();
	private static final Logger logger = LoggerFactory.getLogger(MyApp.class);
	
	public void doLogging() {
		
        logger.trace("MyAppSubOne TRACE log");
        logger.debug("MyAppSubOne DEBUG log");
        logger.info("MyAppSubOne INFO log");
        logger.warn("MyAppSubOne WARN log");
        logger.error("MyAppSubOne ERROR log");
//        logger.fatal("MyAppSubOne FATAL log");
	}
	
	
}
