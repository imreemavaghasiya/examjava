public class array {
    public static void main(String[] args) {
        InnerArray ia = new InnerArray();
        ia.getter();
    }
}

class InnerArray {
    int ary[] = { 20, 30, 40, 72, 45, 22, 1, 500 };
    int max = ary[0];
    int min = ary[0];
    int i;

    void getter() {
        for (int i = 1; i < ary.length; i++) {
            if (ary[i] > max) {
                max = ary[i];
            }

            if (ary[i] < min) {
                min = ary[i];
            }
        }
        System.out.println("Maximun Value is : " + max);
        System.out.println("Minimum Value Is : " + min);
    }
}