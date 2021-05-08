
package pettest;

public class PetTest {
 
    public static void main(String[] args) {
        
        SortedADT sorted = new BinarySearchTree();
        String pet = new String();
        
        
        Integer option;
        do {
            System.out.println("1 - Add a New Type of Pet!");
            System.out.println("2 - Find Products for a Specific Type of Pet.");
            System.out.println("3 - Display a Specific Pet.");
            System.out.println("4 - Remove a Specific Pet.");
            System.out.println("5 - Display All Pets!");
            System.out.println("6 - Exit Application.");
            
            
            option = Input.getInteger("Option -  ");
            option = option - 1;
            
            switch (option) {
                
                case 0:
                    
                    pet=Input.getString("Enter New Pet Type Name - ");
                    try{
                        sorted.insert(pet);
                        System.out.println("Inserted");
                    }
                    catch(SortedADT.NotUniqueException e){
                        System.out.println("Insert Invalid - Pet Type Already Exists.");
                    }
                    break;
                    
                case 1:
                    
                    pet=Input.getString("What Type of Pet Are You Searching For? - ");
                    try{
                        pet=(String) sorted.find(pet);
                        System.out.println(pet+" Was Found!");
                    }
                    catch(SortedADT.NotFoundException e){
                        System.out.println("Pet Type Not Found.");
                    }
                    break;
                    
                case 2:
                    
                    pet=Input.getString("Display a Pet Type! - ");
                    try{
                        pet=(String) sorted.find(pet);
                        System.out.println("Was This The Pet You Were Looking For?");
                        System.out.println(pet);
                    }
                    catch(SortedADT.NotFoundException e){
                        System.out.println("Pet Type Not Found.");
                    }
                    break;
                    
                case 3:
                    
                    pet=Input.getString("Which Pet Type Would You lIke to Remove? - ");
                    try{
                        pet=(String) sorted.remove(pet);
                        System.out.println(pet+" Was Removed.");
                    }
                    catch(SortedADT.NotFoundException e){
                        System.out.println("Remove Invalid - Pet Type Does Not Exist.");
                    }
                    break;
                    
                case 4:
                    
                    System.out.println(((BinarySearchTree)sorted).getTraversals());
                    break;
                    
                case 5:
                    
                    System.out.println("Exiting!");
                    break;
                    
                default:
                    System.out.println("Invalid Option");
            }
        } while (option != 5);
    }
}
    

