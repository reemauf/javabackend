public class product {
    int price;
    int count;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public product() {
    }

    public product(int price, int count) {
        this.price = price;
        this.count = count;
    }
    public int carttotal(){
        return this.count* this.price;
    }

}
