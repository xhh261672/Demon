import java.util.HashMap;

/**
 * Created by Administrator on 2015/2/7.
 */
public class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.clear();
        int m = board.length, n = board.length;
        for (int i = 0; i < m; i++){

            for (int j = 0; j < n; j++){
                if (board[i][j] == '.') continue;
                if (map.containsKey(board[i][j])){
                    int row = map.get(board[i][j]);
                    if (row == i) return false;
                }
                map.put(board[i][j], i);
            }
        }

        map.clear();
        for (int j = 0; j < n; j++){
            for (int i = 0; i < m; i++){
                if (board[i][j] == '.') continue;
                if (map.containsKey(board[i][j])){
                    int col = map.get(board[i][j]);
                    if (col == j) return false;
                }
                map.put(board[i][j], j);
            }
        }

        map.clear();
        for (int box = 0; box < 9; box ++){
            for (int i = (box/3)*3; i < (box/3)*3+3; i++){
                for (int j = (box%3)*3; j < (box%3)*3+3; j++){
                    if (board[i][j] == '.') continue;
                    if (map.containsKey(board[i][j])){
                        int b = map.get(board[i][j]);
                        if (b == box) return false;
                    }
                    map.put(board[i][j], box);
                }
            }
        }

        return true;
    }

    public boolean isValidSudoku2(char [][]board){
        boolean [][]flag1 = new boolean[9][9];
        boolean [][]flag2 = new boolean[9][9];
        boolean [][]flag3 = new boolean[9][9];

        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                if (board[i][j] != '.'){
                    int num = board[i][j] - '0' - 1;
                    int box = 3*(i/3) + j/3;
                    if (flag1[i][num] || flag2[j][num] || flag3[box][num]) return false;
                    flag1[i][num] = flag2[j][num] = flag3[box][num] = true;
                }
            }
        }

        return true;
    }

}
