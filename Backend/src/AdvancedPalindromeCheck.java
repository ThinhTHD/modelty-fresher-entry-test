import java.text.Normalizer;

public class AdvancedPalindromeCheck {
    public static void main(String[] args)
    {
        String testCase1="A man,a plan,a canal,Panamá";
        System.out.println("Test Case 1: "+testCase1);
        System.out.println("Is palindrome :"+isPalindrome(testCase1));

    }

    public static boolean isPalindrome(String s)
    {
        // Normalize the string: decompose characters and remove diacritics
        String normalized = Normalizer.normalize(s,Normalizer.Form.NFD)
                                      .replaceAll("\\p{M}","")
                                      .toLowerCase();
        StringBuilder cleaned=new StringBuilder();
        for (char c:normalized
                .toLowerCase()
                .toCharArray())
        {
            if (Character.isLetterOrDigit(c))
            {
                cleaned.append(c);
            }
        }
        String cleanedString = cleaned.toString();
        String reversed = cleaned
                .reverse()
                .toString();
        return cleanedString.equals(reversed);
    }
}
