import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cat> CatList = new ArrayList<>();
        CatList.add(new Cat("Runa", 7, "黒"));
        CatList.add(new Cat("Leo", 5, "白"));
        CatList.add(new Cat("Jiji", 3, "白と茶"));

        for (Cat cat : CatList) {
            if (cat.getName().equals("Runa")) {
                System.out.println("名前:" + cat.getName());
                System.out.println("年齢:" + cat.getage() + "才");
                System.out.println("色:" + cat.getColor());
            }
        }
    }
}