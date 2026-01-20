class Digital {

    public static int des(String str) {
    int num = 0;
    int power = 0;

    for (int i = str.length() - 1; i >= 0; i--) {
        if (str.charAt(i) == '1') {
            num = num + (int) Math.pow(2, power);
        }
        power++;
    }
    return num;
}


    public String bin(int num) {
        String binary = "";
        while (num > 0) {
            int rem = num % 2;
            binary = rem + binary;
            num = num / 2;
        }
        return binary;
    }

    public String Oct(int num) {
        String bin = "";
        while (num > 0) {
            int rem = num % 8;
            bin = rem + bin;
            num = num / 8;
        }
        return bin;
    }

    public String hex(int num) {
        String bin = "";
        while (num > 0) {
            int rem = num % 16;
            if (rem < 10) {
                bin = rem + bin;
            } else {
                bin = (char) ('A' + (rem - 10)) + bin;
            }
            num = num / 16;
        }
        return bin;
    }
}
