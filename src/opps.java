public class opps {
    public static void printDec(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1);
    }

    public static void printInc(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printInc(n - 1);
        System.out.print(n + " ");
    }

    public static int fact(int n) {
        if (n == 0) {
            return 1;

        }
        int fn1 = fact(n - 1);
        int fn = n * fact(n - 1);
        return fn;
    }

    public static int sum(int n) {
        if (n == 1) {
            return 1;

        }
        int nm1 = sum(n - 1);
        int su = n + sum(n - 1);
        return su;
    }

    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;

        }
        //int fnm1 = fib(n-1);
        //int fnm2 = fib(n-2);
        //int fn = fnm1 + fnm2;
        return fib(n - 1) + fib(n - 2);


    }

    public static boolean issorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return issorted(arr, i + 1);
    }

    public static int firstocc(int arr[], int key, int i) {

        if (arr[i] == key) {
            return i;
        }
        return firstocc(arr, key, i + 1);
    }

    public static int lastocc(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isfound = lastocc(arr, key, i + 1);
        if (isfound == -1 && arr[i] == key) {
            return i;

        }
        if (arr[i] == key) {
            return i;

        }
        return isfound;

    }

    public static int lastoccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isfound = lastoccurence(arr, key, i + 1);
        if (isfound != -1 && arr[i] == key) {
            return i;
        }

        return isfound;


    }

    public static int power(int x, int n) {
        if (n == 1) {
            return 1;
        }
        int pnm1 = power(x, n - 1);
        int po = x * power(x, n - 1);
        return po;
    }

    public static int poerop(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int halfpower = poerop(x, n / 2);

        int halpowersq = halfpower * poerop(x, n / 2);

        if (n % 2 != 0) {
            halpowersq = x * halpowersq;
        }
        return halpowersq;

    }

    public static void starpattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static int tilling(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }
        //   int fnm1 = tilling(n-1);

        //   int fnm2 = tilling(n-2);

        // int totways = fnm1+fnm2;
        return tilling(n - 1) + tilling(n - 2);
    }

    public static void removeduplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            removeduplicates(str, idx + 1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            removeduplicates(str, idx + 1, newStr.append(currChar), map);
        }
    }

    public static int frinendsparing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        int fnm1 = frinendsparing(n - 1);
        int fnm2 = frinendsparing(n - 2);
        int pairways = (n - 1) * fnm2;

        int totways = fnm1 + pairways;
        return totways;
    }

    public static void printbinString(int n, int lastplace, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        printbinString(n - 1, 0, str + "0");
        if (lastplace == 0) {
            printbinString(n - 1, 1, str + "1");
        }
    }

    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergesort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;
        mergesort(arr, si, mid);
        mergesort(arr, mid + 1, ei);
        merge(arr, si, mid, ei);

    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;

            }
            k++;
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }

    }

    public static void quicksort(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int pidx = patition(arr, si, ei);
        quicksort(arr, si, pidx - 1);
        quicksort(arr, pidx + 1, ei);

    }

    public static int patition(int[] arr, int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;

            }
        }
        i++;
        int temp = arr[i];
        arr[ei] = arr[i];
        arr[i] = temp;


        return pivot;
    }

    public static int search(int arr[], int tar, int si, int ei) {
        if (si > ei) {
            return -1;
        }
        int mid = si + (ei - si) / 2;

        if (arr[mid] == tar) {
            return mid;

        }
        if (arr[si] <= arr[mid]) {
            if (arr[si] <= tar && tar <= arr[mid]) {
                return search(arr, tar, si, ei);

            } else {
                search(arr, tar, mid + 1, ei);
            }

        } else {
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return search(arr, tar, mid + 1, ei);
            } else {
                return search(arr, tar, si, mid - 1);
            }

        }
        return search(arr, tar, si, mid - 1);

    }

    public static void changearr(int arr[], int i, int val) {
        //base case
        if (i == arr.length) {
            printarr1(arr);
            return;
        }
        //recursion
        arr[i] = val;
        changearr(arr, i + 1, val + 1);
        arr[i] = arr[i] - 2;

    }

    public static void printarr1(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static void findsubsets(String str, String ans, int i) {
        //base
        if (i == str.length()) {
            System.out.println(ans);
            return;
        }
        //recusion
        //yes choice

        findsubsets(str, ans + str.charAt(i), i + 1);
        findsubsets(str, ans, i + 1);
    }

    public static void permutation(String str, String ans) {
        //base case

        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String Newstr = str.substring(0, i) + str.substring(i + 1);
            permutation(Newstr, ans + curr);
        }

        //recursiom

    }

    public static boolean isSafe(char board[][], int row, int col) {
        //vertixcal up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }


        //diag left up


        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }


        //diag right up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;


    }



    public static void nqueens(char board[][], int row) {
        //base case
        if (row == board.length) {
            printBoard(board);
            return;

        }

        //column loop
        for (int j = 0; j < board.length; j++) {
            if( isSafe(board,row,j)) {


                board[row][j] = 'Q';
                nqueens(board, row + 1);//function  call
                board[row][j] = 'x';//backtracking
            }
        }
    }

    public static void printBoard(char board[][]) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';

            }
        }

    }
}

