package org.ecommerce;

public class TrachCoach implements Coach{
    private FortuneService fortuneService;

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
