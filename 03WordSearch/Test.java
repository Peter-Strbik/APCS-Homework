public class Test{
    public static void main(String[] args){
	WordGrid g = new WordGrid(12, 12);
	System.out.println(g);
	g.addWordHorizontal("AMAZING", 3, 4);
	g.addWordHorizontal("HELLO", 7, 6);
	System.out.println(g);
	g.addWordHorizontal("WHAT", 3, 4);
	System.out.println(g);
	g.addWordHorizontal("WHAT", 8, 8);
	System.out.println(g);
	g.addWordVertical("COMPSCI", 3, 1);
	System.out.println(g);
	g.addWordVertical("SHREKD", 4, 7);
	System.out.println(g);
    }
}
