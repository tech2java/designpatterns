Decorator:
--------
- Functionality at runtime.
- new BufferedReader(new FileReader(..)) - FileReader reads a single line , once BufferedReader wrapped on FileReader - it reads more data.
- Here, BufferedReader is wrapper/decorator to FileReader.
- Example: Pizza(Component) PlainPizza(Concrete Component)
- PizzaDecorator(Decorator) - VeggiePizzaDecorator , CheesePizzaDecorator => Concrete decorators