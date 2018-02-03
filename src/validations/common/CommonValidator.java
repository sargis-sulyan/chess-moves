package validations.common;

public class CommonValidator {
    private String message;

    public CommonValidator(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
