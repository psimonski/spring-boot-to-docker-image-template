package de.psimonski.templates;

import de.psimonski.templates.utils.JvmUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class);
        JvmUtil.logMemoryOutput();
    }

}