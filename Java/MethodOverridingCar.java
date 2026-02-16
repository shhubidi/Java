class Car {
    void colour() {
        System.out.println("Car has a colour");
    }

    void model() {
        System.out.println("Car has a model");
    }
}

class BMW extends Car {
    @Override
    void colour() {
        System.out.println("black colour BMW");
    }

    @Override
    void model() {
        System.out.println("top model bmw");
    }
}

class Audi extends Car {
    @Override
    void colour() {
        System.out.println("blue colour Audi");
    }

    @Override
    void model() {
        System.out.println("base model audi");
    }
}

class Tesla extends Car {
    @Override
    void colour() {
        System.out.println("red colour Tesla");
    }

    @Override
    void model() {
        System.out.println("tesla model Y");
    }
}

public class MethodOverridingCar {
    public static void main(String[] args) {

        Car c1 = new BMW();
        Car c2 = new Audi();
        Car c3 = new Tesla();

        c1.colour();
        c1.model();

        c2.colour();
        c2.model();

        c3.colour();
        c3.model();
    }
}