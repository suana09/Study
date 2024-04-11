package testProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {

    List<ProductDTO> productList = new ArrayList<>();

    Scanner sin = new Scanner(System.in);
    public void addProduct(ProductDTO product) {
        productList.add(product);
    }

    public List<ProductDTO> viewProduct() {
        return productList;
    }

    public void replaceProduct(int index, ProductDTO product) {
        productList.set(index, product);
    }

    public void deleteProduct(int index) {
        productList.remove(index);
    }

    public void clearProduct(){
        productList.clear();

    }

}
