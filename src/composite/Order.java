package composite;

import java.util.ArrayList;
import java.util.List;

public class Order implements IComponent{

    private String manager;
    private List<IComponent> components = new ArrayList<>();


    public Order(String manager) {
        this.manager = manager;
    }

    public void addComponent(IComponent component){
        components.add(component);
    }

    @Override
    public List<IComponent> getComponent() {
        return components;
    }

    @Override
    public void change(String component) {
        this.manager = component;
    }

    @Override
    public String toString() {
        return "manager = " + manager + ", \n" + components + "\n";
    }
}