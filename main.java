public class Main{
    public static void main(Strting[] args){
       ProductService = new ProductService();

       Product p = new Product(name:"Asus Vivobook", type:"Laptop",place:"Brown Table", warranty:2022)
       services.addProduct(p);
       services.addProduct(new Product(name:"Asus Vivobook", type:"Laptop",place:"Brown Table", warranty:2022));
       services.addProduct(new Product(name:"Apple keyboard", type:"keyboard",place:"Brown Table", warranty:2022));
       services.addProduct(new Product(name:"Logitech keyboard", type:"keyboard",place:"Brown Table", warranty:2022));
       services.addProduct(new Product(name:"Java Blackbook", type:"cable",place:"Brown Table", warranty:2022));
       services.addProduct(new Product(name:"Logi Mouse", type:"Mouse",place:"Brown Table", warranty:2022));
       services.addProduct(new Product(name:"Apple Mouse", type:"Mouse",place:"Brown Table", warranty:2022));
       services.addProduct(new Product(name:" Mouse", type:"Mouse",place:"Brown Table", warranty:2022));
       services.addProduct(new Product(name:"Lenovo Mouse", type:"Mouse",place:"Brown Table", warranty:2022));
       services.addProduct(new Product(name:"blackbeast", type:"Computer",place:"Brown Table", warranty:2022));


    //    List<Product> products = services.getAllProducts();
    //    for(Product p: products){
    //         System.out.println(p);
    //    }
       
       
       System.out.println("===================================================");

       System.out.println("a Particular product");

       Product p = service.getProduct(name:"Asus Vivobook");
       System.out.println(p);

       System.out.println("===================================================");
       System.out.println("a Particular text");

       List<Product> prods = service.getAllProductWithText(black:"black");
       for(Product product : prods){
        System.out.println(product);
       }

    }
}