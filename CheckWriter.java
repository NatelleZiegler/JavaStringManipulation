import java.util.*;
public class CheckWriter {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a date: ");
		String date = scan.nextLine();
		System.out.print("Enter the payee's name: ");
		String payee = scan.nextLine();
		System.out.print("Enter the amount of the check: $");
		String checkAmount = scan.nextLine();
		while(Double.parseDouble(checkAmount) < 0) {
			System.out.println("You cannot write a check for less than $0.");
			System.out.print("Enter the amount of the check: $");
			checkAmount = scan.nextLine();
		}
		int place = 0;
		char number;
		boolean thousandPlace = false;
		boolean hundredPlace = false;
		boolean tenthPlace = false;
		int length = checkAmount.length();
		String writtenAmount = "";
		if((place + 1) < length) {
			//writing the thousandth's place
			if((Double.parseDouble(checkAmount) / 1000) >= 1) {
				number = checkAmount.charAt(place);
				thousandPlace = true;
				place += 1;
				switch(number) {
					case '1':
						writtenAmount += "One thousand ";
					break;
					case '2':
						writtenAmount += "Two thousand ";
					break;
					case '3':
						writtenAmount += "Three thousand ";
					break;
					case '4':
						writtenAmount += "Four thousand ";
					break;
					case '5':
						writtenAmount += "Five thousand ";
					break;
					case '6':
						writtenAmount += "Six thousand ";
					break;
					case '7':
						writtenAmount += "Seven thousand ";
					break;
					case '8':
						writtenAmount += "Eight thousand ";
					break;
					case '9':
						writtenAmount += "Nine thousand ";
					break;
				}
			}
		}
		
		if((place + 1) < length) {
			//writing the hundredth's place
			if((Double.parseDouble(checkAmount) / 100) >= 1) {
				number = checkAmount.charAt(place);
				hundredPlace = true;
				place += 1;
				switch(number) {
					case '1':
						if(thousandPlace) {
							writtenAmount += "one hundred ";
						}
						else {
							writtenAmount += "One hundred ";
						}
					break;
					case '2':
						if(thousandPlace) {
							writtenAmount += "two hundred ";
						}
						else {
							writtenAmount += "Two hundred ";
						}
					break;
					case '3':
						if(thousandPlace) {
							writtenAmount += "three hundred ";
						}
						else {
							writtenAmount += "Three hundred ";
						}
					break;
					case '4':
						if(thousandPlace) {
							writtenAmount += "four hundred ";
						}
						else {
							writtenAmount += "Four hundred ";
						}
					break;
					case '5':
						if(thousandPlace) {
							writtenAmount += "five hundred ";
						}
						else {
							writtenAmount += "Five hundred ";
						}
					break;
					case '6':
						if(thousandPlace) {
							writtenAmount += "six hundred ";
						}
						else {
							writtenAmount += "Six hundred ";
						}
					break;
					case '7':
						if(thousandPlace) {
							writtenAmount += "seven hundred ";
						}
						else {
							writtenAmount += "Seven hundred ";
						}
					break;
					case '8':
						if(thousandPlace) {
							writtenAmount += "eight hundred ";
						}
						else {
							writtenAmount += "Eight hundred ";
						}
					break;
					case '9':
						if(thousandPlace) {
							writtenAmount += "nine hundred ";
						}
						else {
							writtenAmount += "Nine hundred ";
						}
					break;
				}
			}
		}
		
