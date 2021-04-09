package org.ecommerce;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneServcie implements FortuneService {
    @Override
    public String getFortune() {
        return "Blessings given!!";
    }
}
