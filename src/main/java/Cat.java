public class Cat {
    private String name;
    private int appetite;
    private boolean hungry;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.hungry = true;
    }

    public void info() {
        String isHungry = !hungry ? "сыт" : "голоден";
        System.out.println(name + ": " + isHungry );
    }

    public void eat(Plate plate) {
        if (hungry && plate.decreaseFood(appetite))
            hungry = false;
    }
}
