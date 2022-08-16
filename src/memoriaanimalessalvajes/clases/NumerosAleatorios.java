package memoriaanimalessalvajes.clases;

import java.util.Random;


public class NumerosAleatorios {

    Random ran;

    public int[][] matrizNumeros(int row, int column, int pares) {
        ran = new Random();
        int mat[][] = new int[row][column];
        int acumulador = 0;
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < column; j++)
            {
                mat[i][j] = 0;

            }
        }

        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < column; j++)
            {
                mat[i][j] = ran.nextInt(pares) + 1;

                do
                {
                    acumulador = 0;
                    for (int k = 0; k < row; k++)
                    {
                        for (int l = 0; l < column; l++)
                        {
                            if (mat[i][j] == mat[k][l])
                            {
                                acumulador += 1;
                            }
                        }
                    }

                    if (acumulador == 3)
                    {
                        mat[i][j] = ran.nextInt(pares) + 1;
                    }
                } while (acumulador == 3);
            }
        }
        return mat;

    }
}
