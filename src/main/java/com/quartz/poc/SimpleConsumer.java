package com.quartz.poc;

import org.apache.camel.Exchange;
import org.apache.camel.Handler;
import org.apache.log4j.Logger;

/**
 * Created with IntelliJ IDEA.
 * User: Anand_Rajneesh
 * Date: 12/7/13
 * Time: 4:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class SimpleConsumer {

    public static final Logger LOG = Logger.getLogger(SimpleConsumer.class);

    @Handler
    public void consume(Exchange exchange) {
        LOG.info(System.currentTimeMillis() + " Received message from quartz");
        LOG.info(exchange);
    }
}
