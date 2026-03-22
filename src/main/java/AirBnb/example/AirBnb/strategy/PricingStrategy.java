package AirBnb.example.AirBnb.strategy;

import AirBnb.example.AirBnb.entity.Inventory;

import java.math.BigDecimal;

public interface PricingStrategy {

    BigDecimal calculatePrice(Inventory inventory);
}

