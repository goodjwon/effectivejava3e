package effective.java.chapter2.item2.javabeans;

public class NutritionFacts {
    private int sevingSize =-1;
    private int servings =-1;
    private int calories = 0;
    private int fat = 0;
    private int sodium = 0;
    private int carbohydrate = 0;

    public NutritionFacts() {
    }

    public void setSevingSize(int sevingSize) {
        this.sevingSize = sevingSize;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public void setSodium(int sodium) {
        this.sodium = sodium;
    }

    public void setCarbohydrate(int carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    public static void main(String[] args) {
        NutritionFacts cocacola = new NutritionFacts();
        cocacola.setServings(8);
        cocacola.setSevingSize(240);
        cocacola.setCalories(100);
        cocacola.setSodium(35);
        cocacola.setCarbohydrate(27);
    }
}

