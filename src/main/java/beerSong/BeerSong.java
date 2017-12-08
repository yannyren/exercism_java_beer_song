package beerSong;

public class BeerSong {


    public static String verse(int i) {
        String result = "";
        if (i > 2 && i < 100){
            int newValue = i-1;
            result = String.format("%d bottles of beer on the wall, %d bottles of beer.\n" +
                    "Take one down and pass it around, %d bottles of beer on the wall.\n\n", i, i, newValue);
        }
        else if (i == 2) {
            result = "2 bottles of beer on the wall, 2 bottles of beer.\n" +
                    "Take one down and pass it around, 1 bottle of beer on the wall.\n\n";
        }
        else if (i == 1) {
            result = "1 bottle of beer on the wall, 1 bottle of beer.\n" +
                    "Take it down and pass it around, no more bottles of beer on the wall.\n\n";
        }
        else if (i == 0) {
            result = "No more bottles of beer on the wall, no more bottles of beer.\n" +
                    "Go to the store and buy some more, 99 bottles of beer on the wall.\n\n";
        }

        return result;
    }

    public String sing(int i, int i1) {
           String result = "";
           for (int x = 0 ; x <= (i - i1); x ++ ){
               result = this.verse(x) + result;
           }
          return result;
    }

    public String singSong() {
        String result = "";
        for (int i = 0; i <=99; i ++) {
            result = this.verse(i) + result;
        }
        return result;
    }
}
