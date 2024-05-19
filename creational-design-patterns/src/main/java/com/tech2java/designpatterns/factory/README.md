Factory:
----------
- Hides the object creation process
- Ex: Car Factory, Chocolate Factory
- DriverManager is factory class where it will return the Connection object based on the connection string.
- (`DriverManager.getConnection(connectionString)`) - it may return Oracle/MySql etc. as per connection string.
- Pizza->VezPizza,CheesePizza etc.
- PizzaStore(client) asks PizzaFactory to get the asked Pizza   PizzaStore-->PizzaFactory

Example:
--------
- The `java.util.Collection(` or `java.util.AbstractCollection`) has an abstract method called iterator().