import java.util.*;
import java.util.ArrayList;
import java.text.SimpleDateFormat;

public class formulas {
	readFile r = new readFile();
	
	Date [] dateArray = new Date[r.findRows()];
	float [][] values = new float [r.findRows()][7];
	
	public void createDateArray(String [][] n) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		for(int i=0;i<n.length;i++)
			for(int j=0; j<n[i].length;j++) {
				if(j==0) {
					try {
						Date newDate = (Date)df.parse(n[i][0]);
						dateArray[i] = newDate;
					}
					catch(Exception e) {
						System.out.println(e);
					}
				}
			}
	}
	public void createValues(String[][] n) {
		for (int i=0; i<n.length;i++) {
			for(int j=0;j<n[i].length;j++) {
				if(j>0){
					values[i][j] = Float.parseFloat(n[i][j]);
				}else {
					values[i][j]=0;
				}
			}
		}
	}
	
	public void printArray() {
		for(int i=0; i<values.length;i++) {
			for(int j=0; j<values[i].length;j++) {
				System.out.printf("%s ", values[i][j]);
			}
			System.out.println();
		}
		
	}
}