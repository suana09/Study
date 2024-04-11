package testProject;

public class ProductDTO {
    private String name;
    private String price;


    public ProductDTO(String name, String price) {
        this.name = name;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "상품명: " + name + ",  "
                + "가격: " + price;

    }
}
