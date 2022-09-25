public class Ex05_1 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.printf("원기둥의 부피 : %.2f\n", circle.getVolume(5, 5));
        System.out.printf("원기둥의 겉넓이 : %.2f", circle.getArea(5, 5));
    }
}

class Circle {
    private double radius;
    private double height;

    static double getVolume(double radius, double height){
        return Math.PI * radius * radius * height;
    }
    static double getArea(double radius, double height){
        return Math.PI * radius * radius * 2 + 2 * Math.PI * radius * height;
    }
}

// 원기둥 클래스