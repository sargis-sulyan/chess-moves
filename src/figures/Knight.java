package figures;

import field.ChessField;
import figures.common.ChessFigure;
import static util.ChessUtil.absoluteNumber;

public class Knight extends ChessFigure{
    public Knight(String figureColor) {
        super(figureColor);
    }

    @Override
    public boolean isValidMove(ChessField field1, ChessField field2) {
        return (absoluteNumber(field2.getX()-field1.getX()) == 2 && absoluteNumber(field2.getY()-field1.getY()) == 1)
                || (absoluteNumber(field2.getX()-field1.getX()) == 1 && absoluteNumber(field2.getY()-field1.getY()) == 2);
    }
}
