import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);

        int mSatir, mSutun, i, j;

	    System.out.print("Matrisin Satır Sayısı : ");
        mSatir = input.nextInt();
        System.out.print("Matrisin Sütun Sayısı : ");
        mSutun = input.nextInt();

        int [][] matrix = new int[mSatir][mSutun];

        System.out.print("Matrisin elemanlarını girin : ");
        for (i =0; i < mSatir; i++){
            for (j =0; j < mSutun; j++){
                matrix[i][j] = input.nextInt();
            }
        }

        int [][] ters = new int[mSutun][mSatir];
        for (i =0; i < mSatir; i++){
            for (j =0; j < mSutun; j++){
                ters[j][i] = matrix[i][j];
            }
        }

        System.out.println("Matris : ");
        for (i =0; i < mSatir; i++){
            for (j =0; j < mSutun; j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.print("\n");
        }

        System.out.println("Matrisin tersi : ");
        for (i = 0; i < mSutun; i++)
        {
            for (j = 0; j < mSatir; j++){
                System.out.print(ters[i][j]+"\t");
            }
            System.out.print("\n");
        }
    }
}
