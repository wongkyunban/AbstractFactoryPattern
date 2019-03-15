package factory;

import product.AbstractProductA;
import product.AbstractProductB;

public abstract class AbstractFactory {
    public abstract AbstractProductA createProductA();
    public abstract AbstractProductB createProductB();

}
