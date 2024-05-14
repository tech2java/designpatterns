Single Responsibility:(SRP)
-----------------------
- There should never be more than one reason for a class to change.
- Focused , single functionality.
- Address a specific concern.
- UserController, UserValidator , UserPersistenceService.

Open-Closed-Principle(OCP):
---------------------------
- Software entities (classes, modules and methods etc.) should be open for extension and closed for modifications
- Open for extension - Extend Existing Behaviour.
- Closed for modification - Existing code remains unchanged.
- Base(should not write code in Base class i.e. already tested  - avoid modifying base class) <- Derived class(Open for extension - can derive from base and override methods)

- PhoneSubscriber & ISPSubscriber (Problem: Some information is duplicated)
- If company introduces new subscriber- VOIP then need to add common fields
- Move common properties to solid Base class(subscriber) and shield it so that we can't modify the base class.
- Common properties - make them  as a protected and can be used in derived class methods.

Interface Segregation Principle(ISP):
-----------------------------------
- Clients should not be forced to depend upon the interfaces that they do not use. 
- Clients should not use the methods that are defined in the interfaces that they do not use
- Interface pollution: should not use large interfaces with unrelated methods.
- signs of interface pollution(violating interface segregation)
- -Classes have empty method implementation
- -Method implementations throw UnsupportedOperationException(or similar)
- Write highly cohesive interfaces.
- Entity(base class) , User , Order
- PersistenceService, UserPersistenceService
- OrderPersistenceService implements PersistenceService
- Problem with the findByName in OrderPersistenceService as name is not defined in the Order class.(no name for orders)
- User has name - it make sense to have findByName in UserPersistenceService class.
- Order doesn't have name -it's violating interface segregation principle
- Solution1: Break the interface
- Solution2: if a method present in the PersistenceService application for only class - then remove that from PersistenceService and add in the required implementation class
- Put findByName() method in the UserPersistenceService class and remove from PersistenceService interface.
- if we removed findByName() method in the UserPersistenceService - then OrderPersistenceService is not forced to implement dummy implementation for findByName method.

Dependency Inversion Principle:
-------------------------------
- High level modules should not depend upon low level modules. Both should depend upon abstractions.
- Abstractions should not depend upon details .Details should depend on abstractions
- Dependency: Example: writeReport() method - Need to create these JSONFormatter and FileWriter class objects.It's tightly coupled with these concrete classes.
- if format want's to change from JSON to XML - then need to modify the code and that introduces more bugs
- High level module: module that implements business logic.
- Low level module: functionality that can be used anywhere. (Ex: converting java obj to json, writing data to disk)
- High level modules should not depend upon low level modules
- use abstraction - means interface (Ex:Writer and Formatter) 
- Write high-level module code using that interface.
- Instead of instantiating dependencies ourselves - let somebody else give us the dependency