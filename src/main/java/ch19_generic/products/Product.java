package ch19_generic.products;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Product<T> {
    private String productName;
    private T productInfo;

    @Override
    public String toString() {
        return "Product(" + "productName=" + productName + ", productInfo=" + productInfo + ")";
    }
}
