package main;

public class StringManipulator {

    // input: ExAmPLE => output: ELPmAxE
    public String reverse(String input) {
        String reverse = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reverse += input.charAt(i);
        }

        return reverse;
    }

    // input: example => output: false
    // input: ELpmpLE => output: true
    public boolean isPalindrome(String input) {
        String sameInput = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            sameInput += input.charAt(i);
        }

        if (!input.equals(sameInput)) {
            return false;
        }

        return true;
    }

    // input: ExAmPLE, part: Ex => output: true
    // input: ExAmPLE, part: ex => output: false
    public boolean isContained(String input, String part) {
        if (!input.contains(part)) {
            return false;
        }

        return true;
    }

    // input: ExAm1PLE2 => output: ExAmPLE
    public String numberRemoved(String input) {
        String inputAfterNumberRemoved = input.replaceAll("[0-9]", "");
        return inputAfterNumberRemoved;
    }

    // input: ExAmPLE => output: EXAMPLE
    public String upperString(String input) {
        return input.toUpperCase();
    }

    // input: ExAmPLE => output: example
    public String lowerString(String input) {
        return input.toLowerCase();
    }

    // input: example string => output: Example String
    public String capitalString(String input) {
        String[] words = input.split("\\s+");
        String result = "";

        for (String w : words) {
            result += w.substring(0, 1).toUpperCase() + w.substring(1).toLowerCase() + " ";
        }

        result = result.trim();

        return result;
    }

    // input: Example => output: 3
    public int countVowels(String input) {
        int count = 0;
        input = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o'
                    || input.charAt(i) == 'u') {
                count += 1;
            }
        }

        return count;
    }

    // input: Hello, how are you? => output: 4
    public int countWords(String sentence) {
        int countWords = sentence.split("\\s+").length;

        return countWords;
    }

    // Input: input = "Java programming", substring = "programming" => Output: 5
    // Input: input = "Java programming", substring = "Programming" => Output: -1
    public int findSubstringIndex(String input, String substring) {
        int start = 0;
        boolean flag = false;

        for (int i = 0; i < input.length(); i++) {
            if (substring.startsWith(input.substring(i))) {
                start = i;
                flag = true;
                break;
            }
        }

        if (!flag) {
            return -1;
        }

        return start;
    }

    // Input: "Hello World How Are You" => Output: "You Are How World Hello"
    public String reverseWords(String sentence) {
        String[] words = sentence.split("\\b");
        String reverseSentence = "";

        for (int i = words.length - 1; i >= 0; i--) {
            reverseSentence += words[i];
        }

        return reverseSentence;
    }
}
