package com.anuj.geeksforgeeks.array.Rotations;

public class ArrayRotations {
    public static void main(String[] args) {
        ArrayRotations arrayRotations = new ArrayRotations();
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9,10,11,12};

//         Method 1
//        arrayRotations.rotateUsingTemp(arr, 2, arr.length);
//        arrayRotations.printArray(arr, arr.length);

//        Method 2
//        arrayRotations.leftRotateM2(arr, 2, arr.length);
//        arrayRotations.printArray(arr, arr.length);

//        Method 3
        arrayRotations.leftRotateM3(arr, 3, arr.length);
        arrayRotations.printArray(arr, arr.length);
    }

    // Method 1
    public void rotateUsingTemp(int[] ar, int d, int n) {
        int i;
        int[] temp = new int[d];
        for (i = 0; i < d; i++)
            temp[i] = ar[i];
        for (i = 0; i < n - d; i++)
            ar[i] = ar[i + d];
        for (int j = 0; j < d; j++, i++) {
            ar[i] = temp[j];

        }
    }


    //    Method 2
    void leftRotateM2(int arr[], int d, int n) {
        for (int i = 0; i < d; i++)
            leftRotateByOne(arr, n);
    }

    void leftRotateByOne(int arr[], int n) {
        int i, temp;
        temp = arr[0];
        for (i = 0; i < n - 1; i++)
            arr[i] = arr[i + 1];
        arr[n - 1] = temp;
    }

    //    Method 3
    /*Function to left rotate arr[] of siz n by d*/
    void leftRotateM3(int arr[], int d, int n) {
        /* To handle if d >= n */
        d = d % n;
        int i, j, k, temp;
        int g_c_d = gcd(d, n);
        for (i = 0; i < g_c_d; i++) {
            /* move i-th values of blocks */
            temp = arr[i];
            j = i;
            while (true) {
                k = j + d;
                if (k >= n)
                    k = k - n;
                if (k == i)
                    break;
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
    }

    /*Fuction to get gcd of a and b*/
    int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }

    /* utility function to print an array */
    void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }


}
