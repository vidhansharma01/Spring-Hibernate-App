package org.ecommerce;

import org.springframework.stereotype.Component;

@Component
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
