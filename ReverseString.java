class ReverseString {

    public static void main(String[] args) {
        String str = "Ashutosh", revstr = "";
        char ch;

        System.out.println("Before Reversing : Ashutosh");
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i); // extracts each character
            revstr = ch + revstr; // adds each character in front of the existing string
        }
        System.out.println("Reversed String is : " + revstr);
    }
}