		if((place + 1) < length) {
			//writing the tenth's place
			if((Double.parseDouble(checkAmount) / 10) >= 1) {
				number = checkAmount.charAt(place);
				tenthPlace = true;
				place += 1;
				switch(number) {
					case '1':
						if(thousandPlace || hundredPlace) {
							number = checkAmount.charAt(place);
							switch(number) {
								case '0':
									writtenAmount += "ten ";
								break;
								case '1':
									writtenAmount += "eleven ";
								break;
								case '2':
									writtenAmount += "twelve ";
								break;
								case '3':
									writtenAmount += "thirteen ";
								break;
								case '4':
									writtenAmount += "fourteen ";
								break;
								case '5':
									writtenAmount += "fifteen ";
								break;
								case '6':
									writtenAmount += "sixteen ";
								break;
								case '7':
									writtenAmount += "seventeen ";
								break;
								case '8':
									writtenAmount += "eighteen ";
								break;
								case '9':
									writtenAmount += "nineteen ";
								break;
							}
						}
						else {
							number = checkAmount.charAt(place);
							switch(number) {
								case '0':
									writtenAmount += "Ten ";
								break;
								case '1':
									writtenAmount += "Eleven ";
								break;
								case '2':
									writtenAmount += "Twelve ";
								break;
								case '3':
									writtenAmount += "Thirteen ";
								break;
								case '4':
									writtenAmount += "Fourteen ";
								break;
								case '5':
									writtenAmount += "Fifteen ";
								break;
								case '6':
									writtenAmount += "Sixteen ";
								break;
								case '7':
									writtenAmount += "Seventeen ";
								break;
								case '8':
									writtenAmount += "Eighteen ";
								break;
								case '9':
									writtenAmount += "Nineteen ";
								break;
							}
						}
						break;
						case '2':
							if(thousandPlace || hundredPlace) {
								writtenAmount += "twenty ";
							}
							else {
								writtenAmount += "Twenty ";
							}
						break;
						case '3':
							if(thousandPlace || hundredPlace) {
								writtenAmount += "thirty ";
							}
							else {
								writtenAmount += "Thirty ";
							}
						break;
						case '4':
							if(thousandPlace || hundredPlace) {
								writtenAmount += "forty ";
							}
							else {
								writtenAmount += "Forty ";
							}
						break;
						case '5':
							if(thousandPlace || hundredPlace) {
								writtenAmount += "fifty ";
							}
							else {
								writtenAmount += "Fifty ";
							}
						break;
						case '6':
							if(thousandPlace || hundredPlace) {
								writtenAmount += "sixty ";
							}
							else {
								writtenAmount += "Sixty ";
							}
						break;
						case '7':
							if(thousandPlace || hundredPlace) {
								writtenAmount += "seventy ";
							}
							else {
								writtenAmount += "Seventy ";
							}
						break;
						case '8':
							if(thousandPlace || hundredPlace) {
								writtenAmount += "eighty ";
							}
							else {
								writtenAmount += "Eighty ";
							}
						break;
						case '9':
							if(thousandPlace || hundredPlace) {
								writtenAmount += "ninety ";
							}
							else {
								writtenAmount += "Ninety ";
							}
						break;
					}
				}
			}
		
		if((place + 1) < length) {
			//writing the one's place
			if(checkAmount.charAt(place) != 0 && checkAmount.charAt(place - 1) != '1') {
				number = checkAmount.charAt(place);
				place += 1;
				switch(number) {
					case '2':
						if(thousandPlace || hundredPlace || tenthPlace) {
							writtenAmount += "two ";
						}
						else {
							writtenAmount += "Two ";
						}
					break;
					case '3':
						if(thousandPlace || hundredPlace || tenthPlace) {
							writtenAmount += "three ";
						}
						else {
							writtenAmount += "Three ";
						}
					break;
					case '4':
						if(thousandPlace || hundredPlace || tenthPlace) {
							writtenAmount += "four ";
						}
						else {
							writtenAmount += "Four ";
						}
					break;
					case '5':
						if(thousandPlace || hundredPlace || tenthPlace) {
							writtenAmount += "five ";
						}
						else {
							writtenAmount += "Five ";
						}
					break;
					case '6':
						if(thousandPlace || hundredPlace || tenthPlace) {
							writtenAmount += "six ";
						}
						else {
							writtenAmount += "Six ";
						}
					break;
					case '7':
						if(thousandPlace || hundredPlace || tenthPlace) {
							writtenAmount += "seven ";
						}
						else {
							writtenAmount += "Seven ";
						}
					break;
					case '8':
						if(thousandPlace || hundredPlace || tenthPlace) {
							writtenAmount += "eight ";
						}
						else {
							writtenAmount += "Eight ";
						}
					break;
					case '9':
						if(thousandPlace || hundredPlace || tenthPlace) {
							writtenAmount += "nine ";
						}
						else {
							writtenAmount += "Nine ";
						}
					break;
				}
			}
		}
		
		if((place + 1) < length) {
			if(checkAmount.charAt(place) == '.') {
				writtenAmount += "and " + checkAmount.charAt(place + 1) + checkAmount.charAt(place + 2) + " cents";
			}
			else {
				writtenAmount += "and 0 cents";
			}
		}
		
		System.out.println();
		System.out.println("\t\t\t\t\tDate:  " + date);
		System.out.print("Pay to the Order of:  " + payee);
		System.out.println("\t\t\t$" + checkAmount);
		System.out.println(writtenAmount);
	}
}