package figures;

import field.ChessField;
import figures.common.ChessFigure;

import static util.ChessUtil.absoluteNumber;


public class Bishop extends ChessFigure {

    public Bishop(String figureColor) {
        super(figureColor);
    }

    @Override
    public boolean isValidMove(ChessField field1, ChessField field2){
        return absoluteNumber(field2.getX()-field1.getX()) == absoluteNumber(field2.getY()-field1.getY());
    }
}
