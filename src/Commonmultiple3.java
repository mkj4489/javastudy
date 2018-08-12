public class Commonmultiple3 {
    public static void main(String[] args) {
        // ２と３の公倍数以外の数字を表示する
        int i = 1;
        while (i < 100) {
            if (!((i % 2 == 0) && (i % 3 == 0))) {
                System.out.println(i);
            }
            i++;
        }
    }
}
