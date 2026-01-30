interface AbstractBurger {
    void prepare();
}

interface GarlicBread {
    void prepare();
}

class AbstractBasicBurger implements AbstractBurger {
    public void prepare() {
        System.out.println("Your basic burger is ready!!!");
    }
}

class AbstractStandardBurger implements AbstractBurger {
    public void prepare() {
        System.out.println("Your standard burger is ready!!!");

    }
}

class AbstractPremiumBurger implements AbstractBurger {
    public void prepare() {
        System.out.println("Your premium burger is ready!!!");

    }
}

class AbstractBasicBread implements GarlicBread {
    public void prepare() {
        System.out.println("Your basic garlic bread is ready!!!");
    }
}

class AbstractStandardBread implements GarlicBread {
    public void prepare() {
        System.out.println("Your standard garlic bread is ready!!!");

    }
}

class AbstractPremiumBread implements GarlicBread {
    public void prepare() {
        System.out.println("Your premium garlic bread is ready!!!");

    }
}

class AbstractBasicWheatBurger implements AbstractBurger {
    public void prepare() {
        System.out.println("Your basic wheat burger is ready!!!");

    }
}

class AbstractStandardWheatBurger implements AbstractBurger {
    public void prepare() {
        System.out.println("Your standard wheat burger is ready!!!");

    }
}

class AbstractPremiumWheatBurger implements AbstractBurger {
    public void prepare() {
        System.out.println("Your premium wheat burger is ready!!!");
    }
}

class AbstractBasicWheatBread implements GarlicBread {
    public void prepare() {
        System.out.println("Your basic wheat garlic bread is ready!!!");
    }
}

class AbstractStandardWheatBread implements GarlicBread {
    public void prepare() {
        System.out.println("Your standard wheat garlic bread is ready!!!");

    }
}

class AbstractPremiumWheatBread implements GarlicBread {
    public void prepare() {
        System.out.println("Your premium wheat garlic bread is ready!!!");

    }
}

interface MealFactory {
    AbstractBurger createBurger(String type);
    GarlicBread creteGarlicBread(String type);
}

class AbstractKingBurger implements MealFactory {
    public AbstractBurger createBurger(String type) {
        if (type.equals("basic")) {
            return new AbstractBasicBurger();
        } else if (type.equals("standard")) {
            return new AbstractStandardBurger();
        } else {
            return new AbstractPremiumBurger();
        }
    }

    public GarlicBread creteGarlicBread(String type) {
        if (type.equals("basic")) {
            return new AbstractBasicBread();
        } else if (type.equals("standard")) {
            return new AbstractStandardBread();
        } else {
            return new AbstractPremiumBread();
        }
    }
}

class AbstractSinghBurger implements MealFactory {
    public AbstractBurger createBurger(String type) {
        if (type.equals("basic")) {
            return new AbstractBasicWheatBurger();
        } else if (type.equals("standard")) {
            return new AbstractStandardWheatBurger();
        } else {
            return new AbstractPremiumWheatBurger();
        }
    }

    public GarlicBread creteGarlicBread(String type) {
        if (type.equals("basic")) {
            return new AbstractBasicWheatBread();
        } else if (type.equals("standard")) {
            return new AbstractStandardWheatBread();
        } else {
            return new AbstractPremiumWheatBread();
        }
    }
}


public class AbstractFactoryMethod {
    public static void main(String[] args) {
        MealFactory factory = new AbstractKingBurger();
        AbstractBurger burger = factory.createBurger("premium");
        GarlicBread bread = factory.creteGarlicBread("premium");
        burger.prepare();
        bread.prepare();
    }

}
