public class Customer {
    private String name;
    private String idNo;
    private double balance;
    private Item item;


    // no static void // because consturctor don't have a return type like a method not even void
     // no static because static means it belongs to the class and not to an instance of the class
        public Customer(String name, String idNo, double balance) {
            this.name = name;
            this.idNo = idNo;
            this.balance = balance;
        }
    
        public Customer(String name, String idNo) {
            this(name, idNo, 5000.0); // Default balance is 5000.0
        }
    
        // Accessor methods
        public String getName() {
            return name;
        }
    
        public String getIdNo() {
            return idNo;
        }
    
        public double getBalance() {
            return balance;
        }
    
        // Mutator methods
        public void setName(String name) {
            this.name = name;
        }
    
        public void setIdNo(String idNo) {
            this.idNo = idNo;
        }
    
        // Method to print details of the purchased item and customer's balance
        public void print() {
            if (item != null) {
                System.out.println("Item Details:");
                System.out.println("Item Name: " + item.getItemName());
                System.out.println("Item ID: " + item.getItemidNo());
                System.out.println("Item Quantity: " + item.getItemQuantity());
                System.out.println("Item Price: $" + item.getItemPrice());
                System.out.println("Customer Balance: $" + balance);
            } else {
                System.out.println("No item purchased yet.");
            }
        }
    
        // Method to buy an item
        public void buyItem(Item item) {
            if (item != null && item.getItemQuantity() >= 1) {
                double totalCost = item.getItemQuantity() * item.getItemPrice();
                if (balance >= totalCost) {
                    this.item = item;
                    balance -= totalCost;
                    System.out.println("Item purchased successfully.");
                } else {
                    System.out.println("Insufficient balance.");
                }
            } else {
                System.out.println("Order is not valid.");
            }
    }



public static void main(String[] args) {
    // Example of using the Customer class
    Customer customer = new Customer("John Doe", "C123", 7000.0);
    Item itemToBuy = new Item("Laptop", "L123", 1, 1200.0);

    customer.buyItem(itemToBuy);
    customer.print();
}
}