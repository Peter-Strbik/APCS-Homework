import java.util.*;
public class Sorts{

    public static void main(String[] args){
	Random r = new Random();
	int[] x  = new int[100];
	for (int i = 0; i < x.length; i++){
	    x[i] = r.nextInt(100);
	}
	System.out.println(x);
	BubbleSort(x);
	System.out.println(x);

    }

    public static void BubbleSort(int[] L){
	for(int i = 0; i < L.length - 1; i++){
	    int c = 1;
	    int temp = L[0];
	    while (c < L.length - i){
		if (temp > L[c]){
		    L[c-1] = L[c];
		    L[c] = temp;
		    c++;
		}
		else{
		    temp = L[c];
		    c++;
		}
	    }
	}
    }

}