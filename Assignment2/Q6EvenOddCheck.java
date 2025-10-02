class Q6EvenOddCheck {

   
    static void findEvenOdd(int[] arr) {
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++; 
            } else {
                oddCount++;   
            }
        }


        System.out.println("Even: " + evenCount + ", Odd: " + oddCount);
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6};
        int[] array2 = {2, 4, 6, 8};

        System.out.print("Input 1 ");
        findEvenOdd(array1); 
        System.out.print("Input 2  ");
        findEvenOdd(array2); 
    }
}
