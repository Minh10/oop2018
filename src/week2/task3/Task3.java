package week2.Company;

  public class Company {
    private String name;
    private int product;// so luong san pham
    private float cost;// gia 1 san pham;
    private float salary;//tien luong

    public void setProduct(int product) {
        this.product = product;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(float monney) {
        this.salary = monney;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public int getProduct() {
        return product;
    }

    public String getName() {
        return name;
    }

    public float getSalary() {
        return salary;
    }

    public float getCost() {
        return cost;
    }
    public  Company(){
        name = "Minh";
        product = 100;
        cost = 10;
        salary = 5;
    }
    public Company(String name, int product, float cost, float monney){
        this.name = name;
        this.product = product;
        this.cost = cost;
        this.salary = monney;
    }
    public void info(){
        System.out.println(name + " " + salary);
    }

}

}

//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới
