public class Exemplo {
    
    public static void main(String[] args) {
        for (int i = 0; i <= 9; i++) {
            if (i == 7) {
                // break;
                continue;
            }
            System.out.printf("%d x 7 = %d\n", i, i * 7);
        }
    }

}
