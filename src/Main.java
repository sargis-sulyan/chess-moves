import field.ChessField;
import figures.Rook;
import validations.ChessColorValidator;
import validations.ChessFieldValidator;
import validations.common.CommonValidator;
import validations.common.Validator;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //client request objects
        Rook rook = new Rook("red");
        Rook rook2 = new Rook("yellow");
        Rook rook3 = new Rook("white");
        Rook rook4 = new Rook("green");
        Rook rook5 = new Rook("black");

        ChessField field1 = new ChessField(1,8);
        ChessField field2 = new ChessField(7,9);

        //Validations
        List<Validator> validators = new ArrayList<>();
        //ChessFieldValidator chessFieldValidator = new ChessFieldValidator(field1);
        //ChessFieldValidator chessFieldValidator2 = new ChessFieldValidator(field2);
        ChessColorValidator chessColorValidator = new ChessColorValidator(rook.getFigureColor() + " is" + " incorrect Figure Color!",rook.getFigureColor());
        ChessColorValidator chessColorValidator2 = new ChessColorValidator(rook2.getFigureColor() + " is" + " incorrect Figure Color!",rook2.getFigureColor());
        ChessColorValidator chessColorValidator3 = new ChessColorValidator(rook3.getFigureColor() + " is" + " incorrect Figure Color!",rook3.getFigureColor());
        ChessColorValidator chessColorValidator4 = new ChessColorValidator(rook4.getFigureColor() + " is" + " incorrect Figure Color!",rook4.getFigureColor());
        ChessColorValidator chessColorValidator5 = new ChessColorValidator(rook5.getFigureColor() + " is" + " incorrect Figure Color!",rook5.getFigureColor());

        ChessFieldValidator chessFieldValidator = new ChessFieldValidator("Incorrect coordinates of Chess field !", field1);
        ChessFieldValidator chessFieldValidator2 = new ChessFieldValidator("Incorrect coordinates of Chess field !", field2);


        validators.add(chessColorValidator);
        validators.add(chessColorValidator2);
        validators.add(chessColorValidator3);
        validators.add(chessColorValidator4);
        validators.add(chessColorValidator5);

        validators.add(chessFieldValidator);
        validators.add(chessFieldValidator2);


        //start validation
        boolean isAllValid = true;
        for (Validator validator : validators) {
            if(validator.validate() == false) {
                isAllValid = false;
                if(validator instanceof CommonValidator){
                    CommonValidator commonValidator = (CommonValidator) validator;
                    System.out.println(commonValidator.getMessage());
                } else {
                    System.out.println("Something Bad In Validation Phase !");
                }
            }
        }

        if(isAllValid == false) {
            return;
        }

        //After Validation
    }
}
