// Permutations
// import java.util.*;
// public class backtracking {
//     public static void printPermutations(String str, String perm, int index) {
//         if(str.length() == 0) {
//             System.out.println(perm);
//             return;
//         }
//         for(int i=0; i<str.length(); i++) {
//             char currChar = str.charAt(i);
//             String newStr = str.substring(0,i) + str.substring(i+1);
//             printPermutations(newStr, perm+currChar, index+1);
//         }
//     }
//     public static void main(String args[]) {
//         String str = "ABC";
//         printPermutations(str, "", 0);
//     }
// }


// N-Queen problem
import java.util.*;

public class backtracking {
    public void helper(char[][] board, List<List<String>> allBoards, int row) {
        int n = board.length;
        if (row == n) {
            List<String> newBoard = new ArrayList<>();
            for (char[] b : board) {
                newBoard.add(new String(b));
            }
            allBoards.add(newBoard);
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                helper(board, allBoards, row + 1);
                board[row][col] = '.';
            }
        }
    }

    public boolean isSafe(char[][] board, int row, int col) {
        int n = board.length;
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') return false;
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }
        return true;
    }

    public List<List<String>> solveNQueen(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        helper(board, allBoards, 0);
        return allBoards;
    }

    public static void main(String[] args) {
        backtracking b = new backtracking();
        List<List<String>> res = b.solveNQueen(4);
        for (List<String> board : res) {
            for (String row : board) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}
