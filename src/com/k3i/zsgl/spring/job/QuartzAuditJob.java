package com.k3i.zsgl.spring.job;

;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;


@Component("quartzAuditJob")
public class QuartzAuditJob {

    private Logger log = LogManager.getLogger(this.getClass());




    public void runTask() {

    }
}
