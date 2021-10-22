package org.james;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        // System.out.println( "\n Que nota chatel" );

    Pizza pizza;
    Cocinero cocinero = new  Cocinero();
    PizzaBuilder bpb = new  BarbacoaPizzaBuilder();
    PizzaBuilder cpb = new  CarbonaraPizzaBuilder();

    cocinero.setPizzaBuilder(bpb);
    cocinero.crearPizza();
    pizza = cocinero.getPizza();
    System.out.println(pizza.toString());

    cocinero.setPizzaBuilder(cpb);
    cocinero.crearPizza();
    pizza = cocinero.getPizza();
    System.out.println(pizza.toString());

          

    }
}
