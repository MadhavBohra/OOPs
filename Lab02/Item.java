public class Item {
    private String itemName;
    private String itemidNo;
    private int itemQuantity;
    private double itemPrice;

        // Constructors
        public Item(String itemName, String itemidNo, int itemQuantity, double itemPrice) {
            this.itemName = itemName;
            this.itemidNo = itemidNo;
            this.itemQuantity = itemQuantity;
            this.itemPrice = itemPrice;
        }
    
        public Item(String itemName, String itemidNo, int itemQuantity) {
            this(itemName, itemidNo, itemQuantity, 500.0); // Default itemPrice is 500.0
        }
    
        public Item(String itemName, String itemidNo) {
            this(itemName, itemidNo, 1, 500.0); // Default itemQuantity is 1, and default itemPrice is 500.0
        }
    
        // Accessor methods
        public String getItemName() {
            return itemName;
        }
    
        public String getItemidNo() {
            return itemidNo;
        }
    
        public int getItemQuantity() {
            return itemQuantity;
        }
    
        public double getItemPrice() {
            return itemPrice;
        }
    
        // Mutator methods
        public void setItemName(String itemName) {
            this.itemName = itemName;
        }
    
        public void setItemidNo(String itemidNo) {
            this.itemidNo = itemidNo;
        }
    
        public void setItemQuantity(int itemQuantity) {
            this.itemQuantity = itemQuantity;
        }
    
        public void setItemPrice(double itemPrice) {
            this.itemPrice = itemPrice;
        }
}
