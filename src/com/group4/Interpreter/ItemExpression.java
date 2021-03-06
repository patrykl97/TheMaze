package com.group4.Interpreter;

import com.group4.Interfaces.Item;

public class ItemExpression extends Expression {

    private int itemAttributeValue;

    public ItemExpression(Item item) {
        this.itemAttributeValue = item.getDamage();
    }

    public ItemExpression(int itemValue){
        this.itemAttributeValue = itemValue;
    }

    @Override
    public int interpret() {
        return itemAttributeValue;
    }

}