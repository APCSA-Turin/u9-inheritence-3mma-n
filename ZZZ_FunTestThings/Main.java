package ZZZ_FunTestThings;

public class Main {
    public static void main(String[] args) {

        Board board = new Board(6);
        board.placeEntity(new Entity(), 0, 0);
        board.placeEntity(new Entity(), 1, 5);
        board.placeEntity(new Entity("@"), 4, 3);
        System.out.println(board);
        board.swap(4, 3, 3, 3);
        System.out.println(board);
    }
}
