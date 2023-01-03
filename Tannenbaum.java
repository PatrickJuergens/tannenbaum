import java.util.Scanner;

public class Tannenbaum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Höhe der Krone eingeben:\n");
        int topHeight = scanner.nextInt();
        System.out.printf("Höhe des Stamms eingeben:\n");
        int trunkHeight = scanner.nextInt();
        int progress = 0;
        int width = topHeight * 2 -1;
        for(int i = 0; i < topHeight; i++) {
            for(int i1 = 0; i1 < width; i1++) {
                if (width / 2 - progress <= i1 && width / 2 + progress >= i1  ) {
                    System.out.print('+');
                } else {
                    System.out.print('.');
                }
            }
            System.out.print("\n");
            progress++;
        }
        int trunkWeight = width / 10 >= 1 ? width / 10 : 1;
        for (int j=0; j < trunkHeight; j++) {
            for (int j1=0; j1 < width; j1++) {
                if (width / 2 - trunkWeight < j1 && width / 2 + trunkWeight > j1  ) {
                    System.out.print('+');
                } else {
                    System.out.print('.');
                }
            }
            System.out.print("\n");
        }
    }
}

