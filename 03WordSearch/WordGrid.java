import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class WordGrid{
    private char[][]data;
    private ArrayList<String> wordsInGrid;
    private Random rand;


    /**Initialize the grid to the size specified and fill all of the positions
     *with underscores.
     *@param row is the starting height of the WordGrid
     *@param col is the starting width of the WordGrid
     */
    public WordGrid(int rows, int cols, long seed){
	data = new char[rows][cols];
	rand = new Random(seed);
        clear();
    }
    /**Initialize the grid to the default size of 10 by 10 and fill all the
     *positions with underscores.
     */
    public WordGrid(){
	data = new char[10][10];
	rand = new Random();
	clear();
    }

    /**Set all values in the WordGrid to underscores '_'*/
    private void clear(){
	for (int i = 0; i < data.length; i++){
	    for (int j = 0; j < data[i].length; j++){
		data[i][j] = '_';
	    }
	}
    }

    public loadWordsFromFile(String filename, 

    /**The proper formatting for a WordGrid is created in the toString.
     *@return a String with each character separated by spaces, and each row
     *separated by newlines.
     */
    public String toString(){
	String res = "";
	for (int i = 0; i < data.length; i++){
	    for (int j = 0; j < data[i].length; j++){
		res += " " + data[i][j];
	    }
	    res += "\n";
	}
	return res;
    }

    public boolean addWord(String word, int row, int col, int dx, int dy){
	if (checkWord(word, row, col, dx, dy)){
	    for (int i = 0; i < word.length(); i++){
		data[row+i*dy][col+i*dx] = word.charAt(i);
	    }
	    return true;
	}
	return false; 
    }

    /**Checks if a given word can be added to the puzzle.
     *@param word is the word to be added to the grid.
     *@param row is the vertical location of where you want the word to start.
     *@param col is the horizontal location of where you want the word to start.
     *@param dx ranges from -1 to 1, specifies the direction of the word in the horizontal direction.
     *@param dy ranges from -1 to 1, specifies the direciton of the word in the vertical direction.
     *@return true when the word is added successfully. When the word doesn't fit,
     *or there are overlapping letter that do not match, then false is returned.
     */  
    private boolean checkWord(String word, int row, int col, int dx, int dy){
	if (dx > 1 || dx < -1 || dy > 1 || dy < 1 || (dx == 0 && dy == 0) ||
	    ((dx == 1 || dx == -1) && word.length() > data[0].length)||
	    ((dy == 1 || dy == -1) && word.length() > data.length)){
	    return false;
	}
	for (int i = 0; i < word.length() ; i++){
	    if ((row + i*dy < 0 || row + i*dy >= data.length || col + i*dx < 0 || col + i*dx >= data[0].length)
		|| (data[row+i*dy][col+i*dx] != '_' && word.charAt(i) != data[row+i*dy][col+i*dx])){
		return false;
	    }
	}
	return true;
    }
}
