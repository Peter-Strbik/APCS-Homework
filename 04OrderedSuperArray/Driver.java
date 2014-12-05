import java.util.Arrays;
public class Driver{

    public static void main(String[] args){
	SuperArray x = new SuperArray();
	for(int i = 0; i < 500000; i++){
	    String added = "" + i;
	    x.add(added);
	}
	if (args.length > 0){
	    if (args[0].equals("0")){
		String[] y = x.get();
		Arrays.sort(y);
	    }
	    if (args[0].equals("1")){
		x.insertionSort();
	    }
	    if (args[0].equals("2")){
		x.selectionSort();
	    }
	}

       

    }

}
