public class Array {
    public static void main(String[] args) {
        int[] a = {5, 4, 3, 2, 1};
        System.out.print("printArray(a): ");
        print(a);
        System.out.print("print sorted array: ");
        sort();
        System.out.print("search for 3: ");
        search();
        System.out.println("generic array: ");
        generic();
    }

    public static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void sort() {
        int[] a = {5, 4, 3, 2, 1};
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void search() {
        int[] a = {5, 4, 3, 2, 1};
        int key = 3;
        int index = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                index = i;
                break;
            }
        }
        System.out.println(index);
    }

    public static void generic() {
        Object[] a = new Object[5];
        a[0] = "Hello";
        a[1] = 5;
        a[2] = 3.14;
        a[3] = true;
        a[4] = new int[5];
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

}
