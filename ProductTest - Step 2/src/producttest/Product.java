
package producttest;

public class Product implements Comparable<Product> {
    
    String proName;
    String proCode;
    Integer proStock;
    
    
    public Product () {
        
        this.proName = proName;
        this.proCode = proCode;
        this.proStock = proStock;
    }
    
    public String toString() {
        String proDetails = new String();
        proDetails += "Product Details - " +
                        "Product Name = " + this.proName +
                        ", Product Code = " + this.proCode +
                        ", Product Stock = " + this.proStock;
        return proDetails;
    }

    public int compareTo(Product object) {
            return this.proCode.compareTo(object.proCode);
        }
}

