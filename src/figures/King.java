package figures;

import field.ChessField;
import figures.common.ChessFigure;

import static util.ChessUtil.absoluteNumber;

public class King extends ChessFigure {
    public King(String figureColor) {
        super(figureColor);
    }

    @Override
    public boolean isValidMove(ChessField field1, ChessField field2) {
        return absoluteNumber(field2.getX()-field1.getX()) <= 1 && absoluteNumber(field2.getY()-field1.getY()) <= 1;
    }
}
