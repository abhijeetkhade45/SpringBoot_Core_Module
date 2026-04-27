package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.nt.sbeans.Cricket;

@SpringBootApplication
@ImportResource("classpath:com/nt/cfgs/applicationContext.xml")
public class BootProj05StrategyDpJavaConfigApplication {
    public static void main(String[] args) {
        ApplicationContext ctx =
            SpringApplication.run(BootProj05StrategyDpJavaConfigApplication.class, args);

        Cricket ckt = ctx.getBean("cricket", Cricket.class);
        ckt.playing();
    }
}