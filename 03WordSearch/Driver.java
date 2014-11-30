import java.util.*;

public class Driver{
    public static void main(String[] args){
	Random rand = new Random();
	if(args.length > 0){
	    int r = Integer.parseInt(args[0]);
	    int c = Integer.parseInt(args[1]);
	    long seed = rand.nextLong();
	    boolean answer = true;
	    if (args.length > 2){
		seed = Long.parseLong(args[2]);
		if (args.length > 3){
		    if (args[3].equals("1")){
			    answer = false;
		    }
		}
	    }
	    WordGrid W = new WordGrid(r, c);
	    W.setSeed(seed);
	    W.loadWordsFromFile("Words.txt", answer);
	    System.out.println("Find the words:" + "\n" + W.wordsInPuzzle());
	    System.out.println("\n" + W); 
	}
	else{
	    System.out.println("Usage: \n" +
			       "java Driver <rows> <columns> [<random seed>][<answer key>]\n" +
			       "<rows> and <columns> are integers that determine the size of the grid \n" +
			       "[<random seed>] is a long number that specifies a specific seed to produce the puzzle by. With it, you can regenerate the same puzzle \n" +
			       "[<answer key>] is set to 1 if you wish for the answer key to be printed\n");
	}
    }
}
