interface Burger {
    void prepare();
}

class BasicBurger implements Burger {
    public void prepare() {
        System.out.println("Your basic burger is ready!!!");
    }
}

class StandardBurger implements Burger {
    public void prepare() {
        System.out.println("Your standard burger is ready!!!");

    }
}

class PremiumBurger implements Burger {
    public void prepare() {
        System.out.println("Your premium burger is ready!!!");

    }
}

class BasicWheatBurger implements Burger {
    public void prepare() {
        System.out.println("Your basic wheat burger is ready!!!");

    }
}

class StandardWheatBurger implements Burger {
    public void prepare() {
        System.out.println("Your standard wheat burger is ready!!!");

    }
}

class PremiumWheatBurger implements Burger {
    public void prepare() {
        System.out.println("Your premium wheat burger is ready!!!");
    }
}


interface Factory {
    Burger createBurger(String type);
}

class KingBurger implements Factory {
    public Burger createBurger(String type) {
        if (type.equals("basic")) {
            return new BasicBurger();
        } else if (type.equals("standard")) {
            return new StandardBurger();
        } else {
            return new PremiumBurger();
        }
    }
}

class SinghBurger implements Factory {
    public Burger createBurger(String type) {
        if (type.equals("basic")) {
            return new BasicWheatBurger();
        } else if (type.equals("standard")) {
            return new StandardWheatBurger();
        } else {
            return new PremiumWheatBurger();
        }
    }
}


public class FactoryMethod {
    public static void main(String[] args) {
        Factory factory = new KingBurger();
        Burger burger = factory.createBurger("premium");
        burger.prepare();
    }

}

