public class OrderedSuperArray extends SuperArray{

    public void add(String element){
	for (int j = 0; j < curStored - 1; j++){
	    if ((element.compareToIgnoreCase(YAAS[j]) > 0) && (element.compareToIgnoreCase(YAAS[j+1]) <= 0 )){
		super.add(j+1, element);
	    }
	}
		
    }

    public void add(int index, String element){
	this.add(element);
    }

    public String set(int index, String element){
	String rem = remove(index);
	add(element);
	return rem;
    }

}
