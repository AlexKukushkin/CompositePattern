package composite;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Detail detail1 = new Detail("Producer 1", 100);
        Detail detail2 = new Detail("Producer 2", 200);
        Detail detail3 = new Detail("Producer 3", 300);
        Detail detail4 = new Detail("Producer 4", 400);
        Detail detail5 = new Detail("Producer 5", 500);

        List<Detail> detailList = new ArrayList<>();

        detailList.add(detail1);
        detailList.add(detail2);
        detailList.add(detail3);
        detailList.add(detail4);
        detailList.add(detail5);

        Product product1 = new Product("Worker 1");
        Product product2 = new Product("Worker 2");
        product1.addComponent(detail1);
        product1.addComponent(detail2);
        product2.addComponent(detail3);
        product2.addComponent(detail4);
        product2.addComponent(detail5);

        Order order1 = new Order("Manager 1");
        order1.addComponent(product1);
        order1.addComponent(product2);

        Project project = new Project();
        project.addComponent(order1);

        order1.change("Manager 10");
        product1.change("Worker 11");
        product2.change("Worker 33");
        detail1.change("Producer333");
        detail5.change("Producer777");

        int sum = 0;
        for (Detail detail : detailList){
            sum += detail.getPrice();
        }
        System.out.println(project);
        System.out.println("----------------------");
        System.out.println("Sum = " + sum);
    }

}
