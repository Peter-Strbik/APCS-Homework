import java.util.*;

public class Wot{
    public static void main(String[] args){
	ArrayList<Integer> x = new ArrayList<Integer>(20);
	Random rand = new Random();
	for (int i = 0; i < 20; i++){
	    x.add(rand.nextInt(10));
	}
	System.out.println(x);
	collapseDuplicates(x);
	System.out.println(x);

    }


    public static void collapseDuplicates(ArrayList<Integer> L){
	ArrayList<Integer> rem = new ArrayList<Integer>();
	for (int i = 0; i < L.size()-1; i++){
	    if (L.get(i) == L.get(i+1)){
		rem.add(i+1);
	    }
	}
	System.out.println("The indices that need to be removed are:");
	System.out.println(rem);
	for (int j = 0; j < rem.size(); j++){
	    rem.set(j, (int)rem.get(j)-j);
	}
	for (int k = 0; k < rem.size(); k++){
	    L.remove((int)rem.get(k));
	}
    }

}
