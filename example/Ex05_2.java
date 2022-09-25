public class Ex05_2 {
    public static void main(String[] args) {
        Food food = new Food();
        food.toString("치킨", 18000);
        food.toString("피자", 28000);
    }
}

class Food {
    private String name;
    private int price;

    static void toString(String name, int price){
        System.out.println("name : " + name + ", price : " + price + "원");
    }
}

// Food 클래스