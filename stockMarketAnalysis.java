
public class stockMarketAnalysis {

	public static void main(String[]args) {
		
		readFile r = new readFile();
		r.makeArray();
//		r.printArray();
		
		formulas f = new formulas();
		f.createValues(r.getArray());
		f.printArray();
	}
}
