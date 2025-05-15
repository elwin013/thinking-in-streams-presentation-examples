package pl.net.banach;

/**
 * Who does not have the mythical Util class let cast the first stone! ;-)
 */
public interface Util {
    static boolean isPalindrome(String word) {
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {return false;}
        }
        return true;
    }

    static int getNoOfProcessors() {
        return Runtime.getRuntime().availableProcessors();
    }
}
