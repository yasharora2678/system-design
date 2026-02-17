public class ProductFacade {
    ProductDAO productDAO;
    public ProductFacade() {
        this.productDAO = new ProductDAO();
    }

    public void createOrder() {
        System.out.println("Creating Order");
        productDAO.selectProduct();
        productDAO.insertProduct();
        productDAO.generateInVoice();
        productDAO.sendNotification();
    }
}
