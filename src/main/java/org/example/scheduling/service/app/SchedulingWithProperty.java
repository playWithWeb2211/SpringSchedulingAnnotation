package org.example.scheduling.service.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
@ConditionalOnProperty(name = "scheduler.enabled", matchIfMissing = true)
/**
 * This is scheduled based on the name "scheduler.enabled" if this property is not specified
 * in the application.properties file then it is considered as true as specified with matchIfMissing
 * otherwise we can set it to false by specifying the property
 */
public class SchedulingWithProperty {

    private static final Logger logger = LoggerFactory.getLogger(SchedulingJobService.class);

    @Scheduled(fixedDelay = 3000)
    public void enableWithProperty(){
        logger.info("Scheduling With property...");
    }

}
