public class Main {
    public static void main(String[] args) {
        ProductService services = new ProductService();

        services.addProduct(new Product("Asus Vivobook", "Laptop", "Brown Table", 2022));
        services.addProduct(new Product("Apple keyboard", "keyboard", "Brown Table", 2022));
        services.addProduct(new Product("Logitech keyboard", "keyboard", "Brown Table", 2022));
        services.addProduct(new Product("Java Blackbook", "cable", "Brown Table", 2022));
        services.addProduct(new Product("Logi Mouse", "Mouse", "Brown Table", 2022));
        services.addProduct(new Product("Apple Mouse", "Mouse", "Brown Table", 2022));
        services.addProduct(new Product(" Mouse", "Mouse", "Brown Table", 2022));
        services.addProduct(new Product("Lenovo Mouse", "Mouse", "Brown Table", 2022));
        services.addProduct(new Product("blackbeast", "Computer", "Brown Table", 2022));

        System.out.println("===================================================");

        System.out.println("A Particular product");

        Product p = services.getProduct("Asus Vivobook");
        System.out.println(p);

        System.out.println("===================================================");
        System.out.println("A Particular text");

        List<Product> prods = services.getAllProductWithText("black");
        for (Product product : prods) {
            System.out.println(product);
        }
    }
}
