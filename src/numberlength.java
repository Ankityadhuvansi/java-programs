public class numberlength {
    static int digits2(int num) {
        if (num < 0) {
            num = num * -1;
        }
        return (int) (Math.log10 (num)) + 1;
    }
}
