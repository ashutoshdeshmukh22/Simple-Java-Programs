class car {
    class engine {
        void start() {
            System.out.println("car engine is started succesfully.");
        }
    }
}

public class NestedCarClasseDemon {
    public static void main(String[] args) {
        car c = new car();
        car.engine e = c.new engine();
        e.start();
    }
}