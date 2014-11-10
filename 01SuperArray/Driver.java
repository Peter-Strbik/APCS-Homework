public class Driver{
    public static void main(String[] args){
	Integer x = new Integer(5);
	SuperArray L = new SuperArray();
	L.add(x);
	L.add(new Integer(99));
	System.out.println(L);
	L.add(new String("HEY"));
	System.out.println(L);
	L.resize(3);
	L.add(new Integer(1234));
	System.out.println(L);
	L.add(1, new String("Yumm."));
	System.out.println(L);
	System.out.println(L.size());
	L.add(new Integer(9999999));
	System.out.println(L);
	L.add(new String("ITS OVER"));
	L.add(new Integer(9000));
	System.out.println(L);
	L.remove(3);
	System.out.println(L);
	L.set(2, new String("Bacon."));
	System.out.println(L);
    }
}
