package task02;

public class Rectangle {
    private double height; //ширина
    private double width; //длина

    public Rectangle (){
        this.height = 10;
        this.width = 25;
    }

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth (double width){
        this.width = width;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight (double height){
        this.height = height;
    }

    public double calculateArea(){
        return getHeight()*getWidth();
    }

    public double calculatePerimetr(){
        return 2*(getHeight()+getWidth());
    }

    public void greet(){
        System.out.printf("Прямоугольние с размерами %.1f (длина) и %.1f (ширина)", getWidth(), getHeight());
        System.out.println();
    }

    public void info(){
        System.out.printf("Площадь =  %.1f. Периметр = %.1f", calculateArea(), calculatePerimetr());
        System.out.println();
    }
}
