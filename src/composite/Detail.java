package composite;

import java.util.ArrayList;
import java.util.List;

public class Detail implements IComponent {

    private String producer;
    private int price;
    private List<IComponent> components = new ArrayList<>();

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Detail(String producer, int price) {
        this.producer = producer;
        this.price = price;
    }

    @Override
    public void addComponent(IComponent component) {

    }

    @Override
    public List<IComponent> getComponent() {
        return null;
    }

    @Override
    public void change(String component) {
        this.producer = component;
    }

    @Override
    public String toString() {
        return "producer = " + producer + ", price = " + price + "}";
    }
}
