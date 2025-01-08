
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        int row = 0;
        int col = size / 2;
        square.placeValue(row, col, 1);

        for (int number = 2; number <= size * size; number++) {
            int nextRow = (row - 1 + size) % size;
            int nextCol = (col + 1) % size;

            if (square.readValue(nextRow, nextCol) != 0) {
                nextRow = (row + 1) % size;
                nextCol = col;
            }

            row = nextRow;
            col = nextCol;
            square.placeValue(row, col, number);
        }

        return square;
    }

}
