class Helper {
    static int Multiply(int a, int b) {
        return a * b;
    }

    static double Multiply(double a, double b) {
        return a * b;
    }
}

class X {
    public static void main(String[] args) {
        System.out.println(Helper.Multiply(1, 2));
        System.out.println(Helper.Multiply(1.5, 2.25));
    }
}