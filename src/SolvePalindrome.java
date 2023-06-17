public class SolvePalindrome {

    public static String solution(String S){
        int len = S.length();
        char[] palindrome = S.toCharArray();

        for (int i = 0; i < len / 2; i++){
            char leftChar = palindrome[i];
            char rightChar = palindrome[len - i - 1];

            if (leftChar == '?' && rightChar == '?'){
                palindrome[i] = 'a';
                palindrome[len - i - 1] = 'a';
            } else if (leftChar == '?'){
                palindrome[i] = rightChar;
            } else if (rightChar == '?'){
                palindrome[len - i - 1] = leftChar;
            } else if (leftChar != rightChar){
                return "NO";
            }

        }
        return new String(palindrome);
    }

}