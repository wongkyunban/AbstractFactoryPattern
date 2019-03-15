import factory.AbstractFactory;
import factory.ConcreteFactory1;
import factory.ConcreteFactory2;
import product.AbstractProductA;
import product.AbstractProductB;

public class Client {

    private AbstractProductA productA;
    private AbstractProductB productB;

    private AbstractFactory factory;

    public void showProductA1aB1(){
        factory = new ConcreteFactory1();
        productA = factory.createProductA();
        productB = factory.createProductB();
        productA.productName();
        productB.productAge();
    }

    public void showProductA2aB2(){
        factory = new ConcreteFactory2();
        productA = factory.createProductA();
        productB = factory.createProductB();
        productA.productName();
        productB.productAge();
    }
}
