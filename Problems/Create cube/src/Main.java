import java.util.Arrays;

class ArrayOperations {

    public static void main (String[] args) {
        System.out.println(Arrays.deepToString(createCube()));
    }

    public static int[][][] createCube() {
        // write your code here
        int target = 3;
        int[][][] cube = new int[target][target][target];
        int n = 0;
        for (int i = 0; i < cube.length; i++) {
            for (int j = 0; j < cube[i].length; j++) {
                for (int k = 0; k < cube[i][j].length; k++) {
                    cube[i][j][k] = n;
                    n++;
                }

            }
            n = 0;
        }

        return cube;

    }
}
