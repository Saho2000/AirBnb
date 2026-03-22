package AirBnb.example.AirBnb.strategy;

import AirBnb.example.AirBnb.entity.Inventory;

import java.math.BigDecimal;

public class BasePricingStrategy implements PricingStrategy{
    @Override
    public BigDecimal calculatePrice(Inventory inventory) {
        return inventory.getRoom().getBasePrice();
    }
}
