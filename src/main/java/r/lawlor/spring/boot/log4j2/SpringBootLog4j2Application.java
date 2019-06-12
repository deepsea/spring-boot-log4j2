package r.lawlor.spring.boot.log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootLog4j2Application {

    private static Logger log = LogManager.getLogger(SpringBootLog4j2Application.class);

    public static void main(String[] args) {

        log.debug("Debug log message");
        log.info("Info log message");
        log.warn("Warning log message");
        log.error("Error log message");
        log.fatal("Fatal log message");
    }



}
