
import java.util.Scanner; //importing Scanner class for user input
/*---------- Class for Character based operation -------------*/
class StringCharacterOperation
{
	/*--- Method to count number of uppercase characters ---*/
	public static int countUpperCase(String sentence)
	{
		int upper = 0 ; // to count of uppercase character
		char character; // to fetch the character
		for(int index = 0; index < sentence.length();index++)
		{
			character = sentence.charAt(index);//extracted the character at given index
			if(character >='A' && character <= 'Z') //verifying uppercase character
			{
				upper++; //incrementing count of uppercase character
			}
		}
		//return count of uppercase character
		return upper;
	}
	
	/*--- Method to count number of lowercase characters ---*/
	public static int countLowerCase(String sentence)
	{
		int lower = 0 ; // to count of lowercase character
		char character; // to fetch the character
		for(int index = 0; index < sentence.length();index++)
		{
			character = sentence.charAt(index);//extracted the character at given index
			if(character >='a' && character <= 'z') //verifying lowercase character
			{
				lower++; //incrementing count of lowercase character
			}
		}
		//return count of lowercase character
		return lower;
	}
	
	/*--- Method for counting number of alphabets in the given string ----*/
	public static int countAlphabet(String sentence)
	{
		//number of aphabets is equal to the number of uppercase character and lowercase character
		int alphabets = countUpperCase(sentence) + countLowerCase(sentence);
		//return this count
		return alphabets;
	}
	/*--- Method for counting number of special characters in the given string ----*/
	public static int countSpecialChars(String sentence)
	{
		//special characters are the characters other than alphabets in the sentence
		int specialchar = sentence.length() - countAlphabet(sentence);
		//return this count
		return specialchar;
	}
	
	/*--- Method to count number of vowels in the given string ----*/
	public static int countVowels(String sentence)
	{
		int vowelCount = 0;
		char character;
		for(int i = 0; i < sentence.length(); i++)
		{
			character = sentence.charAt(i);
			// checking both lowercase and uppercase vowels
			if(character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' ||
			   character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U')
			{
				vowelCount++;
			}
		}
		return vowelCount;
	}
	
	/*--- Method to count number of consonants in the given string ----*/
	public static int countConsonants(String sentence)
	{
		int consonantCount = countAlphabet(sentence) - countVowels(sentence);
		return consonantCount;
	}
}
/*-------- Initial class ----------------------*/
public class StringOperation {

	public static void main(String[] args) {
		//creating object of scanner class
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any sentence : ");
		String sentence = sc.nextLine();
		
		System.out.println("------------------------------------------------------");
		System.out.println("Total Number of characters : "+sentence.length());
		//number of uppercase characters
		System.out.println("------------------------------------------------------");
		System.out.println("Total Number of uppercase characters: "+StringCharacterOperation.countUpperCase(sentence));
		//number of lowercase characters
		System.out.println("------------------------------------------------------");
		System.out.println("Total Number of lowercase characters: "+StringCharacterOperation.countLowerCase(sentence));
		//number of alphabets
		System.out.println("------------------------------------------------------");
		System.out.println("Total Number of Alphabets: "+StringCharacterOperation.countAlphabet(sentence));
		//number of special characters
		System.out.println("------------------------------------------------------");
		System.out.println("Total Number of Special characters: "+StringCharacterOperation.countSpecialChars(sentence));
		//number of vowels
		System.out.println("------------------------------------------------------");
		System.out.println("Total Number of Vowels: "+StringCharacterOperation.countVowels(sentence));
		//number of consonants
		System.out.println("------------------------------------------------------");
		System.out.println("Total Number of Consonants: "+StringCharacterOperation.countConsonants(sentence));

	}

}
