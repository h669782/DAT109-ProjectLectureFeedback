package no.hvl.dat109.lectureFeedback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class LectureFeedbackApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(LectureFeedbackApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(LectureFeedbackApplication.class);
    }
}


