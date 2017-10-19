package composite;

import java.util.List;

public interface IComponent {
    public void change(String component);
    public void addComponent(IComponent component);
    public List<IComponent> getComponent();
}
