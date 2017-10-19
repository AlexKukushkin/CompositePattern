package composite;

import java.util.ArrayList;
import java.util.List;

public class Product implements IComponent{

    private String worker;
    private List<IComponent> components = new ArrayList<>();

    public Product(String worker) {
        this.worker = worker;
    }

//    public Product(String producer, int price, String worker) {
//        super(producer, price);
//        this.worker = worker;
//    }
    public void addComponent(IComponent component){
        components.add(component);
    }

    @Override
    public List<IComponent> getComponent() {
        return components;
    }

    @Override
    public void change(String component) {
        this.worker = component;
    }

    @Override
    public String toString() {
        return "worker = " + worker + ", \n" + components + "\n";
    }
}


