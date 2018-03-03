package model.itemspkg.electronicspkg;

import model.itemspkg.ItemsInterface;
import model.itemspkg.Product;

public class Electronics extends Product implements ItemsInterface{

    private String producer;
    private String uses;

    public Electronics(String producer, String uses) {
        this.producer = producer;
        this.uses = uses;
    }

    public Electronics(String id, String name, double price, String color, String producer, String uses) {
        super(id, name, price, color);
        this.producer = producer;
        this.uses = uses;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getUses() {
        return uses;
    }

    public void setUses(String uses) {
        this.uses = uses;
    }

    @Override
    public void seeDetails() {

    }
}
