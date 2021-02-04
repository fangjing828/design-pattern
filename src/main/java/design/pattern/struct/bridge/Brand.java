package design.pattern.struct.bridge;

public abstract class Brand {
    protected final ElectronicProduct product;

    public Brand(ElectronicProduct product) {
        this.product = product;
    }

    public abstract String description();


    public static void main(String[] args) {
        {
            Brand brand = new Midea(new Television());
            System.out.println(brand.description());
        }

        //Add new electronic product.

        {
            Brand brand = new Midea(new Fridge());
            System.out.println(brand.description());
        }

        // Add new Brand
        {
            Brand brand = new Haier(new Television());
            System.out.println(brand.description());
        }

        {
            Brand brand = new Haier(new Telephone());
            System.out.println(brand.description());
        }
    }
}
