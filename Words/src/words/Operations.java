package words;

public class Operations {

	public static void print(String wordtoPrint) {

		System.out.print(wordtoPrint);
	}

	public static void print(char chartoPrint) {

		System.out.print(chartoPrint);
	}

	public static void linebreak() {

		System.out.print("\n");

	}

	public static void printString(String wordtoPrint) {

		int i = 0;
		// on i compta el n�mero de voltes.
		linebreak();
		int sizeWordtoPrint = wordtoPrint.length();
		while (i < sizeWordtoPrint) {
			print("Loop number: " + (i + 1) + " - ");
			print("letter: " + wordtoPrint.charAt(i));
			linebreak();

			i++;
		}
	}

	public static void printStringH(String wordtoPrint) {

		int i = 0;
		int sizeWordtoPrint = wordtoPrint.length();

		while (i < sizeWordtoPrint) {
			print(wordtoPrint.charAt(i));
			print(" - ");
			
			i++;
			
			
		}
	}

	public static void printStringV(String wordtoPrint) {
		int i = 0;
		int sizeWordtoPrint = wordtoPrint.length();

		while (i < sizeWordtoPrint) {
			print(wordtoPrint.charAt(i));
			linebreak();
			i++;}

		}
		
		
	public static void printStringDiagonal(String wordtoPrint) {

		int i = 0;
		int sizeWordtoPrint = wordtoPrint.length();
		
		while (i < sizeWordtoPrint ) {
			int j= 0;
			while (j < i) {
			print("*");
			j++;
			}
			print(wordtoPrint.charAt(i));
			linebreak();
			
			i++;
		}
		
			
	}
	
	
	public static void printStringBackwards(String wordtoPrint) {

		int i = wordtoPrint.length() -1;
		
		while (i > -1 ) {
			print(wordtoPrint.charAt(i));
			print("**");
			
			
			i--;
			//que equival a i-1
			
		}

}
	
}
