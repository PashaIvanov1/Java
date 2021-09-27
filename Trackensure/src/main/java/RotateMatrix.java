public class RotateMatrix {

    static int count = 3;

    public static void main(String[] args) {
        int arr[][] = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        System.out.println("Before rotate");
        print(arr);

        solve(arr);
        
        System.out.println("After rotate");
        print(arr);
    }

    static void solve(int m[][]) {
        for (int i = 0; i < count / 2; i++) {
            for (int j = i; j < count - i - 1; j++) {
                int temp = m[i][j]; //Element at first index (leftmost corner top)= 1. левый угол
                m[i][j] = m[count - 1 - j][i]; //Rightmost corner top Element = 3. правый угол
                m[count - 1 - j][i] = m[count - 1 - i][count - 1 - j]; //Rightmost corner bottom element = 9.
                m[count - 1 - i][count - 1 - j] = m[j][count - 1 - i];
                m[j][count - 1 - i] = temp;
            }
        }
    }

    static void print(int arr[][]) {
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}