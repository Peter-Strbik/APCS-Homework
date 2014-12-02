public class SuperArray{
    String[] YAAS;
    int curStored;
    

    public SuperArray(){
	YAAS = new Object[10];
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

    public void add(Object e){
	if (size() == YAAS.length){
	    resize(curStored * 2);
	}
	YAAS[curStored] = e;
	curStored++;
    }
    
  

    public void add(int index, Object o){
        if (curStored < YAAS.length){
	    TEMP = new Object[YAAS.length];
	    for (int i = 0; i < index; i++){
		TEMP[i] = YAAS[i];
	    }
	    for (int i = index + 1; i < YAAS.length; i++){
		TEMP[i] = YAAS[i];
	    }
	    TEMP[index] = o;
	    YAAS = TEMP;
	    curStored += 1;
	}
	else{
	    resize(YAAS.length + 1);
	    TEMP = new Object[YAAS.length];
	    for (int i = 0; i < index; i++){
		TEMP[i] = YAAS[i];
	    }
	    for (int i = index + 1; i < YAAS.length; i++){
		TEMP[i] = YAAS[i];
	    }
	    TEMP[index] = o;
	    YAAS = TEMP;
	    curStored += 1;
	}	
    }

    public Object set(int index, Object o){
	if (index < 0 || index >= curStored){
	    throw new IndexOutOfBoundsException();
	}
	Object former = YAAS[index];
	YAAS[index] = o;
	return former;
    }

    public Object remove(int index){
	if (index < 0 || index >= curStored){
	    throw new IndexOutOfBoundsException();
	}
	Object RKO = YAAS[index];

	TEMP = new Object[YAAS.length - 1];
	for (int i = 0; i < index; i++){
	    TEMP[i] = YAAS[i];
	}
	for (int i = index; i < TEMP.length; i++){
	    TEMP[i] = YAAS[i+1];
	}
	YAAS = TEMP;
	return RKO;
    }
    

    public Object get(int index){
	if (index > curStored){
	    System.out.println("Error: Index out of Range");
	    return null;
	}
	else{
	    return YAAS[index];
	}
    }

    public int size(){
	return curStored;
    }

    public void resize(int newSize){
	TEMP = new Object[newSize];
	if (newSize < YAAS.length){
	    for (int i = 0; i < newSize; i++){
		TEMP[i] = YAAS[i];
	    }
	}
	else{
	    for (int i = 0; i < YAAS.length; i++){
		TEMP[i] = YAAS[i];
	    }
	}
	YAAS = TEMP;
    }

    public void clear(){
	TEMP = new Object[YAAS.length];
	YAAS = TEMP;
	curStored = 0;
    }

}
