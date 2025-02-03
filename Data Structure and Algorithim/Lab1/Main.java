public class Main {
    public static void main(String[] args) {
        System.out.println("hello, world!");

        Lab1 lab = new Lab1();

        int[] numbers = { 5, 9, 3, 12, 7, 3, 11, 5 };

        // Output array in order using a while loop
        int i = 0;
        while (i < numbers.length) {
            System.out.print(numbers[i] + " ");
            i++;
        }
        System.out.println();

        // Output array in reverse using a for loop
        for (i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Output first and last values
        System.out.println("First value: " + numbers[0]);
        System.out.println("Last value: " + numbers[numbers.length - 1]);

        // Calling Lab1 methods
        System.out.println("Max(5,9): " + lab.max(5, 9));
        System.out.println("Min(5,9): " + lab.min(5, 9));
        System.out.println("Sum: " + lab.sum(numbers));
        System.out.println("Average: " + lab.average(numbers));
        System.out.println("Max in array: " + lab.max(numbers));
        System.out.println("Min in array: " + lab.min(numbers));
    }
}

// Add all of the methods here
class Lab1 {
    public int increment(int num) {
        return ++num;
    }

    public int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public int min(int a, int b) {
        return (a < b) ? a : b;
    }

    public int sum(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

    public double average(int[] nums) {
        return (double) sum(nums) / nums.length;
    }

    public int max(int[] nums) {
        int max = nums[0];
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public int min(int[] nums) {
        int min = nums[0];
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}
