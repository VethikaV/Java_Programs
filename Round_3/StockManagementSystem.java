// inporting the required packages


import java.util.*;
    // edu product class define panurathu
    class Product{
        int productId;
        String productName;
        double price;
        Suplier suplier;

        Product (int productId, String productName, double price, Suplier suplier){
            this.productId =productId;
            this.productName=productName;
            this.price= price;
            this.suplier=suplier;
        }

        @override
        public String toString(){
            return "ProductId"+ productId +",Name"+productName +",Price"+price+",Suplier"+ suplier;
        }
    }
    //edu sales class define panurathu
    class Sales{
        int salesId;
        Product product;
        int quantitysold;
        double salesprice;

        Sales(int salesId, Product product, int quantitysold, double salesprice){
            this.salesId=salesId;
            this.product= product;
            this.quantitysold=quantitysold;
            this.salesprice=salesprice;
        }
        @Override
        public String toString(){
            return "salesId"+ salesId +", Product" + product +",quantitysold"+quantitysold + ",salesprice"+ salesprice;
        }
    }
    // suplier class vechi panurathu
    class Supplier{
        int supplierId;
        String supplierName;

        Supplier(int supplierId, String supplierName){
            this.supplierId=supplierId;
            this.supplierName=supplierName;
        }
        @Override
        public String toString(){
            return "supplierId"+ supplierId +",supplierName"+supplierName;
        }
    }
    class Stock{
        int stockId;
        Product product;
        int quantity;
        int thresoldquantity;

        Stock(int stockId, Product product, int quantity, int thresoldquantity){
            this.stockId = stockId;
            this.product=product;
            this.quantity=quantity;
            this.thresoldquantity=thresoldquantity;
        }
        // check stock availability

        public boolean stockavailabilitycheck(int quantityrequest){
            return quantity>=quantityrequest;
        }

        public int restock(int quantityadded){
            return quantity+=quantityadded;
        }

        public int  updatestock(int quantitysold){
            return quantity-=quantitysold;
        }
        @Override
        public String toString(){
            return "stockId" + stockId +", Product"+ product +", Quantitiy"+ quantity + ", ThresoldQuantity" + thresoldquantity;
        }
    }
    // this class is used to check the transaction type....sales, restock update...qns la kuduthatha satisfy pana use panurathu
    class TransactionHistory{
        int transactionId;
        Stock stock;
        String transactiontype;
        int quantitychanged;

        TransactionHistory(int transactionId, Stock stock, String transactiontype, int quantitychanged){
            this.transactionId=transactionId;
            this.stock=stock;
            this.transactiontype =transactiontype;
            this.quantitychanged=quantitychanged;
        }
        @Override
        public String toString(){
            return "TransationId"+ transationId +", stock" + stock + ", transaction type"+ transactiontype +"quantitychanged"+ quantitychanged;
        }
    }

    
class StockManagementSystem{

// ellame store panurathu ku vechirukom
    static ArrayList products = new ArrayList<>();
    static ArrayList stocks= new ArrayList<>();
    static ArrayList saleslist = new ArrayList<>();
    static ArrayList transactionhistory = new ArrayList<>();

    static Scanner sc = new Scanner(System.in);
    static int productcounter =1;
    static int  stockcounter =1;
    static int  salescounter=1;
    static int transactioncounter =1;
    // edu dhan main class

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("\n Stock Management System");
            System.out.println("1 Add Product");
            System.out.println("2 Update Product");
            System.out.println("3.Restock Product");
            System.out.println("4.Make Sales");
            System.out.println("5.View Product List");
            System.out.println("6 View Stock List");
            System.out.println("7 View Transaction History");
            System.out.println("8.Exit");
        }
        int choice =sc.nextInt();
        switch(choice){
            case 1:
                addproduct();
                break;
            case 2:
                updateproduct();
                break;
            case 3:
                restockproduct();
                break;
            case 4:
                makesales();
                break;
            case 5:
                viewproductlist();
                break;
            case 6:
                viewstocklist();
                break;
            case 7:
                viewtransationhistory();
                break;
            case 8:
                System.out.println("Exiting system");
                return;
            default:
                System.out.println("No such operation exist");
        }
    }
}
public static void addproduct(){
    // funtion to add product

    scanner.nextLine();
    // oru line vitut
    System.out.println("enter product name");
    String  name =sc.nextLine();
    // enter product price
    System.out.println("Enter product price");
    double price =sc.nextDouble();
    // update the suplier object
    Suplier supplier = new Suplier(supplierId +"supplier"+ supplierId);
     // update product in list
     Product product = new Product(productcounter++, name, price, supplier);
     products.add(product);
     System.out.println("Product is added sucessfully");

}

public static void updateproduct(){
    // funtion to update the product count and details

    System.out println(" update product");
    System.out.println("Enter the product ID");
    int productId = Scanner.nextInt();

    Product product =findbyproductId(productId);
    if(product == null){
        System.out.println("product not found");
        return;
    }
    System.out.println("Enter the quantity");
    int quantity = Scanner.nextInt();
    System.out.println("Enter the thresold quantity");
    int thresoldquantity = Scanner.nextInt();
    Stock stock = findbystockproductId(productId);
    if(stock == null){
        Stock newstock = new Stock(stockcounter++,product, quantity, thresoldquantity);
        stocks.add(newstock);
        transactionhistorylist.add(TransactionHistory(transactioncounter++,newstock, "update",quantity ));
        System.out.println("new Stock created: "+ newstock);
        
    }else{
        stock.quantity =quantity;
        stock.thresoldquantity = thresoldquantity;
        transactionhistorylist.add(TransactionHistory(transactioncounter++,stock, "update",quantity ));
        System.out.println("Updated stock: "+ stock);
    }


    }
}
public static void restockproduct(){
    // function to restock the product
    System.out.println("restock product");
    System.out.println("enter the product id");
    productId = Scanner.nextInt();
    Stock stock = findbyproductId(productId);
    if(stock == null){
        System.out.println(" no stock present");
        return;
    }
    int restockquantity=Scanner.nextInt();
    // not yet completed
    

}
public static void makesales(){
    // ffunction to make sales;
}
public static void viewproductlist(){
    //function to view product
    System.out.println("product list");
    if(products.isEmpty()){
        System.out.println(" No such product exist");
    }
    for(Product product: products){
        System.out.println(product);
    }

}
public static void viewstocklist(){
    // function view stock

    System.out.println("stock list");
    if(stocks.isEmpty()){
        System.out.println("no such stack enteries");
    }
    for(Stock stock: stocks){
        System.out.println(stock);

        if(stock.quantity<= stock.thresoldquantity){
             System.out.println("stock is getting over.....alert")
        }
    }
}
public static void viewtransactionhistory(){
    // function history of transaction

    System.out.println("Transaction History");
    if( transactionhistory.isEmpty()){
        System.out.println("No transaction is found");
    }
    for ( TransactionHistory transaction : transactionhistory){
        System.out.println( transaction);
    }
}

// finding product and stock by Id

public static Product findproductbyId(int productId){
   for(Product product: products){
  if( product.productId == productId){
    return product;
  }
   }
   return null;
}

public static Stock findstockbyProductId(int productId){
    for(Stock stock: stocks){
        if(stock.product.productId == productId){
            return stock;
        }
    }
    return null;
}