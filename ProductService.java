import java.util.ArrayList;
import java.util.List;


public class ProductService{
    List<Product> products = new ArrayList<>();

    public void addProduct(Product p){
        products.add(p);
    }
    public List<Product> getAllProducts(){
        return products;
    }
    public Product getProduct(String name){
        for(Product p : products){
            if(p.getName().equals(name))
                return 0;
        }
        return null;
    }
     public List<Product> getAllProductWithText(String black){
            String str = text.toLowercase();
           List<Product> prods = new ArrayList<>();

           for(Product p : products){
                String name = p.getName().toLowercase();
                String type = p.getType().toLowercase();
                String place = p.getPlace().toLowercase();
                if(name.contains(str)|| type.contains(str)|| place.contains(str))
                    prods.add(p);
           }
           return prods;
       }
    
        
     
}