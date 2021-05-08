
package producttest;

public class ProductTest {

    public static void main(String[] args) {
        
        SortedADT sorted = new SortedLinkedList();
        
        Integer option;
        do {
            System.out.println("1 - Add a New Product.");
            System.out.println("2 - Find a Product.");
            System.out.println("3 - Remove a Product.");
            System.out.println("4 - Display All Products.");
            System.out.println("5 - Exit Application.");
            
            
            option = Input.getInteger("Option -  ");
            option = option - 1;
            
            switch (option) {
                
                case 0:
                    Product addProduct = new Product();
                    addProduct.proName = Input.getString("Enter New Product Name - ");
                    addProduct.proCode = Input.getString("Enter New Product Code - ");
                    addProduct.proStock = Input.getInteger("Enter Product Stock Amount - ");
                    
                    try{
                        sorted.insert(addProduct);
                        System.out.println("Product Inserted");
                    }
                    catch(SortedADT.NotUniqueException e){
                        System.out.println("Error - Product Code Already In Use.");
                    }
                    break;
                    
                case 1:
                    Product findProduct = new Product();
                    findProduct.proCode = Input.getString("Enter The Product Code - ");
                    
                    try{
                        System.out.println(sorted.find(findProduct)+" Was Found!");
                    }
                    catch(SortedADT.NotFoundException e){
                        System.out.println("Product Was Not Found.");
                    }
                    break;
                    
                case 2:
                    Product removeProduct = new Product();
                    removeProduct.proCode = Input.getString("Which Product Would You lIke to Remove? - ");
                    
                    try{
                        System.out.println(sorted.remove(removeProduct) +" Was Removed.");
                    }
                    catch(SortedADT.NotFoundException e){
                        System.out.println("Error - Product Does Not Exist.");
                    }
                    break;
                    
                case 3:
                    System.out.println("All Availabale Products - " + sorted);
                    break;
                    
                case 4:
                    System.out.println("Exiting!");
                    break;
                    
                default:
                    System.out.println("Invalid Option");
            }
        } while (option != 4);
    }
}
