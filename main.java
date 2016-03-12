public class main {
    private static String[][] table;
    private static String[][] table2;
    public static void main(String[] args) {
        table = new String[21][19];
        table2 = new String[9][15];


        /*       *********     */
        table[0][0] = "|    1|";
        table[0][1] = "       ";
        table[0][2] = "       ";
        table[0][3] = "       ";
        table[0][4] = "       ";
        table[0][5] = "       ";
        table[0][6] = "       ";
        table[0][7] = "       ";
        table[0][8] = "       ";
        table[0][9] = "       ";
        table[0][10] = "       ";
        table[0][11] = "       ";
        table[0][12] = "      ";
        table[0][13] = "   ";
        table[0][14] = "   ";
        table[0][15] = "   ";
        table[0][16] = "   ";
        table[0][17] = "|    2|";
        table[0][18] = "";
        /*  radif aval jadval  */
        table[1][0] = "|  H  |";
        table[1][1] = "       ";
        table[1][2] = "       ";
        table[1][3] = "               Periodic Table   ";
        table[1][4] = "   ";
        table[1][5] = "   ";
        table[1][6] = "   ";
        table[1][7] = "   ";
        table[1][8] = "   ";
        table[1][9] = "    ";
        table[1][10] = "     ";
        table[1][11] = "       ";
        table[1][12] = "      ";
        table[1][13] = "   ";
        table[1][14] = "   ";
        table[1][15] = "   ";
        table[1][16] = "   ";
        table[1][17] = "|  He |";
        table[1][18] = "";
        /*   ******** */
        table[2][0] = "|1.007|";
        table[2][1] = "       ";
        table[2][2] = "       ";
        table[2][3] = "       ";
        table[2][4] = "       ";
        table[2][5] = "       ";
        table[2][6] = "       ";
        table[2][7] = "       ";
        table[2][8] = "       ";
        table[2][9] = "       ";
        table[2][10] = "       ";
        table[2][11] = "       ";
        table[2][12] = "      ";
        table[2][13] = "   ";
        table[2][14] = "   ";
        table[2][15] = "   ";
        table[2][16] = "   ";
        table[2][17] = "|4.002|";
        table[2][18] = "_____________                                                           _____________________________________"+"\n";
        /*  radif 2vom jadval  */
        table[3][0] = "|   3 |";
        table[3][1] = "    4|";
        table[3][2] = "       ";
        table[3][3] = "       ";
        table[3][4] = "       ";
        table[3][5] = "       ";
        table[3][6] = "       ";
        table[3][7] = "      ";
        table[3][8] = "      ";
        table[3][9] = "      ";
        table[3][10] = "   ";
        table[3][11] = "   ";
        table[3][12] = "|  5  |";
        table[3][13] = "    6|";
        table[3][14] = "    7|";
        table[3][15] = "    8|";
        table[3][16] = "    9|";
        table[3][17] = "   10|";
        table[3][18] = "";
        /* **************** */
        table[4][0] = "| Li  |";
        table[4][1] = "  Be |";
        table[4][2] = "       ";
        table[4][3] = "                    of the    ";
        table[4][4] = "   ";
        table[4][5] = "  ";
        table[4][6] = "   ";
        table[4][7] = "  ";
        table[4][8] = "   ";
        table[4][9] = "   ";
        table[4][10] = "   ";
        table[4][11] = "   ";
        table[4][12] = "| B   |";
        table[4][13] = "  C  |";
        table[4][14] = "  N  |";
        table[4][15] = "  O  |";
        table[4][16] = "   F |";
        table[4][17] = "   Ne|";
        table[4][18] = "";
        /*                */
        table[5][0] = "|6.941|";
        table[5][1] = "9.012|";
        table[5][2] = "       ";
        table[5][3] = "       ";
        table[5][4] = "       ";
        table[5][5] = "       ";
        table[5][6] = "       ";
        table[5][7] = "      ";
        table[5][8] = "      ";
        table[5][9] = "      ";
        table[5][10] = "   ";
        table[5][11] = "   ";
        table[5][12] = "|10.81|";
        table[5][13] = "12.01|";
        table[5][14] = "14.00|";
        table[5][15] = "15.99|";
        table[5][16] = "18.99|";
        table[5][17] = "20.18|";
        table[5][18] = "_____________                                                           _____________________________________"+"\n";

        /*  radif 3vom jadval  */
        table[6][0] = "|   11|";
        table[6][1] = "   12|";
        table[6][2] = "       ";
        table[6][3] = "       ";
        table[6][4] = "       ";
        table[6][5] = "       ";
        table[6][6] = "       ";
        table[6][7] = "      ";
        table[6][8] = "      ";
        table[6][9] = "      ";
        table[6][10] = "   ";
        table[6][11] = "   ";
        table[6][12] = "|   13|";
        table[6][13] = "   14|";
        table[6][14] = "   15|";
        table[6][15] = "   16|";
        table[6][16] = "   17|";
        table[6][17] = "   18|";
        table[6][18] = "";

        /*                 */
        table[7][0] = "|  Na |";
        table[7][1] = "  Mg |";
        table[7][2] = "       ";
        table[7][3] = "                   Elements   ";
        table[7][4] = "  ";
        table[7][5] = "   ";
        table[7][6] = "   ";
        table[7][7] = "   ";
        table[7][8] = "   ";
        table[7][9] = "   ";
        table[7][10] = "  ";
        table[7][11] = "   ";
        table[7][12] = "|  Al |";
        table[7][13] = "  Si |";
        table[7][14] = "  P  |";
        table[7][15] = "  S  |";
        table[7][16] = "  Cl |";
        table[7][17] = "  Ar |";
        table[7][18] = "";

        /*          ****************  */
        table[8][0] = "|22.99|";
        table[8][1] = "24.30|";
        table[8][2] = "       ";
        table[8][3] = "       ";
        table[8][4] = "       ";
        table[8][5] = "       ";
        table[8][6] = "       ";
        table[8][7] = "      ";
        table[8][8] = "      ";
        table[8][9] = "      ";
        table[8][10] = "   ";
        table[8][11] = "   ";
        table[8][12] = "|26.98|";
        table[8][13] = "28.08|";
        table[8][14] = "30.97|";
        table[8][15] = "32.06|";
        table[8][16] = "35.45|";
        table[8][17] = "39.94|";
        table[8][18] = "";

        /*  radif 4rom jadval */
        table[9][0] = "|   19|";
        table[9][1] = "   20|";
        table[9][2] = "   21|";
        table[9][3] = "   22|";
        table[9][4] = "   23|";
        table[9][5] = "   24|";
        table[9][6] = "   25|";
        table[9][7] = "   26|";
        table[9][8] = "   27|";
        table[9][9] = "   28|";
        table[9][10] = "   29|";
        table[9][11] = "   30|";
        table[9][12] = "   31|";
        table[9][13] = "   32|";
        table[9][14] = "   33|";
        table[9][15] = "   34|";
        table[9][16] = "   35|";
        table[9][17] = "   36|";
        table[9][18] = "";

        /*                  */
        table[10][0] = "|   K |";
        table[10][1] = "  Ca |";
        table[10][2] = "  Sc |";
        table[10][3] = "  Ti |";
        table[10][4] = "  V  |";
        table[10][5] = "  Cr |";
        table[10][6] = "  Mn |";
        table[10][7] = "  Fe |";
        table[10][8] = "  Co |";
        table[10][9] = "  Ni |";
        table[10][10] = "  Cu |";
        table[10][11] = "  Zn |";
        table[10][12] = "  Ga |";
        table[10][13] = "  Ge |";
        table[10][14] = "  As |";
        table[10][15] = "  Se |";
        table[10][16] = "  Br |";
        table[10][17] = "  Kr |";
        table[10][18] = "";

        /*                             */
        table[11][0] = "|39.09|";
        table[11][1] = "40.07|";
        table[11][2] = "44.95|";
        table[11][3] = "47.86|";
        table[11][4] = "50.94|";
        table[11][5] = "51.99|";
        table[11][6] = "54.93|";
        table[11][7] = "55.84|";
        table[11][8] = "58.93|";
        table[11][9] = "58.69|";
        table[11][10] = "63.54|";
        table[11][11] = "65.39|";
        table[11][12] = "69.72|";
        table[11][13] = "72.61|";
        table[11][14] = "74.92|";
        table[11][15] = "78.96|";
        table[11][16] = "79.90|";
        table[11][17] = "83.80|";
        table[11][18] = "";


        /*  radif 5om jadval  */
        table[12][0] = "|   37|";
        table[12][1] = "   38|";
        table[12][2] = "   39|";
        table[12][3] = "   40|";
        table[12][4] = "   41|";
        table[12][5] = "   42|";
        table[12][6] = "   43|";
        table[12][7] = "   44|";
        table[12][8] = "   45|";
        table[12][9] = "   46|";
        table[12][10] = "   47|";
        table[12][11] = "   48|";
        table[12][12] = "   49|";
        table[12][13] = "   50|";
        table[12][14] = "   51|";
        table[12][15] = "   52|";
        table[12][16] = "   53|";
        table[12][17] = "   54|";
        table[12][18] = "";

        /*                          */
        table[13][0] = "|  Rb |";
        table[13][1] = "  Sr |";
        table[13][2] = "  Y  |";
        table[13][3] = "  Zr |";
        table[13][4] = "  Nb |";
        table[13][5] = "  Mo |";
        table[13][6] = "  Tc |";
        table[13][7] = "  Ru |";
        table[13][8] = "  Rh |";
        table[13][9] = "  Pd |";
        table[13][10] = "  Ag |";
        table[13][11] = "  Cd |";
        table[13][12] = "  In |";
        table[13][13] = "  Sn |";
        table[13][14] = "  Sb |";
        table[13][15] = "  Te |";
        table[13][16] = "  I  |";
        table[13][17] = "  XE |";
        table[13][18] = "";

        /*                 */
        table[14][0] = "|85.46|";
        table[14][1] = "87.62|";
        table[14][2] = "88.90|";
        table[14][3] = "91.24|";
        table[14][4] = "92.90|";
        table[14][5] = "95.94|";
        table[14][6] = "97.90|";
        table[14][7] = "101.0|";
        table[14][8] = "102.9|";
        table[14][9] = "106.4|";
        table[14][10] = "107.8|";
        table[14][11] = "112.4|";
        table[14][12] = "114.8|";
        table[14][13] = "118.7|";
        table[14][14] = "121.7|";
        table[14][15] = "127.6|";
        table[14][16] = "126.9|";
        table[14][17] = "131.2|";
        table[14][18] = "";

        /*  radif 6om jadval  */


        table[15][0] = "|   55|";
        table[15][1] = "   56|";
        table[15][2] = "   71|";
        table[15][3] = "   72|";
        table[15][4] = "   73|";
        table[15][5] = "   74|";
        table[15][6] = "   75|";
        table[15][7] = "   76|";
        table[15][8] = "   77|";
        table[15][9] = "   78|";
        table[15][10] = "   79|";
        table[15][11] = "   80|";
        table[15][12] = "   81|";
        table[15][13] = "   82|";
        table[15][14] = "   83|";
        table[15][15] = "   84|";
        table[15][16] = "   85|";
        table[15][17] = "   86|";
        table[15][18] = "";

        /*                           */
        table[16][0] = "|  Cs |";
        table[16][1] = "  Ba |";
        table[16][2] = "  La |";
        table[16][3] = "  Hf |";
        table[16][4] = "  Ta |";
        table[16][5] = "  W  |";
        table[16][6] = "  Re |";
        table[16][7] = "  Os |";
        table[16][8] = "  Ir |";
        table[16][9] = "  Pt |";
        table[16][10] = "  Au |";
        table[16][11] = "  Hg |";
        table[16][12] = "  Ti |";
        table[16][13] = "  Pb |";
        table[16][14] = "  Bi |";
        table[16][15] = "  Po |";
        table[16][16] = "  At |";
        table[16][17] = "  Rn |";
        table[16][18] = "";

        /*                        */
        table[17][0] = "|132.9|";
        table[17][1] = "137.3|";
        table[17][2] = "138.9|";
        table[17][3] = "178.4|";
        table[17][4] = "180.9|";
        table[17][5] = "183.8|";
        table[17][6] = "186.2|";
        table[17][7] = "190.2|";
        table[17][8] = "192.2|";
        table[17][9] = "195.0|";
        table[17][10] = "196.9|";
        table[17][11] = "200.5|";
        table[17][12] = "204.3|";
        table[17][13] = "207.2|";
        table[17][14] = "208.9|";
        table[17][15] = "208.9|";
        table[17][16] = "209.9|";
        table[17][17] = "222.0|";
        table[17][18] = "";

        /*  radif 7om jadval  */
        table[18][0] = "|   87|";
        table[18][1] = "   88|";
        table[18][2] = "  103|";
        table[18][3] = "  104|";
        table[18][4] = "  105|";
        table[18][5] = "  106|";
        table[18][6] = "  ";
        table[18][7] = "  ";
        table[18][8] = "  ";
        table[18][9] = "  ";
        table[18][10] = "  ";
        table[18][11] = "  ";
        table[18][12] = "  ";
        table[18][13] = "  ";
        table[18][14] = "  ";
        table[18][15] = "  ";
        table[18][16] = "  ";
        table[18][17] = "  ";
        table[18][18] = "";

        /*                 */
        table[19][0] = "| Fr  |";
        table[19][1] = "  Ra |";
        table[19][2] = "  Ac |";
        table[19][3] = "  Rf |";
        table[19][4] = "  Ha |";
        table[19][5] = "  Sg |";
        table[19][6] = "   ";
        table[19][7] = "   ";
        table[19][8] = "   ";
        table[19][9] = "   ";
        table[19][10] = "   ";
        table[19][11] = "   ";
        table[19][12] = "   ";
        table[19][13] = "   ";
        table[19][14] = "   ";
        table[19][15] = "   ";
        table[19][16] = "   ";
        table[19][17] = " ";
        table[19][18] = "";

        /*                        */
        table[20][0] = "|223.0|";
        table[20][1] = "226.0|";
        table[20][2] = "227.0|";
        table[20][3] = "263.1|";
        table[20][4] = "262.1|";
        table[20][5] = "266.1|";
        table[20][6] = "  ";
        table[20][7] = "  ";
        table[20][8] = "  ";
        table[20][9] = "  ";
        table[20][10] = "  ";
        table[20][11] = "  ";
        table[20][12] = "  ";
        table[20][13] = "  ";
        table[20][14] = "  ";
        table[20][15] = "  ";
        table[20][16] = "  ";
        table[20][17] = "  ";
        table[20][18] = "";

        /*   jadval tamam */
        System.out.format( "_______                                                                                               _______"+"\n");
        for (int i = 0; i < 21; i++) {
            int count = 1;
            for (int j = 0; j < 19; j++) {
                if (j == 17) {
                    System.out.format("%s%n", table[i][j]);
                } else {
                    System.out.format("%s", table[i][j]);
                }
            }
            count += i;
            if (count % 3 == 0 && i > 7 && i != 20) {
                System.out.format("_____________________________________________________________________________________________________________%n");
            }


        }
        System.out.format("_____________________________________%n");
        /*                            **********table2**************                  */
        table2[0][0] = "";
        table2[0][1] = "";
        table2[0][2] = "";
        table2[0][3] = "";
        table2[0][4] = "";
        table2[0][5] = "";
        table2[0][6] = "";
        table2[0][7] = "";
        table2[0][8] = "";
        table2[0][9] = "";
        table2[0][10] = "";
        table2[0][11] = "";
        table2[0][12] = "";
        table2[0][14] = "";
        /*   radif aval   */
        table2[1][0] = "|   58|";
        table2[1][1] = "   59|";
        table2[1][2] = "   60|";
        table2[1][3] = "   61|";
        table2[1][4] = "   62|";
        table2[1][5] = "   63|";
        table2[1][6] = "   64|";
        table2[1][7] = "   65|";
        table2[1][8] = "   66|";
        table2[1][9] = "   67|";
        table2[1][10] = "   68|";
        table2[1][11] = "   69|";
        table2[1][12] = "   70|";
        table2[1][13] = "   71|";
        table2[1][14] = "";


        /*                           */
        table2[2][0] = "|  Ce |";
        table2[2][1] = "  Pr |";
        table2[2][2] = "  Nd |";
        table2[2][3] = "  Pm |";
        table2[2][4] = "  Sm |";
        table2[2][5] = "  Eu |";
        table2[2][6] = "  Gd |";
        table2[2][7] = "  Tb |";
        table2[2][8] = "  Dy |";
        table2[2][9] = "  Ho |";
        table2[2][10] = "  Er |";
        table2[2][11] = "  Tm |";
        table2[2][12] = "  Yb |";
        table2[2][13] = "  Lu |";
        table2[2][14] = "";


        /*                        */
        table2[3][0] = "|140.1|";
        table2[3][1] = "140.9|";
        table2[3][2] = "144.2|";
        table2[3][3] = "144.9|";
        table2[3][4] = "150.3|";
        table2[3][5] = "151.9|";
        table2[3][6] = "157.2|";
        table2[3][7] = "158.9|";
        table2[3][8] = "162.5|";
        table2[3][9] = "164.9|";
        table2[3][10] = "167.2|";
        table2[3][11] = "168.9|";
        table2[3][12] = "173.0|";
        table2[3][13] = "174.9|";
        table2[3][14] = "_____________________________________________________________________________________________________________";

        /*      radif dovom   */
        table2[4][0] = "|   90|";
        table2[4][1] = "   91|";
        table2[4][2] = "   92|";
        table2[4][3] = "   93|";
        table2[4][4] = "   94|";
        table2[4][5] = "   95|";
        table2[4][6] = "   96|";
        table2[4][7] = "   97|";
        table2[4][8] = "   98|";
        table2[4][9] = "   99|";
        table2[4][10] = "  100|";
        table2[4][11] = "  101|";
        table2[4][12] = "  102|";
        table2[4][13] = "  103|";
        table2[4][14] = "";

        /*                           */
        table2[5][0] = "|  Th |";
        table2[5][1] = "  Pa |";
        table2[5][2] = "  U  |";
        table2[5][3] = "  Np |";
        table2[5][4] = "  Pu |";
        table2[5][5] = "  Am |";
        table2[5][6] = "  Cm |";
        table2[5][7] = "  Bk |";
        table2[5][8] = "  Cf |";
        table2[5][9] = "  Es |";
        table2[5][10] = "  Fm |";
        table2[5][11] = "  Md |";
        table2[5][12] = "  No |";
        table2[5][13] = "  Lr |";
        table2[5][14] = "";


        /*                        */
        table2[6][0] = "|232.0|";
        table2[6][1] = "231.0|";
        table2[6][2] = "238.0|";
        table2[6][3] = "237.0|";
        table2[6][4] = "244.0|";
        table2[6][5] = "243.0|";
        table2[6][6] = "247.0|";
        table2[6][7] = "247.0|";
        table2[6][8] = "251.0|";
        table2[6][9] = "252.0|";
        table2[6][10] = "257.0|";
        table2[6][11] = "258.0|";
        table2[6][12] = "259.1|";
        table2[6][13] = "262.1|";
        table2[6][14] = "";
        String space = "                        ";
        String border2 = "_____________________________________________________________________________________";
        System.out.format("%s%s%n%s",space,border2,space);
        for (int i = 1; i < 7; i++) {
            int count = 1;


            for (int j = 0; j < 15; j++) {
                if( j == 14 && i == 3){
                    System.out.format("%s%n%s",border2,space);
                }
                else if (j == 14 && i== 6) {
                    System.out.format("%s",border2);
                }

                else if (j == 13) {
                    System.out.format("%s%n%s", table2[i][j],space);
                }
                else {
                    System.out.format("%s", table2[i][j]);
                }


            }



        }

    }
}
