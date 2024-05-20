FlyWeight:
----------
- Saves memory
- Shape - (circle,Rectangle)
- Problem: Creating number of objects
- ` 
     if(i%2==0){
                shapes[i]=new Circle();
                ((Circle)(shapes[i])).setRadius(i);
                ((Circle)(shapes[i])).setFillColor("Red");
                ((Circle)(shapes[i])).setLineColor("white");
                shapes[i].draw();
            }else{

                shapes[i]=new Rectangle();

                ((Rectangle)(shapes[i])).setLength(i);
                ((Rectangle)(shapes[i])).setBreadth(i+1);
                ((Rectangle)(shapes[i])).setFillStyle("dotted");
                shapes[i].draw();
            }`
- Solution:
- Separate the Extrinsic state
- Pass them as parameters
- Create a factory class
- After implementing this patten- only 2 objects will be created.
- 