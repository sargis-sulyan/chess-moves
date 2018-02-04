package figures.common;

import field.ChessField;

public abstract class ChessFigure {
    String figureColor;

    public ChessFigure(String figureColor) {
        this.figureColor = figureColor;
    }

    public String getFigureColor() {
        return figureColor;
    }

    public void setFigureColor(String figureColor) {
        this.figureColor = figureColor;
    }

    public abstract boolean isValidMove(ChessField field1, ChessField field2);
}
