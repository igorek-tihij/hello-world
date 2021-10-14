public class Client {
    private String fio;
    private int discount;

    public Client(String fio, int discount) {
        this.fio = fio;
        this.discount = discount;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
