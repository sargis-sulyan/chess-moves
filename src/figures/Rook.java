package figures;

import field.ChessField;
import figures.common.ChessFigure;

public class Rook extends ChessFigure {

    public Rook(String figureColor) {
        super(figureColor);
    }

    public boolean isValidMove(ChessField field1, ChessField field2){
        if(field1.getX()-field2.getX()==0 || field1.getY()-field2.getY()==0){
            return true;
        }
        return false;
    }

    //Commented By Armen
}
