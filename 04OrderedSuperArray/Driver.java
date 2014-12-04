import java.util.Arrays;
public class Driver{

    public static void main(String[] args){
	SuperArray x = new SuperArray();
	x.add("apple");
	x.add("xylophone");
	x.add("life");
	x.add("tales");
	x.add("damage");
	x.add("battle");
	x.add("aaron");
	x.add("mediocre");
	x.add("jester");
	x.add("lol");
	SuperArray z = new SuperArray();
	z.add("apple");
	z.add("xylophone");
	z.add("life");
	z.add("tales");
	z.add("damage");
	z.add("battle");
	z.add("aaron");
	z.add("mediocre");
	z.add("jester");
	z.add("lol");
	System.out.println(z);
	Arrays.sort(z.YAAS);
	
	System.out.println(z);
	System.out.println(x+ "\n");
	x.insertionSort();
	System.out.println(x);
       

    }

}
