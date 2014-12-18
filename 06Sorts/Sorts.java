import java.util.*;
public class Sorts{

    public static void main(String[] args){
	Random r = new Random();
	int[] x  = new int[100];
	for (int i = 0; i < x.length; i++){
	    x[i] = r.nextInt(100);
	}
	System.out.println(printArray(x));
        insertionSort(x);
	System.out.println(printArray(x));

    }

    public static String name(){
	return "Strbik,Peter";
    }

    public static int period(){
	return 6;
    }

    public static void radix(int[] L){
	ArrayList<ArrayList<Integer>> buckets = new ArrayList<ArrayList<Integer>>(10);
	int maxDigits = 0;
	for (int i = 0; i < L.length; i++){
	    if ((int)(Math.log10(L[i])+1) > maxDigits){
		maxDigits = (int)(Math.log10(n)+1);
	    }
	}
	for (int i = 0; i < maxDigits; i++){
	}
    }
	

    public static void bubble(int[] L){
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

    public static void selection(int[] L){
	for (int i = 0; i < L.length; i++){
	    int pos = i;
	    int small = L[i];
	    int indexSwitch = i;
	    for (int j = i+1; j < L.length; j++){
		if (L[j] < small){
		    small = L[j];
		    indexSwitch = j;
		}
	    }
	    L[indexSwitch] = L[i];
	    L[i] = small;
	}   
    }

    public static void insertion(int[] L){
        for (int i = 0; i < L.length; i++){
	    int temp = L[i];
	    int pos = i;
	    while(pos > 0 && temp < L[pos - 1]){
		L[pos] = L[pos - 1];
		pos--;
	    }
	    L[pos] = temp;
	}
    }

    public static String printArray(int[] x){
	String res = "[ ";
	for (int i = 0; i < x.length; i++){
	    res += x[i] + " ";
	}
	res += "]";
	return res;
    }

}
