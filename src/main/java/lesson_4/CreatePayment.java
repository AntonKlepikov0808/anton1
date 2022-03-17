package lesson_4;

public class CreatePayment{
    public static void main(String[] args) {
        Payment firstPayment = new Payment("Хлеб", 12);
    }

        }

class Payment {
    private Product product;

    Payment(String nameProduct, int costProduct){
        product = new Product(nameProduct, costProduct);
    }

    class Product{
        private String nameProduct;
        private int costProduct;

        Product(String nameProduct, int costProduct){
            this.nameProduct = nameProduct;
            this.costProduct = costProduct;
        }
    }

}
