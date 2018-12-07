import java.util.Scanner;

public class addValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numberArray = new int[10];
        int choice = -1;
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Add value into array");
            System.out.println("2. See array");
            System.out.println("0. Exit");
            System.out.println("Enter choice:");
            choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    addValueThroughIndex(numberArray);
                    break;
                case 2:
                    seeValue(numberArray);
                    break;
            }
        }

    }

    private static void addValueThroughIndex(int[] array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value:");
        int val = sc.nextInt();

        System.out.println("Enter index of value you want to add:");
        int index = sc.nextInt();

        if (index < 0 && index >= array.length) {
            System.out.println("Index is not valid");
        } else {
            array[index] = val;
        }
    }

    private static void seeValue(int[] array) {
        for (int i1 : array) {
            System.out.print(i1 + "\t");
        }
    }
}
