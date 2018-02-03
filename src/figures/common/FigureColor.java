package figures.common;

public enum FigureColor {
    WHITE("white"),
    BLACK("black");


    private String color;

    FigureColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
