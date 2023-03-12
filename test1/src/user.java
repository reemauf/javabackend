public class user {
    String name;
    String address;
    int phone;

    public user(String name, String address, int phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public user() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
