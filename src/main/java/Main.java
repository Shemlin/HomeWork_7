public class Main {
    public static
    void main(String[] args) {
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Vasilij", 10);
        cats[1] = new Cat("Bombilo", 20);
        cats[2] = new Cat("Snezhok", 25);
        Plate plate = new Plate( 40);
        for (Cat Cat : cats) {
            Cat.eat(plate);
            Cat.info();
        }
    }
}
