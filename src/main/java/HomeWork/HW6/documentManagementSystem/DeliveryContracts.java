package HomeWork.HW6.documentManagementSystem;

public class DeliveryContracts extends Document{
    String typeOfProduct;
    int itemQuantity;

    public DeliveryContracts(String typeOfProduct, int itemQuantity) {
        super();
        this.typeOfProduct = typeOfProduct;
        this.itemQuantity = itemQuantity;
    }

    @Override
    public void showDate() {
        System.out.println("Дата документа: "+dateOfDocument);
    }

    @Override
    public void showId() {
        System.out.println("id документа: "+idDocument);

    }
}
