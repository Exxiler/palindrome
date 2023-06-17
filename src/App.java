public class App {
    public static void main(String[] args) throws Exception {
        
        String s1 = "?ab??a";
        String s2 = "bab??a";
        String s3 = "?a?";

        System.out.println(SolvePalindrome.solution(s1));
        System.out.println(SolvePalindrome.solution(s2));
        System.out.println(SolvePalindrome.solution(s3));

    }
}
