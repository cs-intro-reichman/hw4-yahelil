public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));    
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        StringBuilder string = new StringBuilder(str);
        for (int i = 0; i<str.length(); i++){
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z'){
                string.setCharAt(i, (char) (c+32));
            }
        }
        return string.toString();
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return false; // Handle null input gracefully
        }
    
        int len1 = str1.length();
        int len2 = str2.length();
    
        // If str2 is longer than str1, it can't be a substring
        if (len2 > len1) {
            return false;
        }
    
        // Check for str2 in str1
        for (int i = 0; i <= len1 - len2; i++) {
            int j;
            for (j = 0; j < len2; j++) {
                if (str1.charAt(i + j) != str2.charAt(j)) {
                    break;
                }
            }
            if (j == len2) {
                return true;
            }
        }
    
        return false;
    }
}
