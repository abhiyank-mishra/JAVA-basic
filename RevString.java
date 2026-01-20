public class RevString {
    
    public String reverse(String str) {
        String emptString = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            emptString = emptString + str.charAt(i);
        }
        return emptString;
    }

    public String revWorld(String str) {
        String temp = "";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                temp = temp + str.charAt(i);
            } else {
                result = temp + " " + result;
                temp = "";
            }
        }
        result = temp + " " + result;

        return result.trim();
    }
    
}
