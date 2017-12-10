package beerSong;


public class BeerSong {


    public String verse(int i) throws IllegalArgumentException{
        if(i < 0 ) throw new IllegalArgumentException ("Time to fill up the fridge!!!");
        switch (i) {

            case(2): return "2 bottles of beer on the wall, 2 bottles of beer.\n" +
                    "Take one down and pass it around, 1 bottle of beer on the wall.\n\n";

            case(1): return "1 bottle of beer on the wall, 1 bottle of beer.\n" +
                    "Take it down and pass it around, no more bottles of beer on the wall.\n\n";

            case(0): return "No more bottles of beer on the wall, no more bottles of beer.\n" +
                    "Go to the store and buy some more, 99 bottles of beer on the wall.\n\n";

            default: return i + " bottles of beer on the wall, " + i + " bottles of beer.\n" +
                    "Take one down and pass it around, " + (i - 1) + " bottles of beer on the wall.\n\n";
        }

    }

    public String sing(int startingVerse, int endVerse) {
        if (startingVerse < endVerse || startingVerse < 0 || endVerse < 0  ) {
            return "the first number should be bigger than or equal to the second number and the second number should be bigger than -1";
        }
        String result = "";
        for (int x = startingVerse ; x >= endVerse; x -- ){
            result = result + this.verse(x);
        }
        return result;
    }

    public String singSong() {
       return this.sing(99, 0);
    }
}
