public class Week4 {

    /**
     * So lon nhat.
     */
    public static int max2Int(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    /**
     * So be nhat.
     */
    public static int minArray(int[] a) {
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }

    /**
     * Chi so BMI.
     */
    public static String calculateBMI(double weight, double height) {
        double BMI = weight / (height * height);
        System.out.println(BMI);
        BMI = Math.round(BMI * 10) / 10.0;
        System.out.println(BMI);
        if (BMI < 18.5) {
            return "Thiếu cân";
        } else if (BMI >= 18.5 && BMI <= 22.9) {
            return "Bình thường";
        } else if (BMI >= 23 && BMI <= 24.9) {
            return "Thừa cân";
        } else {
            return "Béo phì";
        }
    }

    public static void main(String[] args) {
        System.out.println(calculateBMI(60, 1.7));
    }
}
