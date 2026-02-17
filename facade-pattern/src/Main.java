public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Facade Shop");
        ProductFacade  productFacade = new ProductFacade();
        productFacade.createOrder();
    }
}