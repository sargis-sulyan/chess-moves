package validations;

import figures.common.FigureColor;
import validations.common.CommonValidator;
import validations.common.Validator;

public class ChessColorValidator extends CommonValidator implements Validator {
    private String figureColor;

    public ChessColorValidator(String message, String color) {
        super(message);
        this.figureColor = color;
    }

    public String getFigureColor() {
        return figureColor;
    }

    public void setFigureColor(String figureColor) {
        this.figureColor = figureColor;
    }

    @Override
    public boolean validate() {
        return figureColor.equals(FigureColor.WHITE.getColor()) || figureColor.equals(FigureColor.BLACK.getColor());
    }
}
