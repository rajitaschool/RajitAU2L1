public class CatRunner {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Sir Meowsalot", 9, 6.7 );
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Meowzilla", 3, 5.4);
        cat2.introduce();
        cat2.printCatInfo();


    }
}
