package validations;

import field.ChessField;
import validations.common.CommonValidator;
import validations.common.Validator;

public class ChessFieldValidator extends CommonValidator implements Validator {
     private ChessField field;

    public ChessFieldValidator(String message, ChessField field) {
        super(message);
        this.field = field;
    }

    @Override
    public boolean validate(){
        return field.getX()>=1 && field.getX()<=8 && field.getY()>=1 && field.getY()<=8;
    }
}
