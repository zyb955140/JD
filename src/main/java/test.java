public class test {
    private String title;
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public test(String title,double price){
        setPrice(price);
        setTitle(title);
    }
    public void getInfo(){
        System.out.println("图书名称："+title+"价格"+price);
    }

}
