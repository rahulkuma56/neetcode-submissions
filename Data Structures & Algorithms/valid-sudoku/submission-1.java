class Solution {
    public boolean isValidSudoku(char[][] board) {
 Map<Integer, Set<Character>> rows = new HashMap<>();
        Map<Integer, Set<Character>> cols = new HashMap<>();
        Map<String, Set<Character>> squares = new HashMap<>();

        for(int r = 0; r < board.length; r++){
            for(int c = 0; c < board[r].length; c++){
                int kr = (r/3);
                int kc = (c/3);
                String k = kr+""+kc;
                rows.putIfAbsent(r, new HashSet());
                cols.putIfAbsent(c, new HashSet());
                squares.putIfAbsent(k, new HashSet());
                if(board[r][c] =='.'){
                    continue;
                }
                if(rows.get(r).contains(board[r][c]) || 
                cols.get(c).contains(board[r][c]) || 
                squares.get(k).contains(board[r][c])){
                    return false;
                }
                //rows.putIfAbsent(r, new HashSet());
                rows.get(r).add(board[r][c]);


               // cols.putIfAbsent(c, new HashSet());
                cols.get(c).add(board[r][c]);


                //squares.putIfAbsent(k, new HashSet());
                squares.get(k).add(board[r][c]);
            }
        }
        return true;
        
    }
}


