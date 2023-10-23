import java.util.Scanner;

class JaggedArray {
    int ja[][] = new int[3][];

    void takeInput() {
        ja[0] = new int[5];
        ja[1] = new int[3];
        ja[2] = new int[4];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + (ja[0].length + ja[1].length + ja[2].length) + " numbers");

        for (int i = 0; i < ja.length; i++) {
            for (int j = 0; j < ja[i].length; j++) {
                ja[i][j] = sc.nextInt();
            }
        }
    }

    void showOutput() {
        System.out.println("\nOutput Array is...");
        for (int i = 0; i < ja.length; i++) {
            for (int j = 0; j < ja[i].length; j++) {
                System.out.print(ja[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String ar[]) {
        JaggedArray jd = new JaggedArray();
        jd.takeInput();
        jd.showOutput();
    }
}
