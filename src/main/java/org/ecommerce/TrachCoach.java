package org.ecommerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TrachCoach implements Coach{
    private FortuneService fortuneService;

    @Autowired
    public TrachCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }
    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @Override
    public String instruction() {
        return "Go Home";
    }
}
