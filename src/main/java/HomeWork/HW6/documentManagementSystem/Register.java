package HomeWork.HW6.documentManagementSystem;

public class Register {
    Document[] docRegister;

    public Register() {
        this.docRegister = new Document[10];
    }
    public Register(int size) {
        this.docRegister = new Document[size];
    }


    public boolean checkFreeSpace(){
        for (Document document : docRegister) {
            if (document == null) {
                return true;
            }
        }
         return false;
    }
    public void putDocumet(Document document) {
        if(checkFreeSpace()) {
            for (int i = 0; i < docRegister.length; i++) {
                if (docRegister[i] == null) {
                    docRegister[i] = document;
                    break;
                }
            }
        } else if(!checkFreeSpace()) {
            System.out.printf("Нет свободного места в регистре,  " +
                    "           \nдокумент c номером id %d не может быть записан в регистр\n",
                                document.idDocument);}

    }

    public void showAllDocuments(){
        for(int i = 0; i < docRegister.length; i++){
            if(docRegister[i] != null) {
                docRegister[i].showAllInformation();
                System.out.println(" ");
            }

        }

    }

    public void showDocument(int index){
        docRegister[index].showAllInformation();
    }


}
