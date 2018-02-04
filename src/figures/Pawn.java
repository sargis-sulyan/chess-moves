package figures;

import field.ChessField;
import figures.common.ChessFigure;
import figures.common.FigureColor;

public class Pawn extends ChessFigure{
    public Pawn(String figureColor) {
        super(figureColor);
    }

    @Override
    public boolean isValidMove(ChessField field1, ChessField field2) {
        if (getFigureColor() == "white")
            return field2.getX() - field1.getX() == 1 && field1.getX() != 1;
        return field2.getX() - field1.getX() == -1 && field1.getX() != 8;
    }
}
