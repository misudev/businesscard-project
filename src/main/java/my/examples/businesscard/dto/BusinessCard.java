package my.examples.businesscard.dto;

public class BusinessCard {

    private int id;
    private String name;
    private String phone;
    private String corporationName;

    public BusinessCard(){

    }

    public BusinessCard(String name, String phone, String corporationName) {
        this.name = name;
        this.phone = phone;
        this.corporationName = corporationName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getcorporationName() {
        return corporationName;
    }

    public void setcorporationName(String coparationName){
        this.corporationName = coparationName;
    }


    @Override
    public String toString() {
        return "BusinessCard{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", coparationName='" + corporationName + '\'' +
                '}';
    }
}
