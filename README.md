# -Assignment-2

The problem when I ask to make new kind of monster :fast and stealth .it’s going to be very hard, because I need a new class which is inherit from monster that have move of monsterFast and makeNoise and render ,this is very difficult and unorganized.

## Solve the problem:

I design these as interface: 
- A Movable Class to move from location to another location (contain move function).
- A MakeRender Class  to draw the enitiy in the game and controls its appearance(contain render function ).
- A MakeNoise Class to make noise( contain makeNoise function)

In the Entity class I declare private member with type of List<Object> I store all player and monster kinds.

Now we can create any kind of player or monster and make them to implement any interface according to its own characteristics, like Player made it
tow kind: PlayrtMover that implement Movable interface, and PlayerRender that implement MakeRender interface .so if I would to create new kind of monster :fast and stealth , I should make class for it and make the class implement Movable and MakeNoise interfaces.

## This is UML for my code and the class in red is the new monster :


<img width="545" alt="Screen Shot 2022-10-09 at 21 53 56" src="https://user-images.githubusercontent.com/92644947/194774501-94024c68-5721-4628-9abb-15a0e42aff89.png">
