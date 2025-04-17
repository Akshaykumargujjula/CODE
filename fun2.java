public class fun2 {
    public static void main(String[] args) {
        boolean[][] array = new boolean[3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
            array[i][j] = true;
            }
        }
        rec(array, 0, 0);
    }
    static void rec(boolean[][] array, int row, int col){
        if(row == array.length&&col==array[0].length){
            // basically needtoprintthe  path traversed
        }
    }
    
}
