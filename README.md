# Swingy
please clone from "Frans" branch untill I fix my merge problem. This is where the majority of the work happened.

## A CLI game made in Java.
after swicthing to the correct branch run `mvn package clean` to compile with maven (I dont know much about maven) and then `java -jar Swingy.jar` to run.
The game accepts text input to interact. Read the instructions or keyboard smash until the input does the thing. `exit` at any point after launching the map will save the heros name, class, xp and level and exit the game.

## screwy rules
you can move around the map using `north` `south` `east` or `west`. A `0` means the square is free. a `-` means you will encounter an enemy. Choose `fight` or `flight`. flight will allow you to maybe, if you're lucky, flee to the previous spot and learn your lesson not to go there again. However the enemy you encounter if you go there agin will not be the same...I was lazy about generating enemies and just took from an array. The enemy will have a level similar to yours. If it's higher you have a liklihood of loosing. The game will exit and progress will be lost. But otherwise you'll probably win. you can choose to pick up an artefact to strengthen your xp which in turn moves you closer to the next level. Be careful though. leveling up gives no benefits, only more challenges with a bigger map, and you, right in the middle again. If I were you I'd skirt around the enemies until I reach the end of the map and get a YOU WON message. because you did. You're awesome. good on you.
