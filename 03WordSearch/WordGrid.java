public class WordGrid{
    private char[][]data;


    /**Initialize the grid to the size specified and fill all of the positions
     *with spaces.
     *@param row is the starting height of the WordGrid
     *@param col is the starting width of the WordGrid
     */
    public WordGrid(int rows, int cols){
	data = new char[rows][cols];
        clear();
    }
    /**Initialize the grid to the default size of 10 by 10 and fill all the
     *positions with spaces.
     */
    public WordGrid(){
	data = new char[10][10];
	clear();
    }

    /**Set all values in the WordGrid to spaces ' '*/
    private void clear(){
	for (int i = 0; i < data.length; i++){
	    for (int j = 0; j < data[i].length; j++){
		data[i][j] = '_';
	    }
	}
    }

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

    /**Attempts to add a given word to the specified position of the WordGrid.
     *The word is added from left to right, must fit on the WordGrid, and must
     *have a corresponding letter to match any letters that it overlaps.
     *
     *@param word is any text to be added to the word grid.
     *@param row is the vertical locaiton of where you want the word to start.
     *@param col is the horizontal location of where you want the word to start.
     *@return true when the word is added successfully. When the word doesn't fit,
     *or there are overlapping letters that do not match, then false is returned.
     */
    public boolean addWordHorizontal(String word, int row, int col){
	if(data[row].length - col < word.length()){
	    return false;
	}
	for(int i = 0; i < word.length(); i++){
	    if (data[row][col+i] == '_' || data[row][col+i] == word.charAt(i)){
	    }
	    else{
		return false;
	    }
	}
	for(int j = 0; j < word.length(); j++){
	    data[row][col+j] = word.charAt(j);
	}
	return true;
    }

    /**Attempts to add a given word to the specified position of the WordGrid.
     *The word is added from top to bottom, must fit on the WordGrid, and must
     *have a corresponding letter to match any letters that it overlaps.
     *
     *@param word is any text to be added to the word grid.
     *@param row is the vertical locaiton of where you want the word to start.
     *@param col is the horizontal location of where you want the word to start.
     *@return true when the word is added successfully. When the word doesn't fit,
     *or there are overlapping letters that do not match, then false is returned.
     */

    public boolean addWordVertical(String word, int row, int col){
	if(data.length - row < word.length()){
	    return false;
	}
	for(int i = 0; i < word.length(); i++){
	    if (data[row+i][col] == '_' || data[row+i][col] == word.charAt(i)){
	    }
	    else{
		return false;
	    }
	}
	for(int j = 0; j < word.length(); j++){
	    data[row+j][col] = word.charAt(j);
	}
	return true;
    }

    /**Attempts to add a given word to the specified position of the WordGrid.
     *The word is added from top to bottom, must fit on the WordGrid, and must
     *have a corresponding letter to match any letters that it overlaps.
     *
     *@param word is any text to be added to the word grid.
     *@param row is the vertical locaiton of where you want the word to start.
     *@param col is the horizontal location of where you want the word to start.
     *@return true when the word is added successfully. When the word doesn't fit,
     *or there are overlapping letters that do not match, then false is returned.
     */
    public boolean addWordDiagonal(String word, int row, int col){
	if (data.length - row < word.length() || data[row].length - col < word.length()){
	    return false;
	}
	for(int i = 0; i < word.length(); i++){
	    if (data[row+i][col+i] == '_' || data[row+i][col+i] == word.charAt(i)){
	    }
	    else{
		return false;
	    }
	}
	for(int j = 0; j < word.length(); j++){
	    data[row+j][col+j] = word.charAt(j);
	}
	return true;
    }
}
