import java.util.*;
import java.io.*;
public class SaleAnalysis {
	public static void main(String[] args) throws IOException{
		File inputFile = new File("SalesData.txt");
		Scanner scanFile = new Scanner(inputFile);
		int weekNumber = 1;
		double lowest = 100000;
		double highest = 0;
		int low = 0;
		int high = 0;
		double totalSales = 0; //total of all week's sales
		double averageWeekly = 0; //average weekly sales
		while(scanFile.hasNextLine()) {
			String line = scanFile.nextLine();
			String[] sales = line.split(",");
			//calculating the sales for each week
			double weekSales = 0;
			double weekAverage = 0;
			for(int i = 0; i < sales.length; i++) {
				weekSales += Double.parseDouble(sales[i]); //calculating the total num of sales
				weekAverage = weekSales / 7;
			}
			if(weekSales > highest) {
				highest = weekSales;
				high = weekNumber;
			}
			if(weekSales < lowest) {
				lowest = weekSales;
				low = weekNumber;
			}
			totalSales += weekSales;
			averageWeekly = totalSales / 3;
			System.out.print("The sales for week " + weekNumber + " are ");
			System.out.printf("$%,.2f.\n", weekSales);
			System.out.print("The average sales for week " + weekNumber + " are ");
			System.out.printf("$%,.2f.\n", weekAverage);
			weekNumber += 1;
		}
		
		System.out.println("\n---------------------------------------------------");
		System.out.print("The total sales for all the weeks is ");
		System.out.printf("$%,.2f.\n", totalSales);
		System.out.print("The average weekly sales are ");
		System.out.printf("$%,.2f.\n", averageWeekly);
		System.out.println("\n---------------------------------------------------");
		System.out.println("The week with the highest sales was week number " + high + ".");
		System.out.println("The week with the lowest sales was week number " + low + ".");
		scanFile.close();
	}
}