package ZZZ_FunTestThings;

public class Board {
    Entity[][] board;

    public Board(int size) {
        board = new Entity[size][size];
    }

    public void placeEntity(Entity e, int r, int c) {
        board[r][c] = e;
    }

    public void swap(int r1, int c1, int r2, int c2) {
        Entity temp = board[r1][c1];
        board[r1][c1] = board[r2][c2];
        board[r2][c2] = temp;
    }

    public String toString() {
        String str = "";
        String border = "";
        for(int i = 0; i < (board[0].length * 3) + 4; i++) {
            border += "─";
        }
        str += border + "\n";
        for(int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (j == 0) {
                    str += "|  ";
                }
                if (board[i][j] != null) {
                    str += board[i][j];
                } else {
                    str += "•";
                }
                str += "  ";
                if (j == board[0].length - 1) {
                    str += "|";
                }
            }
            str += "\n";
        }
        str += border;
        return str;
    }
}
