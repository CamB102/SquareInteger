package algorithmday1;

public class OddTimesAppearNum {

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 100, 400, 15, 15,
        		15, 15, 15, 15, 15, 15};

        findOddTimesAppearNum(arr);
        System.out.println("On");
    }

    public static void findOddTimesAppearNum(Integer[] arr) {
        int maxNum = getMaxNum(arr);
        int[] countArray = new int[maxNum + 1];

        for (int num : arr) {
            countArray[num]++;
        }

        for (int num : arr) {
            if (countArray[num] % 2 == 1) {
                System.out.println("Number " + num + " appears " + countArray[num] + " times");
            }
        }
    }

    private static int getMaxNum(Integer[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
