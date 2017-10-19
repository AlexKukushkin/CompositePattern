package composite;

import java.util.ArrayList;
import java.util.List;

public class Project implements IComponent{

    private List<IComponent> components = new ArrayList<>();

    public void addComponent(IComponent component){
        components.add(component);
    }

    public List<IComponent> getComponent(){
        return components;
    }

    @Override
    public String toString() {
        return "Project{\n" + components + "}";
    }

    @Override
    public void change(String component) {

    }
}
