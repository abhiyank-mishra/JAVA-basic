public class Safety {
    
    public String encrypt(String str) {
        String string = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            string = string + (char) (str.charAt(i) + 1);
        }
        return string;
    }

    public String decrypt(String str) {
        String string = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            string = string + (char) (str.charAt(i) - 1);
        }
        return string;
    }
}
