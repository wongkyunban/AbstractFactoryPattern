package factory;

import product.AbstractProductA;
import product.AbstractProductB;
import product.ProductA1;
import product.ProductB1;

public class ConcreteFactory1 extends AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
