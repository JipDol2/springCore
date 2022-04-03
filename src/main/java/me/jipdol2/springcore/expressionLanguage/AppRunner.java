package me.jipdol2.springcore.expressionLanguage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {
    @Value("#{1+1}")
    int value;

    @Value("#{'hello' + 'world'}")
    String greeting;

    @Value("#{1 eq 1}")
    boolean trueOrFalse;

    @Value("${my.value}")
    int myValue;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("===========");
        System.out.println(value);
        System.out.println(greeting);
        System.out.println(trueOrFalse);
        System.out.println(myValue);
    }
}
