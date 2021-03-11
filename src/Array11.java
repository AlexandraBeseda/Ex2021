public class Array11 {
    public static void main(String[] args){
        int[][]array11={{1,2},{3,4}};
        /* otherwise:
int[][] array = new int[2][2];

		array11[0][0] = 1;
		array11[0][1] = 2;
		array11[1][0] = 3;
		array11[1][1] = 4;
         */
        for(int i=0;i<array11.length;i++){
            for(int j=0;j<array11[i].length;j++){
                System.out.print(array11[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
