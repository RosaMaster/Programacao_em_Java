
public class exercicio12 {

	public static void main(String[] args) {
		/* Funções com string */
		
		String original = "abcde FGHIJ ABC abc DEFG    ";
		
		String textoLower = original.toLowerCase();
		String textoUpper = original.toUpperCase();
		String textoTrim = original.trim();
		String textoSubString = original.substring(2);
		String textoSubString2 = original.substring(2, 9);
		String textoReplace = original.replace('a', 'x');
		String textoReplace2 = original.replace("abc", "xy");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase(): -" + textoLower + "-");
		System.out.println("toUpperCase(): -" + textoUpper + "-");
		System.out.println("trim(): -" + textoTrim + "-");
		System.out.println("substring(2): -" + textoSubString + "-");
		System.out.println("substring(2, 9): -" + textoSubString2 + "-");
		System.out.println("replace('a', 'x'): -" + textoReplace + "-");
		System.out.println("replace('abc', 'xy'): -" + textoReplace2 + "-");
		System.out.println("indexOf(\"bc\"): -" + i + "-");
		System.out.println("lastIndexOf(\"bc\"): -" + j + "-");
		
		String stexto = "potato apple lemon";
		String[] vect = stexto.split(" ");
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];
		
		
		System.out.println(word1);
		System.out.println(word2);
		System.out.println(word3);
	}

}
