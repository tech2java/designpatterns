Singleton:
----------
- ONE AND ONLY ONE
- Example1: PropertyReader - read the data from a file.
- Creates only one time used in multiple classes.
- Can save a lot of memory using singleton pattern.
- Example2: Logger object is also singleton where it can log info,debug,error etc.
- Example3: Datasource object where it maintains collection of objects, and it will give connection to the program.
- Steps
- -Declare the constructor of the class as private.
- -Declare a static method
- -Declare a static member of the same class type in the class.
- Eager Instantiation:
- Static block
- Handling multiple threads - Singleton objet should be thread safe.
- Acquiring a lock is very expensive 

Serialization vs Deserialization
--------------------------------
- NotSerializableException: singleton.com.tech2java.designpatterns.DateUtil - implement Serializable for DateUtil class
- After Deserialization - we will see different object.
- To resolve the issue - we implement readResolve() method in DateUtil class
- ObjectInputstream calls readResolve() method while deserializing
- override clone method - need to work
- Reflection problem - need to work
- Enum solution - need to work


Example:
--------
- The **java.lang.Runtime** class in standard Java API is a singleton.