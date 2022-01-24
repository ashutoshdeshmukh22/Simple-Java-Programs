class SwapElementArray {
    public static void main(String[] args) {
        int temp, i;

        int array[] = { 10, 20, 30, 40, 50 };

        for (i = 0; i <= 5; i += 2) { // increament position by 2
            temp = array[i];
            array[i] = array[i + 1];
            array[i + 1] = temp;
        }
        System.out.println("Elements After Swapping Adjacent Elements :- ");

        for (i = 0; i <= 5; i++) {
            System.out.println(array[i]);
        }
    }
}