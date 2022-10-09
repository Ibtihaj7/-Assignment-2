# -Assignment-2

The problem when I ask to make new kind of monster :fast and stealth .it’s going to be very hard, because I need a new class which is inherit from monster that have move of monsterFast and makeNoise and render ,this is very difficult and unorganized.

## Solve the problem:

I design these as interface: 
- A Movable Class to move from location to another location (contain move function).
- A MakeRender Class  to draw the enitiy in the game and controls its appearance(contain render function ).
- A MakeNoise Class to make noise( contain makeNoise function)

In the Entity class I declare private member with type of List<Object> I store all player and monster kinds.

## This is UML for my code and the class in red is the new monster :

<img width="619" alt="Screen Shot 2022-10-09 at 19 58 18" src="https://user-images.githubusercontent.com/92644947/194769728-4fd41af1-cf75-4f1f-829d-5b4fde597fc5.png">
