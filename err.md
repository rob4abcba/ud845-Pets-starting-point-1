
Planetary Nebulae [Nov 7th at 6:22 PM]
I'm on the CursorLoader lesson, and I'm having trouble with the getLoaderManager().initLoader saying "this" is a wrong 3rd argument type. I've tried some of the things suggested, but the app still crashes. Here's the code, its line 71 in the CatalogActivity. https://github.com/PlanetaryNebulae/ud845-Pets-starting-point
GitHub
PlanetaryNebulae/ud845-Pets-starting-point
Uses a database to store info about pets in a shelter. - PlanetaryNebulae/ud845-Pets-starting-point
 


8 replies
Curtis Getz (AND) [1 day ago]
try getSupportLoaderManager().initLoader instead since you're importing the support library version of LoaderManager (edited)

Planetary Nebulae [1 day ago]
I tried using that earlier and it made the error go away, but the app still crashed. I'll try again though, it could possibly be my emulator glitching too I guess.

Curtis Getz (AND) [1 day ago]
I'll load it up in Android Studio and see what happens here.

Planetary Nebulae [1 day ago]
ok thanks

Curtis Getz (AND) [1 day ago]
Looks like there's a typo in your adapter.

on line 68 of PetCursorAdapter you are getting the index for the PET_GENDER column. Then trying to assign whatever is in that column to a String 'petBreed' on line 72.

Since the GENDER stores an integer and the BREED stores a String that's causing a crash.


Curtis Getz (AND) [1 day ago]
well not a typo I guess, just wrong variable name


Planetary Nebulae [1 day ago]
Oh thanks! I made it to that just now, but somehow I still couldn't see the problem. It's working now, thanks!


Curtis Getz (AND) [1 day ago]
Sure no problem!
Good luck with the rest
