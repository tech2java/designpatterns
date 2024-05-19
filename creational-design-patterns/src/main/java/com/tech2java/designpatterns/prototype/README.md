Prototype:
---------
- Gaming app - for each player, instead of creating object from scratch - create object with some required initialization. 
- In this example, creating object for each player is expensive operation.
- Spring supports both Singleton and Prototype.
- It uses clone(implement **Cloneable** interface) method to implement this pattern.
- _Shallow copy_ - **Default implementation** fo clone method. If we assign membership for first object , after cloning , the same membership can be application for all objects.
- _Deep copy_ - implement our own implementation.`@Override
  protected Game clone() throws CloneNotSupportedException {
  Game game= (Game) super.clone();
  game.setMembership(new Membership());
  return game;
  }`
- _Constructor copy_ `Game(Game game){
  this.id=game.id;
  this.name=game.name;
  this.membership=new Membership();
  }`

Example:
--------
- The `Object.clone()` method is the example of prototype design pattern.