public class Trainer {
    public static void main(String[] args) {
        Duck d = new Duck();
        System.out.println(d.speak());
        Bird b = (Bird)d;  // upcasting
        System.out.println(b.speak());
        Duck d2 = (Duck) b; // downcasting
        train(new Duck());
        // train(new Parrot());
        Animal a = new Animal();
        Bird b2 = new Bird();
    }

    private static void train(Bird bird) {
        Duck d = (Duck) bird;
        d.swim();
    }
}
