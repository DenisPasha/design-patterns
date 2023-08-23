package org.example.loggerExample;

import org.apache.log4j.Logger;

public class Main {

    public static void main(String[] args) {
        Logger logger = MainLogger.getLogger();

        logger.debug("Hello there mate");
        logger.error("Big problem here" , new Exception());
        logger.info("All good");
        logger.info("All good");

    }
}
