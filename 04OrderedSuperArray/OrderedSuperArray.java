public class OrderedSuperArray extends SuperArray{

    public void add(Object element){
	if (curStored == YAAS.length){
	    resize(curStored*2);
	    for (int i = 0; i < YAAS.length; i++){
		if (YAAS[i].equals(null)){
		    curStored += 1;
		    YAAS[i] = element;
		    break;
		}
	    }
	}
	else{
	    for (int i = 0; i < YAAS.length; i++){
		if (YAAS[i].equals(null)){
		    curStored += 1;
		    YAAS[i] = element;
		    break;
		}
	    }
	}
	TEMP = new Object[YAAS.length];
	for (int j = 0; j < YAAS.length; j++){
	    if (element.compareToIgnoreCase(YAAS[j]) < 0){
		for (int k = 0; k < j; k++){
		    TEMP[k] = YAAS[k];
		}
		for (int k = j + 1; k < YAAS.length; k++){
		    TEMP[k] = 
		    
    }

}