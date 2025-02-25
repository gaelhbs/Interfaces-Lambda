public record Rectangle(double height, double base) implements GeometricForm{
    public double area() {
        return height * base;
    }

    @Override
    public double getArea() {
        return height * base;
    }
}
