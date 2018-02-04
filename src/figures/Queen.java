package figures;

import field.ChessField;
import figures.common.ChessFigure;

public class Queen extends ChessFigure {
    public Queen(String figureColor) {
        super(figureColor);
    }

    @Override
    public boolean isValidMove(ChessField field1, ChessField field2) {
        Bishop bishop = new Bishop("");
        Rook rook = new Rook("");
        return bishop.isValidMove(field1, field2) || rook.isValidMove(field1, field2);
    }
}
