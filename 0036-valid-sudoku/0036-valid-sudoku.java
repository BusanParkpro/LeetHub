class Solution {
    public boolean isValidSudoku(char[][] board) {
        int R = board.length;
        int C = board[0].length;
        
        for(int i=0; i < R; i++){
            boolean[] numbers = new boolean[10];
            for(int j=0; j < C; j++){
                if(board[i][j] != '.'){
                    if(!numbers[board[i][j]-'0']){
                        numbers[board[i][j]-'0'] = true;
                    }else{
                        return false;
                    }                     
                }               
               
            }
        }
        
        for(int i=0; i < C; i++){
            boolean[] numbers = new boolean[10];
            for(int j=0; j < R; j++){
                if(board[j][i] != '.'){
                    
                    if(!numbers[board[j][i]-'0']){
                        numbers[board[j][i]-'0'] = true;
                    }else{
                        return false;
                    }                   
                }                 
            }
            
        }

        for (int i = 0; i < 9; i+=3) {
            for (int j = 0; j < 9; j+=3) {
                if(!areaCalc(i,j,board)) return false;
            }
        }
        return true;
        
        
    }
    
    public boolean areaCalc(int y, int x, char[][] board) {
        boolean[] numbers = new boolean[10];
        for (int i = y; i < y+3; i++) {
            for (int j = x; j < x+3; j++) {
                if(board[i][j] != '.') {
                    if(!numbers[board[i][j]-'0']){
                        numbers[board[i][j]-'0'] = true;
                    }else{
                        return false;
                    }  
                }

            }
        }
        return true;
    }
}