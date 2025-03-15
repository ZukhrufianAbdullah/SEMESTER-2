public class HitungNilai {

    // Divide and Conquer untuk mencari nilai maksimum
    public static int maxDC(int[] arr, int l, int r) {
        if (l == r) {
            return arr[l];
        }
        int mid = (l + r) / 2;
        int leftMax = maxDC(arr, l, mid);
        int rightMax = maxDC(arr, mid + 1, r);
        return Math.max(leftMax, rightMax);
    }

    // Divide and Conquer untuk mencari nilai minimum
    public static int minDC(int[] arr, int l, int r) {
        if (l == r) {
            return arr[l];
        }
        int mid = (l + r) / 2;
        int leftMin = minDC(arr, l, mid);
        int rightMin = minDC(arr, mid + 1, r);
        return Math.min(leftMin, rightMin);
    }

    // Brute Force untuk menghitung rata-rata nilai UAS
    public static double averageBF(int[] arr) {
        int total = 0;
        for (int nilai : arr) {
            total += nilai;
        }
        return (double) total / arr.length;
    }
}