package HomeWork.HW6.documentManagementSystem;

public class DeliveryContracts extends Document implements ShowAllInformation {
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
        System.out.println("Номер документа сотрудника - "+idDocument);

    }

    @Override
    public void showAllInformation() {
        System.out.println("Номер документа: "+idDocument
                + "\nДата документа: " +dateOfDocument
                + "\nТип товара: " + typeOfProduct
                + "\nКолличествоо товара: " +itemQuantity);
    }
}
