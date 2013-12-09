package com.quartz.poc;

import org.apache.camel.builder.RouteBuilder;

/**
 * Created with IntelliJ IDEA.
 * User: Anand_Rajneesh
 * Date: 12/7/13
 * Time: 4:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class QuartzRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        //7:30 pm
        from("quartz://myquartz?cron=0+30+19+*+*+?")
                .setBody(constant("This is simple"))
                .log("Firing Now?showAll=true")
                .bean(SimpleConsumer.class);

        //Every 6 secs, for 100 times
        from("quartz://myGroup/myTimerName?trigger.repeatInterval=6000&trigger.repeatCount=100&fireNow=false")
                .setBody(constant("This is simple"))
                .log("Firing Now?showAll=true")
                .bean(SimpleConsumer.class);
    }
}
