package org.ecommerce;

public class TennisCoach implements Coach {
    @Override
    public String instruction() {
        return "Tennis play hard";
    }

    @Override
    public String getDailyFortune() {
        return "Lucky Day man";
    }
}
