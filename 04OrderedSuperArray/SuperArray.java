public class SuperArray{
    String[] YAAS;
    int curStored;
    

    public SuperArray(){
	YAAS = new String[10];
    }

    public SuperArray(int capacity){
	if (capacity < 1){
	    YAAS = new String[10];
	}
	else{
	YAAS = new String[capacity];
	}
    }

    public String toString(){
	String res = "[";
	for (int i = 0; i < curStored; i++){
	    res += " " + YAAS[i];
	}
	res += " ]";
	return res;
    }

    public void add(String e){
	if (size() == YAAS.length){
	    resize(curStored * 2);
	}
	YAAS[curStored] = e;
	curStored++;
    }
    
  

    public void add(int index, String o){
	if (index < 0 || index > size()){
	    throw new IndexOutOfBoundsException();
	}
	if (size() == YAAS.length){
	    resize(2*curStored);
	}
	for (int i = YAAS.length - 1; i > index; i--){
	    YAAS[i] = YAAS[i - 1];
	}
	YAAS[index] = o;
	curStored++;
    }

    public String set(int index, String o){
	if (index < 0 || index >= curStored){
	    throw new IndexOutOfBoundsException();
	}
        String former = YAAS[index];
	YAAS[index] = o;
	return former;
    }

    public String remove(int index){
	if (index < 0 || index >= curStored){
	    throw new IndexOutOfBoundsException();
	}
        String RKO = YAAS[index];

	while (index < size() - 1){
	    YAAS[index] = YAAS[index + 1];
	    index++;
	}
	curStored--;
	if (curStored < YAAS.length / 4){
	    resize(YAAS.length / 2);
	}
	return RKO;
    }
    

    public String get(int index){
	if (index < 0 || index >= size()){
	    throw new IndexOutOfBoundsException();
	}
	return YAAS[index];
    }

    public int size(){
	return curStored;
    }

    public void resize(int newSize){
	String[] TEMP = new String[newSize];
	if (newSize < curStored){
	    for (int i = 0; i < newSize; i++){
		TEMP[i] = YAAS[i];
	    }
	}
	else{
	    for (int i = 0; i < curStored; i++){
		TEMP[i] = YAAS[i];
	    }
	}
	YAAS = TEMP;
    }

    public void clear(){
	curStored = 0;
    }

    public void insertionSort(){
        for (int i = 0; i < curStored; i++){
	    String temp = YAAS[i];
	    int pos = i;
	    while(pos > 0 && temp.compareToIgnoreCase(YAAS[pos - 1]) < 0){
		YAAS[pos] = YAAS[pos - 1];
		pos--;
	    }
	    YAAS[pos] = temp;
	}
    }

    public void badInsertionSort(){
        OrderedSuperArray c = new OrderedSuperArray();
        while( this.size() > 0){ 
            c.add(this.remove(0));
        }
        while(c.size() > 0){
            this.add(c.remove(0));
        }
    }

}
