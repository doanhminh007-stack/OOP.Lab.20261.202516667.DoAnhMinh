class Main {
    public static void main(String[] args) {
        int[][] matrix1 = {
            {43, 57, 36},
            {56, 75, 65},
            {97, 48, 59}
        };

        int[][] matrix2 = {
            {91, 38, 67},
            {86, 53, 42},
            {34, 22, 71}
        };
        
        int[][] result = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        
        System.out.println("Result of matrix addition:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
