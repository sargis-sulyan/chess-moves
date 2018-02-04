package figures;

import field.ChessField;
import figures.common.ChessFigure;

public class Knight extends ChessFigure{
    public Knight(String figureColor) {
        super(figureColor);
    }

    @Override
    public boolean isValidMove(ChessField field1, ChessField field2) {
        return false;
    }
}
