package com.junseok.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;

public class OtherLogging {
	
//	private static final Logger logger = LogManager.getLogger();
	private static final Logger logger = LoggerFactory.getLogger(OtherLogging.class);
	

	public void doLogging() {
		
        logger.trace("OtherLogging TRACE log");
        logger.debug("OtherLogging DEBUG log");
        logger.info("OtherLogging INFO log");
        logger.warn("OtherLogging WARN log");
        logger.error("OtherLogging ERROR log");
//        logger.fatal("OtherLogging FATAL log");
	}
}
