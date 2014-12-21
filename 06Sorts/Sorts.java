import java.util.*;
public class Sorts{

    public static void main(String[] args){
	Random r = new Random();
	int[] x  = new int[100000];
	for (int i = 0; i < x.length; i++){
	    x[i] = r.nextInt(100000);
	}

	long Start, End, timeTaken;
	
	int[] x1 = x.clone();
	System.out.println("Insertion:");
	Start = System.currentTimeMillis();
	insertion(x1);
	End = System.currentTimeMillis();
	timeTaken = End - Start;
	System.out.println(timeTaken + "\n");

	int[] x2 = x.clone();
	System.out.println("Selection:");
	Start = System.currentTimeMillis();
	selection(x2);
	End = System.currentTimeMillis();
	timeTaken = End - Start;
	System.out.println(timeTaken + "\n");

	int[] x3 = x.clone();
	System.out.println("Bubble:");
	Start = System.currentTimeMillis();
	bubble(x3);
        End = System.currentTimeMillis();
        timeTaken = End - Start;
	System.out.println(timeTaken + "\n");
	
	int[] x4 = x.clone();
	System.out.println("Radix:");
        Start = System.currentTimeMillis();
	radix(x4);
        End = System.currentTimeMillis();
        timeTaken = End - Start;
	System.out.println(timeTaken + "\n");

	int[] x5 = x.clone();
	System.out.println("Arrays Sort:");
        Start = System.currentTimeMillis();
	Arrays.sort(x5);
        End = System.currentTimeMillis();
        timeTaken = End - Start;
	System.out.println(timeTaken + "\n");
    }

    public static String name(){
	return "Strbik,Peter";
    }

    public static int period(){
	return 6;
    }

    public static void radix(int[] L){
	ArrayList<ArrayList<Integer>> buckets = new ArrayList<ArrayList<Integer>>();
	for (int wot = 0; wot < 10; wot++){
	    buckets.add(new ArrayList<Integer>());
	}
	
	int maxDigits = 0;
	for (int i = 0; i < L.length; i++){
	    if ((int)(Math.log10(L[i])+1) > maxDigits){
		maxDigits = (int)(Math.log10(L[i])+1);
	    }
	}
	
	for (int i = 0; i < maxDigits; i++){
	    int div =(int)(Math.pow(10, i));

	    for (int j = 0; j < L.length; j++){
	        int place = (L[j] / div) % 10;
		buckets.get(place).add(L[j]);
	    }

	    int temp = 0;
	    for (int k = 0; k < buckets.size(); k++){
		for (int m = 0; m < buckets.get(k).size(); m++){
		    L[temp] = buckets.get(k).get(m);
		    temp++;
		}
		buckets.get(k).clear();
	    }
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
