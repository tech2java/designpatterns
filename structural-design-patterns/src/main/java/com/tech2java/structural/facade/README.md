Facade:
-------
- Simply hides the complexity of the system.
- Client ->(EJB/RPC,REST) Facade ->(CheckStock,PlaceOrder,shipOrder)



The Facade design pattern in Java simplifies interactions with complex subsystems by providing a unified, higher-level interface, making the system easier to use and maintain. 
Here's a more detailed explanation: 
Purpose:
The Facade pattern acts as a "front door" or interface to a complex subsystem, hiding the intricate details and providing a simplified API for clients.
How it works:
A Facade class encapsulates the complexity of the underlying subsystem, delegating calls to the appropriate subsystem classes.
Benefits:
Simplified Interface: Clients interact with a cleaner, more intuitive interface, without needing to understand the intricacies of the subsystem.
Reduced Coupling: The client code becomes less dependent on the subsystem's internal workings, promoting loose coupling and making the system more flexible and maintainable.
Improved Readability: The code becomes easier to understand and maintain, as the complex subsystem is abstracted away.
