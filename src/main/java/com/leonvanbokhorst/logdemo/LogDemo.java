package com.leonvanbokhorst.logdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class LogDemo {

  private final Logger logger = LoggerFactory.getLogger(this.getClass());
  private int messages = 0;

  void logSomething(String message) {
    logger.debug("Message {}: {}", messages, message);
    messages++;
  }

  void logError(String message) {
    logger.error("Message {}: {}", messages, message);
    messages++;
  }
}
