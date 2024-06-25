package org.example.scheduling.service.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
@EnableScheduling
public class SchedulingJobService {

    private static final Logger logger = LoggerFactory.getLogger(SchedulingJobService.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");


    public SchedulingJobService() {
        logger.info("SchedulingService initialized");
    }

    @Scheduled(fixedDelay = 2000)
    public void printDateTime(){
        logger.info("The time now is : {}",dateFormat.format(new Date()));
    }




}
